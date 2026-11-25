package concept.practice;
import java.util.Scanner;
import java.util.Random;

public class DiceRollerProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int min = 1, max = 6, total = 0;

        System.out.print("Enter the number of dice to roll: ");
        int dice = sc.nextInt();

        for(int i = 0; i < dice; i++){
            int diceValue = rand.nextInt(min, max + 1);
            total += diceValue;
            displayDice(diceValue);
        }
        System.out.println("Total of all rolls: " + total);
        sc.close();
    }

    public static void displayDice(int diceValue){
        switch(diceValue){
            case 1: {
                System.out.println("-------------");
                System.out.println("|           |");
                System.out.println("|     O     |");
                System.out.println("|           |");
                System.out.println("-------------");
                System.out.println("You rolled: " + diceValue);
                break;
            }
            case 2: {
                System.out.println("-------------");
                System.out.println("|          O|");
                System.out.println("|           |");
                System.out.println("|O          |");
                System.out.println("-------------");
                System.out.println("You rolled: " + diceValue);
                break;
            }
            case 3: {
                System.out.println("-------------");
                System.out.println("|          O|");
                System.out.println("|     O     |");
                System.out.println("|O          |");
                System.out.println("-------------");
                System.out.println("You rolled: " + diceValue);
                break;
            }
            case 4: {
                System.out.println("-------------");
                System.out.println("|O         O|");
                System.out.println("|           |");
                System.out.println("|O         O|");
                System.out.println("-------------");
                System.out.println("You rolled: " + diceValue);
                break;
            }
            case 5: {
                System.out.println("-------------");
                System.out.println("|O         O|");
                System.out.println("|     O     |");
                System.out.println("|O         O|");
                System.out.println("-------------");
                System.out.println("You rolled: " + diceValue);
                break;
            }
            case 6: {
                System.out.println("-------------");
                System.out.println("|O    O    O|");
                System.out.println("|           |");
                System.out.println("|O    O    O|");
                System.out.println("-------------");
                System.out.println("You rolled: " + diceValue);
                break;
            }
        }
    }
}
