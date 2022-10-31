package ru.itmo.prog.lab2.attack;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC,0,0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        Effect.sleep(pokemon);
    }

    @Override
    protected String describe() {
        return "Использует Rest..";
    }
}
