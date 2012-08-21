package pl.goldmann.as7.jpa.impl;

import pl.goldmann.as7.jpa.Database;
import pl.goldmann.as7.model.Chair;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;
import java.util.List;

public abstract class AbstractDatabase implements Database {
    protected abstract EntityManager getEM();

    @Resource
    protected UserTransaction tx;

    @Override
    public List<Chair> getChairs() {
        return getEM().createQuery("select c from Chair c").getResultList();
    }

    @Override
    public long getChairsCount() {
        return (Long) getEM().createQuery("select count(c) from Chair c").getSingleResult();
    }

    @Override
    public boolean saveChair(Chair chair) {
        try {
            tx.begin();
            getEM().persist(chair);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean removeChair(Long id) {
        try {
            tx.begin();
            getEM().remove(getEM().find(Chair.class, id));
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
