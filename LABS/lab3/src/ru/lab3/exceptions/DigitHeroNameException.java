package ru.lab3.exceptions;

public class DigitHeroNameException extends Exception {
    private String name;

    public DigitHeroNameException(String message, String n) {
        super(message);
        this.name = n;
    }

    public String getName() {
        return this.name;
    }
}
