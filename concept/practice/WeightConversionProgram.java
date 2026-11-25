package week1.practice;
import java.util.Scanner;

public class WeightConversionProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please select as option:");
        System.out.println("1. Convert kgs to lbs.");
        System.out.println("2. Convert lbs to kgs.");

        System.out.print("Your Choice: ");
        int choice = sc.nextInt();
        double weight;
        double newWeight;

        if(choice == 1){
            System.out.print("Enter your weight in kilograms: ");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("Your weight in pounds is: %.2f%n", newWeight);
        }else if (choice == 2){
            System.out.print("Enter your weight in pounds: ");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Your weight in kilograms is: %.2f%n", newWeight);
        }else{
            System.out.println("Please enter a valid option!!!");
        }
        sc.close();
    }
}
