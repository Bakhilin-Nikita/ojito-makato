package ru.lab3.book;

import ru.lab3.Portrait;
import ru.lab3.enums.Chapters;
import ru.lab3.hero.heroes.*;
import ru.lab3.interfaces.iChapter;



public class Chapter implements iChapter {
    public void getChapterStory(Chapters chapter, Snowflake snowflake, Gemstone gemstone, BlueEyes blueEyes) {
        // local class LAB 4
        class InnerGetChapterStory {
            void giveChapter() {
                if (chapter == Chapters.TWENTY)
                    twenty();
                if (chapter == Chapters.TWENTY_FIRST)
                    twentyFirst(snowflake, gemstone, blueEyes);
            }
        }

        InnerGetChapterStory inner = new InnerGetChapterStory();
        inner.giveChapter();
    }

    //inner class LAB 4
    public class ContinueStory {
        private Chapters chapter;

        ContinueStory(Chapters chapter) {
            this.chapter = chapter;
        }

        String giveContinue() {
            if (chapter == Chapters.TWENTY)
                return "Как же в синем, когда вы в зеленом? -- спросил, недоумевая "
                        + Tube.class.getSimpleName() + ". Он принялся рисовать поэтессу, а она беспрестанно вскакивала, подбегала к "
                        + Portrait.class.getSimpleName() + " и кричала:";
            else if (chapter == Chapters.TWENTY_FIRST) {
                return "В это время в комнату, запыхавшись, прибежали " + Kitty.class.getSimpleName() + " и " + Swallow.class.getSimpleName();
            } else
                return "";
        }
    }

    public void twenty() {
        ContinueStory addStory = new ContinueStory(Chapters.TWENTY);
        System.out.println(addStory.giveContinue() + "Кончилось тем, что глаза на портрете получились \nогромные, каких и не бывает, ротик -- с булавочную  головку, волосы - словно \nиз чистого золота, и \nвесь портрет имел очень отдаленное сходство.\nНо поэтессе он \nочень понравился, и она говорила, \nчто лучше  портрета ей и даром не надо.");
    }

    public void twentyFirst(Snowflake snowflake, Gemstone gemstone, BlueEyes blueEyes) {
        ContinueStory addStory = new ContinueStory(Chapters.TWENTY_FIRST);
        System.out.println("Бережно держа в руках свой портрет,\n"
                + snowflake.getClass().getSimpleName() + " "
                + snowflake.getName() + " сошла вниз и её моментально окружили "
                + Babies.getName() + ". \nВсе говорили, что ее портрет по красоте " +
                "\nгораздо лучше портретов " + gemstone.getClass().getSimpleName() + " "
                + gemstone.getName() + " и " + blueEyes.getClass().getSimpleName() + " "
                + blueEyes.getName() + " \nно по сходству он значительно хуже их!"
                + addStory.giveContinue());
    }
}
