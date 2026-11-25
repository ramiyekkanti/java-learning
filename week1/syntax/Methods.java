public class Methods {
    public static void main(String[] args){
        // Prediction: 7
        System.out.println("Max of (3, 7) is: " + max(3, 7));
        // Prediction: 9
        System.out.println("Max of (9, 2) is: " + max(9, 2));
        // Prediction: 5
        System.out.println("Max of (5, 5) is: " + max(5, 5));
        System.out.println();
        
        
        
        // Prediction: true
        System.out.println("Is number 4 even?: " + isEven(4));
        // Prediction: false
        System.out.println("Is number 7 even?: " + isEven(7));
        // Prediction: true
        System.out.println("Is number 0 even?: " + isEven(0));
        // Prediction: true
        System.out.println("Is number -2 even?: " + isEven(-2));
        
        // Prediction: -1
        System.out.println("-3 mod 2 is: " + -3%2);
        // Prediction: false
        System.out.println("Is number -3 even?: " + isEven(-3));
        System.out.println();
        

        // Prediction: *
        printStars(1);
        // Prediction: *****
        printStars(5);
        // Prediction: Empty Line
        printStars(0);
        
        // Pass by value
        int x = 1;
        addOne(x);
        // Prediction: 1
        System.out.println("The value of x(1) after adding one: " + x);
        System.out.println();
        

        // Overloading
        // Prediction: 16
        System.out.println("The area of the square: " + area(4));
        // Prediction: 20
        System.out.println("The area of the rectangle: " + area(4, 5));
        

        // Scope
        if(x == 1){
            int y = x + 1;
        }
        // Prediction: y cannot be resolved to a variable
        // System.out.println("The value of Y is: " + y);
        System.out.println();
        

        // Prediction: 5
        System.out.println("Digits in 12345: " + countDigits(12345));
        // Prediction: 1
        System.out.println("Digits in 0: " + countDigits(0));
        // Prediction: 2
        System.out.println("Digits in -99: " + countDigits(-99));
        // Prediction: 1
        System.out.println("Digits in 7: " + countDigits(7));
        System.out.println();
    }

    // Methods
    public static int max(int a, int b){
        if(a > b) return a;
        return b;
    }

    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static void printStars(int count){
        for(int i = 0; i < count; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void addOne(int x){
        x = x + 1;
    }

    public static int area(int side){
        return side * side;
    }

    public static int area(int width, int height){
        return width * height;
    }

    public static int countDigits(int n){
        if(n < 0) n = n * -1;
        
        int digits = 0;
        if(n == 0) return 1;

        while(n > 0){
            digits++;
            n = n / 10;
        }
        return digits;
    }
}
