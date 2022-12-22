package ru.lab3.hero.heroes;

import ru.lab3.enums.*;
import ru.lab3.hero.Hero;

public class Babies extends Hero {
    private static final String NAME = "Малышки";

    public Babies() {
        super(Side.GOODNESS, Gender.MALE);
    }

    public static String getName() {
        return NAME;
    }
}
