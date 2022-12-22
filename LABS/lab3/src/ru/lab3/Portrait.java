package ru.lab3;

import ru.lab3.enums.*;
import ru.lab3.interfaces.iPortrait;
import java.util.Objects;

public class Portrait implements iPortrait{
    private Similarity similarity;
    private Beauty beauty;
    private Poetess poetess = new Poetess();

    public Portrait() {
    }

    public Portrait(Similarity s, Beauty b, Poetess poetess) {
        this.similarity = s;
        this.beauty = b;
        this.poetess = poetess;
    }

    public void setBeauty(Beauty b) {
        this.beauty = b;
    }

    public Beauty getBeauty() {
        return this.beauty;
    }

    public void setSimilarity(Similarity s) {
        this.similarity = s;
    }

    public Similarity getSimilarity() {
        return this.similarity;
    }

    public void setPoetess(Poetess poetess) {
        this.poetess = poetess;
    }

    public Poetess getPoetess() {
        return poetess;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        return false;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(similarity, beauty, poetess);
    }
}
