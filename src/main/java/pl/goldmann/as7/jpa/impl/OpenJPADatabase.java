package pl.goldmann.as7.jpa.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class OpenJPADatabase extends AbstractDatabase {

    @PersistenceContext(unitName = "openjpaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEM() {
        return em;
    }
}