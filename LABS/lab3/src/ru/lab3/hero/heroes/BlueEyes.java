package ru.lab3.hero.heroes;

import ru.lab3.Poetess;
import ru.lab3.enums.*;
import ru.lab3.hero.MainHero;

public class BlueEyes extends MainHero {
    public BlueEyes(String name) {
        super(Side.GOODNESS, Gender.MALE, name);
        setPortrait(Similarity.SIMILAR, Beauty.BEAUTIFUL, new Poetess("Николай Носов"));
    }


}
