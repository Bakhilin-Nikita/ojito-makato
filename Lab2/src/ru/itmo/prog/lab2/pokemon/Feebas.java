package ru.itmo.prog.lab2.pokemon;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.prog.lab2.attack.Blizzard;
import ru.itmo.prog.lab2.attack.Facade;
import ru.itmo.prog.lab2.attack.WaterFall;

public class Feebas extends Pokemon{
    public Feebas(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(20,15,20,10,55,80);
        setMove(new WaterFall(), new Facade(), new Blizzard());
    }
}
