package ru.lab3.hero;

import ru.lab3.*;
import ru.lab3.book.CogPin;
import ru.lab3.enums.*;
import ru.lab3.exceptions.*;

import java.util.Objects;

public abstract class MainHero extends Hero {
    private Portrait portrait;
    private CogPin book = new CogPin();
    private String name;

    public MainHero(Side side, Gender gender) {
        super(side, gender);
    }

    public MainHero(Side side, Gender gender, String n) {
        super(side, gender);
        this.name = n;
    }

    public class Inner_MainHero {
        public String getName() {
            return MainHero.this.name;
        }

        public Portrait getPortrait() {
            return MainHero.this.portrait;
        }
    }


    public void setPortrait(Similarity similarity, Beauty beauty, Poetess poetess) {
        portrait = new Portrait(similarity, beauty, poetess);
    }


    public void setName(String n)
            throws EmptyHeroNameException, DigitHeroNameException {
        if (n.isEmpty())
            throw new EmptyHeroNameException("Поле имя не может быть пустым!", n);
        if (checkDigitSymbols(n))
            throw new DigitHeroNameException("Поле не может содержать цифры!", n);
        this.name = n;
    }

    public boolean checkDigitSymbols(String n) {
        boolean hasDigits = false;

        for (int i = 0; i < n.length() && !hasDigits; i++) {
            if (Character.isDigit(n.charAt(i))) {
                hasDigits = true;
            }
        }

        return hasDigits;
    }


    public String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSide(), getGender(), portrait, name);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [name=" + name +
                ", portrait=" + portrait.toString() + "]";
    }
}
