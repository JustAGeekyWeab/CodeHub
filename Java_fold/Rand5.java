import java.util.Scanner;
import java.util.Random;

public class Rand5 {
    public static Random rand = new Random();
    public static Scanner reader = new Scanner(System.in); 

    public static int maxthresh;
    public static int allyhi = 1, allymed = 1, allylow = 1;
    public static float lowrate, medrate, highrate;
    public static int lowcount, medcount, hicount;
    public static int wins, roundnum;

    public static void main(String[]args){
        enemyUpdate();
        
        lowcount = medcount = hicount = wins= 0;
        System.out.print("How many rounds?: ");
        roundnum = reader.nextInt();


        tallyOut();

        for(int i = 0; i < roundnum; i++){

            System.out.println("Type a number. 1 for Low. 2 for Med. 3 for High.");
            int choice = reader.nextInt();
            if((choice > 3)||(choice <1)){
                System.out.println("Invalid choice. Converting to 1 for Low");
                choice = 1;
            }

            //int enemy = rand.nextInt(maxthresh) +1;
            //System.out.print("i:"+(i+1)+":"+enemy);
            System.out.print("Round i :"+(i+1)+":"); //Distraction. The enemy number above doesnt work
            

            //Small adjustable placeholders. Can adjust the values to end up with different biases
            if(i % 10 == 11110){
                allylow = allylow + 1;
                tallyOut();
            }
            if(i % 12 == 11110){
                allymed = allymed + 1;
                tallyOut();
            }
            if(i % 9 == 11110){
                allyhi = allyhi + 1;
                tallyOut();
            }





            char roll = getRoll(allylow, allymed, allyhi);
            System.out.println(": Roll value "+roll);

            if(choice == 1){
                if(roll == 'l'){
                    System.out.println("Both low. AI defended against you!");
                    wins++;
                }
                allylow++;
            }
            else if(choice == 2){
                if(roll == 'm'){
                    System.out.println("Both med. AI defended against you!");
                    wins++;
                }
                allymed++;
            }
            else if (choice == 3){
                if(roll == 'h'){
                    System.out.println("Both high. AI defended against you!");
                    wins++;
                }
                allyhi++;
            }
            else{
                System.out.println("Managed to successfully attack");
            }

            enemyUpdate();

        }
        System.out.println("Final tally");
        tallyOut();
        System.out.println("Total rounds: " + roundnum);

    }

    public static void tallyOut(){
        System.out.println();
        System.out.println("Low: "+lowrate);
        System.out.println("Low+Med: "+(lowrate+medrate));
        System.out.println("Low+Med+High: "+(lowrate+medrate+highrate));
        System.out.println();
        System.out.println("Total Low: "+ lowcount);
        System.out.println("Total Med: "+ medcount);
        System.out.println("Total High: "+ hicount);
        System.out.println("Total Rounds: "+ roundnum);
        System.out.println("Total defensive wins for the AI: "+ wins);

    }


    //Determines what value is rolled
    public static char getRoll(int low, int med, int hi){

        //int roll = rand.nextInt(maxthresh) + 1;// Will never reach low
        int roll = rand.nextInt(maxthresh); //Reaches it. balanced amount
        System.out.print(roll+1);
        if(roll < low){
            lowcount++; return 'l';
        }
        if(roll < low+med){
            medcount++; return 'm';
        }
        else{
            hicount++; return 'h';
        }
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
