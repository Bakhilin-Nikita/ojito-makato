package ru.itmo.prog.lab2.attack;

import ru.ifmo.se.pokemon.*;

public class BugBuzz extends SpecialMove {
    public BugBuzz() {
        super(Type.BUG, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
    }

    @Override
    protected String describe() {
        return "Использует BugBuzz..";
    }
}
