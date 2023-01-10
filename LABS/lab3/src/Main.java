import ru.lab3.book.*;
import ru.lab3.exceptions.DigitHeroNameException;
import ru.lab3.exceptions.EmptyHeroNameException;
import ru.lab3.hero.heroes.*;
import ru.lab3.enums.*;


public class Main {
    public static void main(String[] args) {
        Snowflake snowlake = new Snowflake();
        Gemstone gemstone = new Gemstone();
        BlueEyes blueEyes = new BlueEyes();

        // lab 4
        try {
            snowlake.setName("Снежинка");
            gemstone.setName("Самоцветик");
            blueEyes.setName("Синеглазка");
            CogPin book = new CogPin(Chapters.TWENTY);
            book.getStory(snowlake, gemstone, blueEyes);
            book.setChapters(Chapters.TWENTY_FIRST);
            book.getStory(snowlake, gemstone, blueEyes);

        } catch (EmptyHeroNameException e) {
            System.out.println(e.getMessage());
        } catch (DigitHeroNameException e) {
            System.out.println(e.getMessage() + " : " + e.getName());
        }

    }
}