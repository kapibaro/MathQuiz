package janik.kacper.mathquiz;

import java.util.Random;
// Gives random numbers
 public class RandomNumbers {

    static public int num (int a) {

        Random rand = new Random();
        int random = rand.nextInt(a) + 1;
        return random;
    }

}
