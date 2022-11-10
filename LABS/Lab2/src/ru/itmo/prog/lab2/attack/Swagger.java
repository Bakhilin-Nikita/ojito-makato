package ru.itmo.prog.lab2.attack;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (pokemon.getStat(Stat.ATTACK) != 6) {
            Effect.confuse(pokemon);
        }
        pokemon.setMod(Stat.ATTACK, 2);
    }

    @Override
    protected String describe() {
        return "Использует Swagger..";
    }
}
