//Has the basics of an adaptive AI

import java.util.Scanner;
import java.util.Random;

public class Rand3 {

    public static Random rand = new Random();
    public static Scanner reader = new Scanner(System.in); 
    
    public static int allyhi = 1;
    public static int allymed = 1;
    public static int allylow = 1;

    public static void main (String[]args){
        System.out.println("Ai begins now");


        int maxthresh;
        int randnum;

        int rounds = 5;
        for (int i = 0; i < rounds; i++){
            maxthresh = allyhi + allymed + allylow;
            float lowrate = (allylow * 100) / maxthresh;
            float medrate = (allymed * 100) / maxthresh;
            float highrate = (allyhi * 100) / maxthresh;          

            System.out.print("Round #" + (i+1) + " "); // i+1 without brackets will print wrong values of 11, 21, 33
            System.out.println("Current threshold = "+ maxthresh);
            System.out.println("Chance of low roll is " + lowrate);
            System.out.println("Chance of med roll is " + medrate);
            System.out.println("Chance of high roll is " + highrate);

            randnum = rand.nextInt(5);
            System.out.println(randnum);
            switch(randnum){
                case 0:
                    System.out.println("Attacking low!");
                    allylow++;
                    break;
                case 1:
                    System.out.println("Attacking med!");
                    allymed++;
                    break;
                case 2:
                    System.out.println("Attacking high!");
                    allyhi++;
                    break;
                default:
                    System.out.println("Defaulting to low");
                    allylow++;
                }
            }
    }
}
