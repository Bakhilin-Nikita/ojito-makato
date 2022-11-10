package ru.itmo.prog.lab2.pokemon;

import ru.ifmo.se.pokemon.Type;
import ru.itmo.prog.lab2.attack.BugBuzz;
import ru.itmo.prog.lab2.attack.Confide;
import ru.itmo.prog.lab2.attack.Facade;

public class Flygon extends Vibrava{
    public Flygon(String name, int level) {
        super(name, level);
        setType(Type.GROUND, Type.DRAGON);
        setStats(80,100,80,80,80,100);
        setMove(new Facade(), new Confide(), new BugBuzz());
    }
}
