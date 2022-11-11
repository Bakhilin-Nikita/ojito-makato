 package ru.itmo.prog.lab2.pokemon;

import ru.ifmo.se.pokemon.Type;
import ru.itmo.prog.lab2.attack.BugBuzz;
import ru.itmo.prog.lab2.attack.Confide;
import ru.itmo.prog.lab2.attack.Facade;

public class Vibrava extends Trapinch{
    public Vibrava(String name, int level) {
        super(name, level);
        setStats(50, 70, 50, 50, 50, 70);
        setType(Type.GROUND, Type.DRAGON);
        setMove(new Facade(), new Confide(), new BugBuzz());
    }
}
