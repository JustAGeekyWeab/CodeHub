//package Java_fold;

import java.util.Scanner;
import java.util.Random;

public class Rand1 {
    int randomNum = (int)(Math.random() * 101); // 0 to 11    

    public static void main(String[] args) {
        Random rand = new Random();

        Scanner reader = new Scanner(System.in);
        System.out.println("Insert Number Limit here: ");
        //NextInt reads the next integer from the keyboard

        int a = reader.nextInt();
        int rand1 = rand.nextInt(a);
        System.out.println("Random value is " + rand1);

    }

}


//Note to self clarify why package folder is important for java files