import java.util.Scanner;
import java.util.Random;

public class Rand5 {
    public static Random rand = new Random();
    public static Scanner reader = new Scanner(System.in); 

    public static int maxthresh;
    public static int allyhi = 1, allymed = 1, allylow = 1;
    public static float lowrate, medrate, highrate;
    public static int lowcount, medcount, hicount;

    public static void main(String[]args){
        enemyUpdate();
        
        lowcount = medcount = hicount = 0;

        System.out.println();
        System.out.println("Low"+lowrate);
        System.out.println("Low+Med"+(lowrate+medrate));
        System.out.println("Low+Med+High"+(lowrate+medrate+highrate));

        for(int i = 0; i < 200; i++){
            int enemy = rand.nextInt(maxthresh) +1;
            System.out.print("i:"+i+":"+enemy);
            if(i == 100){
                //allylow = allylow + 50;
                enemyUpdate();
            }
            char roll = getRoll(allylow, allymed, allyhi);
            System.out.println(": Roll value "+roll);
        }
        System.out.println("Final tally");
        System.out.println("Total Low"+ lowcount);
        System.out.println("Total Med"+ medcount);
        System.out.println("Total High"+ hicount);
    }

    //Determines what value is rolled
    public static char getRoll(int low, int med, int hi){

        int roll = rand.nextInt(maxthresh) + 1;
        if(roll < low){lowcount++; return 'l';}
        if(roll < low+med){medcount++; return 'm';}
        else{hicount++; return 'h';}
    }


    //Updates the values of the rates and the new maxthreshold
    public static void enemyUpdate(){
        maxthresh = allyhi + allymed + allylow;
        lowrate = (allylow * 100) / maxthresh;
        medrate = (allymed * 100) / maxthresh;
        highrate = (allyhi * 100) / maxthresh;          

        
        System.out.println("Current threshold = "+ maxthresh);
        System.out.println("Chance of low roll is " + lowrate);
        System.out.println("Chance of med roll is " + medrate);
        System.out.println("Chance of high roll is " + highrate);

    }
}
