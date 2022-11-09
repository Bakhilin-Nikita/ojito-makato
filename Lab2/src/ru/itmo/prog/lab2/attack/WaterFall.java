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
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        new Effect().clear();
    }

    @Override
    protected String describe() {
        return "Использует WaterFall";
    }
}
