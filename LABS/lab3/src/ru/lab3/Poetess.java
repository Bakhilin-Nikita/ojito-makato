package ru.lab3;

import java.util.Objects;

public class Poetess {
    private String name;

    public Poetess() {
    }

    public Poetess(String n) {
        this.name = n;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [name=" + name + " ]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        return false;
    }
}
