package week1.practice;
import java.util.Scanner;

// Find the hypotenuse sqrt(a^2 + b^2) of a right angled triangle.
public class Hypotenuse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of side A: ");
        double a = sc.nextDouble();
        System.out.print("Enter the length of side B: ");
        double b = sc.nextDouble();

        System.out.println("Hypotenuse: " + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + "cm");
    }    
}
