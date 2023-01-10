package ru.lab3.hero;

import ru.lab3.enums.*;
import java.util.Objects;

public abstract class Hero {
    private Gender gender;
    private Side side;

    public Hero(Side side, Gender gender) {
        this.side = side;
        this.gender = gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public Side getSide() {
        return this.side;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, side);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
