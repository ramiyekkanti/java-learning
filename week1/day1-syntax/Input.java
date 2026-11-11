import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        greeting(sc);
        addTwo(sc);
        average(sc);
        newlineBroken(sc); // Prediction: Age: 28, Name: []
        newlineFixed(sc); // Prediction: Age: 28, Name: [Rami]
        safeEvenCheck(sc);
        sentinelLoop(sc);
        sc.close();
    }

    public static void greeting(Scanner sc){
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your city:  ");
        String city = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello, " + name + " from " + city + ". Next year you will be " + (age + 1) + ".");
    }

    // Exception in thread "main" java.util.InputMismatchException
    // This exception occurs because nextInt() expects an integer, but I entered 3.5, which is a decimal number.
    public static void addTwo(Scanner sc){
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        System.out.println("Sum: " + (first + second));
    }

    // For numbers 1, 2, 4 the Integer division: 2 and Decimal division: 2.3333333333333335. They both differ because in the integer division the decimal is discarded. 
    // Whereas 3, 3, 3 gives same value for Integer division: 3 and Decimal division: 3.0.
    public static void average(Scanner sc){
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        System.out.print("Enter third number: ");
        int third = sc.nextInt();

        
        System.out.println("Integer division: " + ((first + second + third) / 3));
        System.out.println("Decimal division: " + ((first + second + third) / 3.0));
    }

    public static void newlineBroken(Scanner sc){
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Age: " + age + ", Name: [" + name + "]");
    }

    public static void newlineFixed(Scanner sc){
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Age: " + age + ", Name: [" + name + "]");
    }

    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static void safeEvenCheck(Scanner sc){
        System.out.print("Enter a whole number: ");
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            if(isEven(n)){
                System.out.println("Number " + n + " is: Even");
            }else{
                System.out.println("Number " + n + " is: Odd");
            }
        }else{
            System.out.println("That was not a whole number.");
        }
    }

    public static void sentinelLoop(Scanner sc){
        System.out.print("Enter numbers (0 to stop): ");
        int count = 0, sum = 0;
        int n = sc.nextInt();
        while(n != 0){
            count++;
            sum += n;
            System.out.print("Enter number: ");
            n = sc.nextInt();
        }

        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
    }

}
