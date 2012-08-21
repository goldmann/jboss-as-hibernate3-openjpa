package pl.goldmann.as7.bean;

import pl.goldmann.as7.model.Chair;

import java.util.List;

public interface Bean {
    public long getCount();
    public List<Chair> getChairs();
    public void removeChair(Long id);
    public String saveChair();
}
