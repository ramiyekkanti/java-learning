package week1.practice;
import java.util.Scanner;

public class BankingProgram {
    static double balance = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            choice = display(sc);
            switch(choice){
                case 1: 
                    showBalance();
                    break;
                case 2: 
                    depositMoney(sc);
                    break;
                case 3: 
                    withdrawMoney(sc);
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!"); 
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
            }
        }while(choice != 4);
        sc.close();
    }

    public static int display(Scanner sc){
        System.out.println("-----------------");
        System.out.println(" Banking Problem ");
        System.out.println("-----------------");
        System.out.println("1. Show Balance  ");
        System.out.println("2. Deposit       ");
        System.out.println("3. Withdraw      ");
        System.out.println("4. Exit          ");
        System.out.println("-----------------");
        System.out.print("Enter your choice (1-4): ");
        return sc.nextInt();
    }

    public static void showBalance(){
        System.out.printf("Your Balance: %.2f%n", balance);
    }

    public static void depositMoney(Scanner sc){
        System.out.print("Please enter the amount you want to deposit: ");
        double depositAmount = sc.nextDouble();
        if(depositAmount <= 0){
            System.out.println("Deposit amount can not be less than or equal to 0.");
        }else{
            balance += depositAmount;
        System.out.printf("Your Balance: %.2f%n", balance);
        }
        
    }
    public static void withdrawMoney(Scanner sc){
        System.out.print("Please enter the amount you want to withdraw: ");
        double withdrawAmount = sc.nextDouble();

        if(withdrawAmount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
        } else if(withdrawAmount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= withdrawAmount;
        System.out.printf("Your Balance: %.2f%n", balance);
        }
    }

    
}
