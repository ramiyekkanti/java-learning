package week1.practice;
import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        double rate = sc.nextDouble();

        System.out.print("Enter the number of years invested: ");
        int years = sc.nextInt();

        System.out.print("Enter the number of times compounded per year: ");
        int compoundingFrequency = sc.nextInt();

        double amount = principal * Math.pow(
            (1 + rate / (100 * compoundingFrequency)),
            compoundingFrequency * years
        );

        double compoundInterest = amount - principal;

        System.out.printf("Final amount: %.2f/-%n", amount);
        System.out.printf("Compound interest: %.2f/-%n", compoundInterest);

        sc.close();
    }
}
