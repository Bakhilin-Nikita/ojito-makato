package ru.itmo.prog.lab2.attack;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class IcyWind extends SpecialMove {
    public IcyWind() {
        super(Type.ICE, 55, 95);
    }

    @Override
    protected String describe() {
        return "Использует IcyWind";
    }
}
