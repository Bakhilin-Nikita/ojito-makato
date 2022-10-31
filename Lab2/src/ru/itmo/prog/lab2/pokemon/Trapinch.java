package ru.itmo.prog.lab2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.prog.lab2.attack.Confide;
import ru.itmo.prog.lab2.attack.Facade;

public class Trapinch extends Pokemon {
    public Trapinch(String name, int level) {
        super(name, level);
        setType(Type.GROUND);
        setMove(new Facade(), new Confide());
    }
}
