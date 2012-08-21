package pl.goldmann.as7.bean.impl;

import pl.goldmann.as7.bean.Bean;
import pl.goldmann.as7.jpa.Database;
import pl.goldmann.as7.model.Chair;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractBean implements Bean, Serializable {
    private String color;
    private double price;

    protected abstract Database getDB();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public long getCount() {
        return getDB().getChairsCount();
    }

    @Override
    public List<Chair> getChairs() {
        return getDB().getChairs();
    }

    @Override
    public void removeChair(Long id) {
        getDB().removeChair(id);
    }

    @Override
    public String saveChair() {
        if (getDB().saveChair(new Chair(color, price)))
            return "index.xhtml?faces-redirect=true";
        else
            return null;

    }
}
