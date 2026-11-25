package week1.practice;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String playerChoice;
        String computerChoice;
        String status = "yes";
        String[] options = {"rock", "paper", "scissor"};
        int score = 0;
        int count = 0;

        do{
            System.out.print("Your Choice: ");
            playerChoice = sc.nextLine().trim().toLowerCase();
            computerChoice = options[rand.nextInt(0, 3)];
            System.out.printf("Computer Choice: %s%n", computerChoice);

            if(!playerChoice.equals("rock") && 
                !playerChoice.equals("paper") && 
                !playerChoice.equals("scissor")){
                System.out.println("Invalid Choice!!!");
            }else{
                if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie.");
            }else if(
                (playerChoice.equals("rock") && computerChoice.equals("scissor")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissor") && computerChoice.equals("paper"))
            ){
                System.out.println("You Win.");
                score++;
            }else{
                System.out.println("You Lose.");
            }
                count++;
            }
            System.out.print("Do you want to play again? (Yes, No): ");
            status = sc.nextLine().toLowerCase();
        }while(status.equals("yes"));

        System.out.println("\n========== GAME OVER ==========");
        System.out.println("You won " + score + " times out of " + count + " games."); 
        sc.close(); 
    }
}
