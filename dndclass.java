import java.util.Random;

public class dndclass {

    static Random random = new Random();

    public static String generateClass() {
        String[] classes = new String[] { "Artificer", "Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk",
                "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard" };
        String charClass = "";
        int index = (random.nextInt(classes.length));
        charClass = classes[index];
        return charClass;
    }
}
