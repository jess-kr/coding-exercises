public static void main(String[] args) {
    String charClass = dndclass.generateClass();
    String charRace = dndrace.generateRace();

    System.out.println("You are a " + charRace + ". And your class is: " + charClass);
}
