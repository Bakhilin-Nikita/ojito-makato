package ru.lab3.book;

import ru.lab3.enums.Chapters;
import ru.lab3.hero.heroes.*;

public class CogPin extends Book {

    private Chapters chapters;
    private Chapter chapter = new Chapter();

    public CogPin() {
    }

    public CogPin(Chapters chapter) {
        super(new InfoCogPin().getBookAuthor(), new InfoCogPin().getBookName());
        setChapters(chapter);
    }

    // inner static class LAB 4
    public static class InfoCogPin {
        private static final String BOOK_NAME = "Приключение Винтика и Шпунтика";
        private static final String BOOK_AUTHOR = "Николай Носов";
        public String getBookName() {
            return BOOK_NAME;
        }

        public String getBookAuthor() {
            return BOOK_AUTHOR;
        }

    }

    public void setChapters(Chapters chapters) {
        this.chapters = chapters;
    }

    public Chapters getChapters() {
        return this.chapters;
    }

    public void getStory(Snowflake snowflake, Gemstone gemstone, BlueEyes blueEyes) {

        //Anonymous class LAB 4
        Book innerBook = new Book() {
            @Override
            public String toString() {
                return "Глава " + getChapters().getNumber() + ". " + new InfoCogPin().getBookName();
            }
        };
        System.out.println(innerBook.toString());
        chapter.getChapterStory(getChapters(), snowflake, gemstone, blueEyes);

    }
}
