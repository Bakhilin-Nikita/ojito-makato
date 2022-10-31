package ru.itmo.prog.lab2.pokemon;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.prog.lab2.attack.Amnesia;
import ru.itmo.prog.lab2.attack.IcyWind;
import ru.itmo.prog.lab2.attack.Rest;
import ru.itmo.prog.lab2.attack.Swagger;

public class Regice extends Pokemon{
    public Regice(String name, int level) {
        super(name, level);
        setType(Type.ICE);
        setStats(80,50,100,100,200,50);
        setMove(new Rest(), new Swagger(), new Amnesia());
        addMove(new IcyWind());
    }
}
