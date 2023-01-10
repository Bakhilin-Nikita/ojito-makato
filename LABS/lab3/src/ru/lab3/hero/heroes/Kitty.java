package ru.lab3.hero.heroes;

import ru.lab3.enums.Gender;
import ru.lab3.enums.Side;
import ru.lab3.hero.MainHero;

public class Kitty extends MainHero {
    public Kitty() {
        super(Side.GOODNESS, Gender.FEMALE);
    }
}
