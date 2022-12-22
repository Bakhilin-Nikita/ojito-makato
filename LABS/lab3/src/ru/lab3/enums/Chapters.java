package ru.lab3.enums;

public enum Chapters {
    TWENTY("двадцатая"),
    TWENTY_FIRST("двадцать первая");

    private final String number;

    Chapters(String n) {
        this.number = n;
    }

    public String getNumber() {
        return number;
    }
}
