package ru.itmo.prog.lab2.pokemon;

import ru.ifmo.se.pokemon.Type;
import ru.itmo.prog.lab2.attack.Blizzard;
import ru.itmo.prog.lab2.attack.Facade;
import ru.itmo.prog.lab2.attack.HydroPump;
import ru.itmo.prog.lab2.attack.WaterFall;

public class Milotic extends Feebas{
    public Milotic(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(95,60,79,100,125,81);
        setMove(new Facade(), new Blizzard(), new WaterFall());
        addMove(new HydroPump());
    }
}
