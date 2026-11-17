package week1.practice;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double result = 0.0;
        boolean validOperation = true;

        System.out.print("Enter num1: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter num2: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operation (+, -, *, /, ^): ");
        char operation = sc.next().charAt(0);

        switch(operation){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '^' -> result = Math.pow(num1, num2);
            
            case '/' -> {
                if(num2 != 0){
                    result = num1 / num2;
                }else{
                    System.out.println("Can not divide by Zero!!!");
                    validOperation = false;
                }
            }
            default -> {
                System.out.println("Not a valid operation!!!");
                validOperation = false;
            }
        }

        if(validOperation){
            System.out.println("Result: " + result);
        }
    }    
}
