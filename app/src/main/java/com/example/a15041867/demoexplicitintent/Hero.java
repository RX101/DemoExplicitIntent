package com.example.a15041867.demoexplicitintent;

import java.io.Serializable;

/**
 * Created by 15041867 on 4/5/2017.
 */

public class Hero implements Serializable {
    private String name;
    private int strength;
    private int technicalProwess;

    public String getName() {
        return name;
    }
    public int getStrength() {
        return strength;
    }
    public int getTechnicalProwess() {
        return technicalProwess;
    }
    public Hero(String name, int strength,
                int technicalProwess) {
        this.name = name;
        this.strength = strength;
        this.technicalProwess = technicalProwess;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setTechnicalProwess(int technicalProwess) {
        this.technicalProwess = technicalProwess;
    }
}
