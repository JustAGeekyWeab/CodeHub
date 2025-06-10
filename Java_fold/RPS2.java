import java.util.Scanner;
import java.util.Random;

public class RPS2 {
        public static void main(String[] args){
            GetRoll roller = new GetRoll(); // Unique
            Random random = new Random();
            Scanner reader = new Scanner(System.in);
            System.out.println("Hello world Java");

            String[] options = {"r", "p", "s"};

            int roundN = 5;
            System.out.println("Enter how many rounds: ");
            if(reader.hasNextInt()){
                roundN = reader.nextInt();
            }
            else{
                System.out.println("Input not valid. Defaulting to 5");
            }

            System.out.println("Rounds: " + roundN);
            int counter = 0;
            int tie = 0;
            int playerwins = 0;
            int cpuwins = 0;

            while(counter < roundN){
                System.out.print("Round #" + (counter+1) + "! Fight!");
                System.out.println("\n");

                System.out.println("Enter r for Rock, p for Paper, s for Scissors: ");
                String myin = reader.nextLine().trim().toLowerCase();
                if(!myin.equals("r") && !myin.equals("p") && !myin.equals("s")){
                    System.out.println("Invalid input. Defaulting to Rock.");
                    myin = "r";
                    continue;
                }
                String cChoice = options[random.nextInt(3)];
                System.out.println("Computer chose "+cChoice+"!\n");
                if(myin.equals(cChoice)){
                    System.out.println("It's a tie!");
                    tie++;
                }
                else if(
                    (myin.equals("r")&&cChoice.equals("s"))||
                    (myin.equals("s")&&cChoice.equals("p"))||
                    (myin.equals("p")&&cChoice.equals("r"))
                    ){
                    System.out.println("You won!");
                    playerwins++;
                }
                else{
                    System.out.println("Computer wins!");
                    cpuwins++;
                }
                counter++;

            }
            System.out.println("Final tally\n");
            System.out.println("Player wins: "+playerwins);
            System.out.println("Computer wins: "+ cpuwins);
            System.out.println("Ties: "+tie);

    }
}
