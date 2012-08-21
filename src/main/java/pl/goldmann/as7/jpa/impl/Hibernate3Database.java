package pl.goldmann.as7.jpa.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class Hibernate3Database extends AbstractDatabase {

    @PersistenceContext(unitName = "hibernate3PU")
    protected EntityManager em;

    @Override
    protected EntityManager getEM() {
        return em;
    }
}