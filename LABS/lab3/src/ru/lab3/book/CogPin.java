package ru.lab3.book;

import ru.lab3.enums.Chapters;
import ru.lab3.hero.heroes.*;

public class CogPin extends Book {
    private Chapters chapters;
    private Chapter chapter = new Chapter();

    public CogPin(Chapters chapter) {
        super("Tanya", "Возвращение Винтика и Шпунтика");
        setChapters(chapter);
    }

    public void setChapters(Chapters chapters) {
        this.chapters = chapters;
    }

    public Chapters getChapters() {
        return this.chapters;
    }

    public void getStory(Snowflake snowflake, Gemstone gemstone, BlueEyes blueEyes) {
        System.out.println(toString());
        chapter.getChapterStory(getChapters(), snowflake, gemstone, blueEyes);
    }

    @Override
    public String toString() {
        return "Глава " + getChapters().getNumber() + ". " + getTitle();
    }
}
