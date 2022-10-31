package ru.itmo.prog.lab2.attack;

import ru.ifmo.se.pokemon.*;

public class Amnesia extends StatusMove {
    public Amnesia() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        pokemon.setMod(Stat.SPECIAL_DEFENSE, 2);
    }

    @Override
    protected String describe() {
        return "Использует Amnesia..";
    }
}
