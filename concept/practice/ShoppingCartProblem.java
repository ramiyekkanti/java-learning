package week1.practice;

import java.util.Scanner;

public class ShoppingCartProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        String item = sc.nextLine();

        System.out.print("What is the price for each of it?: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("How many would you like?: ");
        int quantity = sc.nextInt();
        sc.nextLine();

        System.out.println("You have bought " + quantity + " " + item + "'s."); 
        System.out.println("Your total is: " + (quantity * price) + "/-");

        sc.close();
    }
}
