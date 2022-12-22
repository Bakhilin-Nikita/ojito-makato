package ru.lab3.hero.heroes;

import ru.lab3.Poetess;
import ru.lab3.enums.*;
import ru.lab3.hero.MainHero;

public class Snowflake extends MainHero {
    public Snowflake(String name) {
        super(Side.EVIL, Gender.MALE, name);
        setPortrait(Similarity.SIMILAR, Beauty.UGLY, new Poetess("Николай Носов"));
    }
}
