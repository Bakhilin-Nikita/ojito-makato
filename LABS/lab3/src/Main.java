import ru.lab3.book.*;
import ru.lab3.hero.heroes.*;
import ru.lab3.enums.*;

public class Main {
    public static void main(String[] args) {
        Snowflake snowlake = new Snowflake("Самоцветик");
        Gemstone gemstone = new Gemstone("Белоснежка");
        BlueEyes blueEyes = new BlueEyes("Синеглазка");

        CogPin book = new CogPin(Chapters.TWENTY);
        book.getStory(snowlake, gemstone, blueEyes);
        book.setChapters(Chapters.TWENTY_FIRST);
        book.getStory(snowlake, gemstone, blueEyes);

    }
}