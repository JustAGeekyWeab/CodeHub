import java.util.Random;
import java.util.Scanner;

//Old code that I found here. 'm going to mess around in it to test it out
//https://stackoverflow.com/questions/26497549/rock-paper-scissors-game-using-ai-java

public class RPS {
    public static void main(String[] args)
    {
      displayGreeting();
      computerChoice();
      gameCode();
    }

    public static void displayGreeting()
    {
      System.out.print("This is the classic Rock, Paper, Scissors game everyone has grown to know and love. The \nrules are the same. Paper beats rock, rock beats scissors, scissors beats paper. Good luck fool!");

      System.out.println();
    }
    public static String computerChoice()
    {
        Random randomGenrator = new Random();
        int randomNumber = randomGenrator.nextInt(3);
        int cpuRock = 0;
        int cpuPaper = 0;
        int cpuScissors = 0;

        String weapon = "nothing";
        switch(randomNumber)
        {
           case 0: 
                weapon = "rock";
                cpuRock++;
                break;
           case 1: 
                weapon = "paper";
                cpuPaper++;
                break;
           case 2: 
                weapon = "scissors";
                cpuScissors++;
                break;
        }

        return weapon;
    }

    public static String playerChoice()
    {      
        Scanner kb = new Scanner(System.in);

        String input = "";

        System.out.println();
        System.out.print("Please Choose Your Weapon: ");
        input = kb.next();
        String inputLower = input.toLowerCase();
        return inputLower;
    }    
    public static void gameCode()
    {    
            int ties = 0;
            int playerWins = 0;
            int compWins = 0;

            int userScissors = 0;
            int userRock = 0;
            int userPaper = 0;

            String player;
            String comp;

      do
      {
           player = playerChoice();

           if(player == "scissors")
             { 
               userScissors++;
             }
           else if(player == "rock")
             {
               userRock++;
             }
           else if(player == "paper")
             {
               userPaper++;
             }

           comp = computerChoice();

            if(player.equals("rock")&&comp.equals("rock"))
            {
                System.out.println("You and the Computer Both Chose Rock. It's a Tie!");
                ties++;
                userRock++;
            }
            else if(player.equals("paper")&&comp.equals("paper"))
            {
                System.out.println("You and the Computer Both Chose Paper. It's a Tie!");
                ties++;
                userPaper++;
            }
            else if(player.equals("scissors")&&comp.equals("scissors"))
            {
                System.out.println("You and the Computer Both Chose Scissors. It's a Tie!");
                ties++;
                userScissors++;
            }

            else if (player.equals("rock") && comp.equals("scissors"))
            {
                System.out.println("You Chose Rock and the Computer Chose Scissors. You Win!");
                playerWins++;
                userRock++;
            }
            else if(comp.equals("rock") && player.equals("scissors"))
            {
               System.out.println("You Chose Scissors and the Computer Chose Rock. You Lose!");                
               compWins++;
               userScissors++;
            }
            else if(player.equals("scissors")&& comp.equals("paper"))
            {
               System.out.println("You Chose Scissors and the Computer Chose Paper. You Win!");   
               playerWins ++;
               userScissors++;
            }
            else if(comp.equals("scissors") && player.equals("paper"))
            {
               System.out.println("You Chose Paper and the Computer Chose Scissors. You Lose!");
               compWins++;
               userPaper++;
            }
            else if(player.equals("paper") && comp.equals("rock"))
            {
               System.out.println("You Chose Paper and the Computer Chose Rock. You Win!");     
               playerWins++;
               userPaper++;
            }
            else if(comp.equals("paper")&& player.equals("rock"))
            {
               System.out.println("You Chose Paper and the Computer Chose Rock. You Lose!");
               compWins++;
               userRock++;
            }
            else
            {
               System.out.println("Invalid Input. Please Re-Enter. ");
               System.out.println();
            }

        }while(!(player.equals("quit")));

                    System.out.println("Here are the results: ");
                    System.out.println("Ties: " + ties);
                    System.out.println("Computer Wins: "  + compWins);
                    System.out.println("Player Wins: " + playerWins); 
                    System.out.println();
                    System.out.println("Times Rock Chosen: "+userRock);
                    System.out.println("Times Paper Chosen: "+userPaper);
                    System.out.println("Times Scissors Chosen: "+userScissors);

                    return;


         }//end
}
