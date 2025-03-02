
// This is a sufficient program that can allow you to play rock paper scissors with an AI.
// It's not adaptive just yet. But it has the input style we need
import java.util.Scanner;
import java.util.Random;
public class Rand2 {
public static Random rand = new Random();
public static Scanner reader = new Scanner(System.in);

public static int hichance = 34;
public static int medchance = 67;
public static int lowchance = 101;
public static int maxchance = 100;
    public static void main(String[] args) {


        //Scanner reader = new Scanner(System.in);
        System.out.print("Insert Number of Rounds here: ");
        
        int round_num = reader.nextInt();
        //tester();
        game_begin(round_num);




        reader.close();
    }    

    public static void game_begin(int r_num){
        System.out.println("Test 2");
        System.out.println(hichance);
        hichance = 45;
        System.out.println(hichance);
        int randnum;
        int hi, med, low, playhi, playmed, playlo;
        hi = med = low = playhi = playmed = playlo = 0;
        for(int i = 0; i < r_num; i++){
            randnum = rand.nextInt(100);
            System.out.println("#"+(i+1)+" = Number: "+randnum);
            System.out.println("Type 1 for High. 2 for Med. 1 for Low.");
            int choice = reader.nextInt();
            System.out.print("Selected "+choice+" ");

            //enemytactic();

            int enemy = rand.nextInt(maxchance);
            int enemyatk;
            if(enemy < hichance){
                System.out.println("Enemy attacks high");
                enemyatk = 1;
            }
            else if(enemy < medchance){
                System.out.println("Enemy attacks medium");
                enemyatk = 2;
            }
            else{
                System.out.println("Enemy attacks low");
                enemyatk = 3;
            }


            switch(choice){
                case 1:
                    System.out.println("Defending high!");
                    playhi++;
                    if (enemyatk == 1){
                        System.out.println("Enemy's high attack fails!");
                        hi++;
                    }
                    break;
                case 2:
                    System.out.println("Defending med!");
                    playmed++;
                    if (enemyatk == 2){
                        System.out.println("Enemy's med attack fails!");
                        med++;
                    }
                    break;
                case 3:
                    System.out.println("Defending low!");
                    playlo++;
                    if (enemyatk == 3){
                        System.out.println("Enemy's low attack fails!");
                        low++;
                    }
                    break;
                default:
                    System.out.println("No defense performed...");
            }



            if((i+1) % 5 == 0){
                System.out.println("\n### Round is divisible by 5 ###\n");
                playerStats();
            }
        }




        System.out.println("Final tally: Amount of times you were successful defending.");
        System.out.println("High = "+ hi);
        System.out.println("Med = "+ med);     
        System.out.println("Low = "+ low);     
    }


    public static void playerStats(){
        
    }

    public static void tester(){
        System.out.println("Test");
    }
}
