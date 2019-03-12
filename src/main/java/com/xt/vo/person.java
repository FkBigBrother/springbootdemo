package com.xt.vo;

import java.util.List;
import java.util.Map;

/**
 * @author ：高欢
 * @date ：Created in 2019/3/12 18:52
 * @description：
 */
public class person {
    private String Name;
    private Boolean boss;
    private Map<Object,Object> maps;
    private List<Object> lists;

    @Override
    public String toString() {
        return "person{" +
                "Name='" + Name + '\'' +
                ", boss=" + boss +
                ", maps=" + maps +
                ", lists=" + lists +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Map<Object, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<Object, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }
}
