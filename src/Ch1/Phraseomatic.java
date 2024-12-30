package Ch1;

public class Phraseomatic {
    public static void main(String[] args) {
        //declare string list
        String[] wordlistone = {"Agnotic", "opinionated", "voice activated", "functional"};
        String[] wordlisttwo = {"Harry", "Ron", "Ginny", "Hermoine", "Draco", "Luna"};
        String[] wordlistthree = {"Almirah", "shelf", "cooler", "desk", "Pipeline", "design"};
        // find out how many words in each list;
        int onelength = wordlistone.length;
        int twolength = wordlisttwo.length;
        int threelength = wordlistthree.length;
        //choose a random word.
        java.util.Random rand = new java.util.Random();
        int rand1 = rand.nextInt(onelength);
        int rand2 = rand.nextInt(twolength);
        int rand3 = rand.nextInt(threelength);
        //geratate a random phrase;
        String phrase = wordlistone[rand1] + " " + wordlisttwo[rand2] + " " + wordlistthree[rand3];
        System.out.println(phrase);
    }
}
