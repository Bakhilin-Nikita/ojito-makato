package ru.lab3.interfaces;

import ru.lab3.enums.Chapters;
import ru.lab3.hero.heroes.*;

public interface iChapter {
    void getChapterStory(Chapters chapter, Snowflake snowflake, Gemstone gemstone, BlueEyes blueEyes);

    void twenty();

    void twentyFirst(Snowflake snowflake, Gemstone gemstone, BlueEyes blueEyes);
}
