package ru.itmo.prog.lab2.attack;

import ru.ifmo.se.pokemon.*;

public class DracoMeteor extends SpecialMove {
    public DracoMeteor() {
        super(Type.DRAGON, 130, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        new Effect().stat(Stat.SPECIAL_ATTACK, -2);
    }

    @Override
    protected String describe() {
        return "использует DracoMeteor..";
    }
}
