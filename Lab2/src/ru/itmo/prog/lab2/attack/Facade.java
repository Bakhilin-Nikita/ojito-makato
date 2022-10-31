package ru.itmo.prog.lab2.attack;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade()
    {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if(pokemon.getCondition() == Status.POISON || pokemon.getCondition() == Status.BURN || pokemon.getCondition() == Status.PARALYZE ) {
            //
        }
    }

    @Override
    protected String describe() {
        return "Использует Facade";
    }
}
