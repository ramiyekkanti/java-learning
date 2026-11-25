package concept.syntax;
import java.util.Scanner;

public class NestedIfLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Are you a Student? (true/false): ");
        boolean isStudent = sc.nextBoolean();
        System.out.print("Are you a Senior? (true/false): ");
        boolean isSenior = sc.nextBoolean();

        double price = 12.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20%.");
                System.out.println("You get a student discount of 10%.");
                price *= 0.7;
            }else{
                System.out.println("You get a student discount of 10%.");
                price *= 0.9;
            }
        }else{
            if(isSenior){
                System.out.println("You get a senior discount of 20%.");
                price *= 0.8;
            }
        }
        System.out.printf("The price of your ticket is: $%.2f", price);
        sc.close();
    }
}
