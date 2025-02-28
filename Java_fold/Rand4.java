import java.util.Scanner;
import java.util.Random;

public class Rand4 {

    public static Random rand = new Random();
    public static Scanner reader = new Scanner(System.in); 


    public static int maxthresh;
    public static int allyhi = 1, allymed = 1, allylow = 1;

    public static void main(String[]args){

        int rounds = 5;
        for (int i = 0; i < rounds; i++){

            System.out.print("\nRound #" + (i+1) + " "); // i+1 without brackets will print wrong values of 11, 21, 33
            if(rounds > 2){
                enemyUpdate();
            }
        }
    }
    

    public static void enemyUpdate(){
        maxthresh = allyhi + allymed + allylow;
        float lowrate = (allylow * 100) / maxthresh;
        float medrate = (allymed * 100) / maxthresh;
        float highrate = (allyhi * 100) / maxthresh;          

        
        System.out.println("Current threshold = "+ maxthresh);
        System.out.println("Chance of low roll is " + lowrate);
        System.out.println("Chance of med roll is " + medrate);
        System.out.println("Chance of high roll is " + highrate);

    }

}
