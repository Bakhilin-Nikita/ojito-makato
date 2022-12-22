package ru.lab3.book;

import ru.lab3.enums.Chapters;
import ru.lab3.hero.heroes.*;
import ru.lab3.interfaces.iChapter;

public class Chapter implements iChapter{
    public void getChapterStory(Chapters chapter, Snowflake snowflake, Gemstone gemstone, BlueEyes blueEyes) {
        if (chapter == Chapters.TWENTY) {
            twenty();
        }
        if (chapter == Chapters.TWENTY_FIRST) {
            twentyFirst(snowflake, gemstone, blueEyes);
        }
    }

    public void twenty() {
        System.out.println("Кончилось тем, что глаза на портрете получились \nогромные, каких и не бывает, ротик -- с булавочную  головку, волосы - словно \nиз чистого золота, и \nвесь портрет имел очень отдаленное сходство.\nНо поэтессе он \nочень понравился, и она говорила, \nчто лучше  портрета ей и даром не надо.");
    }

    public void twentyFirst(Snowflake snowflake, Gemstone gemstone, BlueEyes blueEyes) {
        System.out.println("Бережно держа в руках свой портрет,\n"
                + snowflake.getClass().getSimpleName() + " "
                + snowflake.getName() + " сошла вниз и её моментально окружили "
                + Babies.getName() + ". \nВсе говорили, что ее портрет по красоте " +
                "\nгораздо лучше портретов " + gemstone.getClass().getSimpleName() + " "
                + gemstone.getName() + " и " + blueEyes.getClass().getSimpleName() + " "
                + blueEyes.getName() + " \nно по сходству он значительно хуже их!");
    }
}
