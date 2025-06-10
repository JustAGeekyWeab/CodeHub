import java.util.Scanner;
import java.util.Random;

public class Rand6 {
    
    public static int allyhi = 1, allymed = 1, allylow = 1;

    public static void main(String[]args){
        GetRoll roller = new GetRoll();

        Scanner reader = new Scanner(System.in);

        System.out.print("How many rounds?: ");
        int roundnum = reader.nextInt();


        for(int i = 0; i < roundnum; i++){
            // Rock = 1, Paper = 2, Scissors = 3
            char roll = roller.getRoll(allylow, allymed, allyhi);       
            System.out.println(roll); 
            //if(roll == 'l');lowrate++;
        }
    }
}
