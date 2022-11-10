package ru.itmo.prog.lab2.attack;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade()
    {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if(pokemon.getCondition() == Status.POISON || pokemon.getCondition() == Status.BURN || pokemon.getCondition() == Status.PARALYZE ) {
            pokemon.setMod(Stat.ATTACK, 140);
        }
    }

    @Override
    protected String describe() {
        return "Использует Facade";
    }
}
