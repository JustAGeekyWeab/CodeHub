import java.util.Random;
import java.util.Random;

public class GetRoll {
 
    public static Random rand = new Random();

    int lowcount, medcount, hicount;

    public char getRoll(int low, int med, int hi){
        int maxthresh = low + med + hi;
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

}
