package ru.lab3.hero.heroes;

import ru.lab3.Poetess;
import ru.lab3.enums.*;
import ru.lab3.hero.MainHero;

public class Snowflake extends MainHero {
    public Snowflake(){
        super(Side.EVIL, Gender.MALE);
        setPortrait(Similarity.SIMILAR, Beauty.UGLY, new Poetess("Николай Носов"));
    }
}
