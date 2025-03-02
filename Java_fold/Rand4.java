import java.util.Scanner;
import java.util.Random;

public class Rand4 {

    public static Random rand = new Random();
    public static Scanner reader = new Scanner(System.in); 


    public static int maxthresh;
    public static int allyhi = 1, allymed = 1, allylow = 1;

    public static void main(String[]args){

        System.out.print("Insert Number of Rounds here: ");
        
        int rounds = reader.nextInt();
        int wincount = 0;

        for (int i = 0; i < rounds; i++){
            enemyUpdate();
            System.out.print("\n\nRound #" + (i+1) + " "); // i+1 without brackets will print wrong values of 11, 21, 33

            System.out.println("Type 1 for Low. 2 for Med. 3 for High.");
            int ally = reader.nextInt();
            System.out.print("Selected "+ally+" : ");
            atkType(ally);

            int enemy = rand.nextInt(maxthresh) +1;
            System.out.print("Enemy chose " + enemy+ " : ");
            atkType(enemy);

            //Currently not tracking the proper amount of times they intercept each other
            if(ally == enemy){
                System.out.println("Enemy managed to hit us with a perfect attack to pierce the defense!!");
                maxthresh++;
                if(ally == 2) allymed++;
                else if(ally == 3) allyhi++;
                else allylow++;
                wincount++;

            }else{
                System.out.println("Successful defense!");
            }

            

            /*
            
            if(rounds > 0){
                enemyUpdate();
            }
            else{
                System.out.println("Need a valid round number greater than 0"); //Not reachable rn
            }

             */
        }
        System.out.println("\nTotal Rounds: "+rounds);
        System.out.println("Successful Defense: "+wincount);
    }
    
    public static void atkType(int atk){
        if(atk == 1){
            System.out.println("Low");
        }
        else if(atk == 2){
            System.out.println("Med");
        }
        else if(atk == 3){
            System.out.println("High");
        }
        else{
            System.out.println("Atk Invalid. Defaulting to Low.");
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
