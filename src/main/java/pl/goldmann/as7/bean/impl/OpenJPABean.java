package pl.goldmann.as7.bean.impl;

import pl.goldmann.as7.jpa.Database;
import pl.goldmann.as7.jpa.impl.OpenJPADatabase;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class OpenJPABean extends AbstractBean {

    @Inject
    private OpenJPADatabase db;

    @Override
    protected Database getDB() {
        return db;
    }
}
