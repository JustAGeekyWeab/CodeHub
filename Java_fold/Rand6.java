import java.util.Scanner;
import java.util.Random;

public class Rand6 {
    
    public static int allyhi = 1, allymed = 1, allylow = 1;

    public static void main(String[]args){
        GetRoll roller = new GetRoll();

        char roll = roller.getRoll(allylow, allymed, allyhi);       
        System.out.println(roll); 
        //if(roll == 'l');lowrate++;
    }
}
