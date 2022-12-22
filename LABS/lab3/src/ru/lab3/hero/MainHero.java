package ru.lab3.hero;

import ru.lab3.*;
import ru.lab3.enums.*;

import java.util.Objects;

public abstract class MainHero extends Hero {
    private Portrait portrait;

    private String name;

    public MainHero(Side side, Gender gender, String n) {
        super(side, gender);
        this.name = n;
    }

    public void setPortrait(Similarity similarity, Beauty beauty, Poetess poetess) {
        portrait = new Portrait(similarity, beauty, poetess);
    }

    public Portrait getPortrait() {
        return portrait;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSide(), getGender(), portrait, name);
    }
}
