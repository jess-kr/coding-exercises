
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class dnd{
static Random random = new Random();
static List<String> content = new ArrayList<String>();
static String charClass;
static String charRace;

public static void main(String[] args) {
charClass = generateClass();
charRace = generateRace();

System.out.println("You are a "+charRace+". And your class is: "+charClass);
}

public static String generateClass(){
String [] classes = new String [] {"Artificer", "Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};
String charClass = "";
int index = (random.nextInt(12));
charClass = classes [index];
return charClass;
}

public static String generateRace(){

try {
Path path = Paths.get("races.txt");
content = Files.readAllLines(path);}
catch (IOException e){
    System.out.printf("Error reading the file: %s", e);
}
String [] races = new String [content.size()];

for (int i = 0;i<content.size(); i++){
    races [i] = content.get(i);
}

int index = (random.nextInt(races.length));
String charRace = races [index];
return charRace;
}

}