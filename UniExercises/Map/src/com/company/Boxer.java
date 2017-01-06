package com.company;

/**
 * Created by Bari on 1.12.2016 г..
 */
public class Boxer {
    private String name;
    private int titles;

    public Boxer(String name, int titles) {
        this.name = name;
        this.titles = titles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTitles() {
        return titles;
    }

    public void setTitles(int titles) {
        this.titles = titles;
    }


}
