package ru.itmo.prog.lab2.attack;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class WaterFall extends PhysicalMove {
    public WaterFall()
    {
        super(Type.WATER, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (!pokemon.hasType(Type.PSYCHIC)) {
            Effect.freeze(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "Использует WaterFall";
    }
}
