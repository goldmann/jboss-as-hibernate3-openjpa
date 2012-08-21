package pl.goldmann.as7.jpa;

import pl.goldmann.as7.model.Chair;

import java.util.List;

public interface Database {
    public List<Chair> getChairs();
    public long getChairsCount();
    public boolean saveChair(Chair chair);
    public boolean removeChair(Long id);
}
