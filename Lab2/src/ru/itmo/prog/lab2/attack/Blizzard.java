package ru.itmo.prog.lab2.attack;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    public Blizzard() {
        super(Type.ICE, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (Math.random() > 0.2) {
            Effect.freeze(pokemon);
        }
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        pokemon.setMod(Stat.ACCURACY, -1);
    }

    @Override
    protected String describe() {
        return "Использует Blizzard..";
    }
}
