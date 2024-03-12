package face;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordlistOne = {"Blue", "Red", "grey", "Tesla", "Dodge", "Ford", "Kia", "Lexus", "Jeep", "Nissan"};
        String[] wordlistTwo = {};
        String[] wordlistThree = {"Honda", "Mazda", "Toyota", "Tesla", "Dodge", "Ford", "Kia", "Lexus", "Jeep", "Nissan"};

        int oneLength = wordlistOne.length;
        int twoLength = wordlistTwo.length;
        int threeLength = wordlistThree.length;
        // generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
// now build a phrase
        String phrase = wordlistOne[rand1] + " " + wordlistTwo[rand2]
                + " " + wordlistThree[rand3];
// print out the phrase
        System.out.println("What we need is a " + phrase);


    }


}

