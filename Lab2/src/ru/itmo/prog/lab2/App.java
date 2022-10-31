package ru.itmo.prog.lab2;

import ru.ifmo.se.pokemon.*;
import ru.itmo.prog.lab2.pokemon.*;

public class App {
    public static void main(String[] args) {
        Battle b = new Battle();
        Feebas p1 = new Feebas("Машина",1);
        Milotic p2 = new Milotic("Кареглазка",1);
        Flygon p3 = new Flygon("Козаностра",1);
        Regice p4 = new Regice("Динозавр",1);
        Trapinch p5 = new Trapinch("Первак",1);
        Vibrava p6 = new Vibrava("Мегамозг",1);
        b.addFoe(p1);
        b.addFoe(p2);
        b.addFoe(p3);
        b.addAlly(p4);
        b.addAlly(p5);
        b.addAlly(p6);
        b.go();
    }
}
