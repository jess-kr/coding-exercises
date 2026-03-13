import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class dndrace {
    public static String generateRace() {
       List<String> content = new ArrayList<String>();
        Random random = new Random();
        try {
            Path path = Paths.get("races.txt");
            content = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.printf("Error reading the file: %s", e);
        }
        String[] races = new String[content.size()];

        for (int i = 0; i < content.size(); i++) {
            races[i] = content.get(i);
        }

        int index = (random.nextInt(races.length));
        String charRace = races[index];
        return charRace;
    }
}
