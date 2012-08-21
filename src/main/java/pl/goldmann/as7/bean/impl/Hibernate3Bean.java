package pl.goldmann.as7.bean.impl;

import pl.goldmann.as7.jpa.Database;
import pl.goldmann.as7.jpa.impl.Hibernate3Database;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class Hibernate3Bean extends AbstractBean {

    @Inject
    private Hibernate3Database db;

    @Override
    protected Database getDB() {
        return db;
    }
}
