package concept.practice;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int min = 1;
        int max = 100;
        int randomNumber = rand.nextInt(min, max + 1);
        int guess;
        int attempts = 0;

        do{
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Your guess was too LOW");
            }else if(guess > randomNumber){
                System.out.println("Your guess was too High");
            }
        }while(guess != randomNumber);
        System.out.printf("You guessed correctly after %d attempts.%n", attempts);
        sc.close();
    }    
}
