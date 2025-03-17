import java.util.Random;

public class GetRoll {
 
    public static Random rand = new Random();

    int rockcount, papercount, scissorcount;

    public char getRoll(int rock, int paper, int scissor){
        int maxthresh = rock + paper + scissor;
        int roll = rand.nextInt(maxthresh); //Reaches it. balanced amount
        System.out.print(roll+1);
        if(roll < rock){
            rockcount++; return 'r';
        }
        if(roll < rock+paper){
            papercount++; return 'p';
        }
        else{
            scissorcount++; return 's';
        }
        
    }

}
