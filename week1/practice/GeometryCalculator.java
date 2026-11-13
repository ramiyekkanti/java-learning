package week1.practice;
import java.util.Scanner;

public class GeometryCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        System.out.println("The circumference is: " + (2 * Math.PI * radius));
        System.out.println("The area is: " + (Math.PI * Math.pow(radius, 2)));
        System.out.println("The volume of the sphere is: " + (Math.PI * Math.pow(radius, 3) * (4.0 /3.0)));
    }
}
