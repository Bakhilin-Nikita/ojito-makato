package ru.lab3.hero.heroes;

import ru.lab3.Poetess;
import ru.lab3.enums.*;
import ru.lab3.hero.MainHero;

public class Gemstone extends MainHero {
    public Gemstone() {
        super(Side.GOODNESS, Gender.MALE);
        setPortrait(Similarity.DISTANT, Beauty.NORMAL, new Poetess("Николай Носов"));
    }
}
