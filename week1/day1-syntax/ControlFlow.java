public class ControlFlow {
    public static void main(String[] args){
        // prediction: A
        System.out.println("Grade of " + 95 + " Marks: " + grade(95));
        
        // prediction: A
        System.out.println("Grade of " + 90 + " Marks: " + grade(90));
        
        // prediction: B
        System.out.println("Grade of " + 75 + " Marks: " + grade(75));

        // prediction: C
        System.out.println("Grade of " + 74 + " Marks: " + grade(74));

        // prediction: C
        System.out.println("Grade of " + 60 + " Marks: " + grade(60));
        
        // prediction: F
        System.out.println("Grade of " + 59 + " Marks: " + grade(59));
        
        // prediction: F
        System.out.println("Grade of " + 0 + " Marks: " + grade(0));

        // prediction: Monday
        System.out.println("Weekday " + 1 + ": " + dayName(1));
        // prediction: Sunday
        System.out.println("Weekday " + 7 + ": " + dayName(7));
        // prediction: Invalid
        System.out.println("Weekday " + 9 + ": " + dayName(9));

        // prediction: Prints: Tuesday Wednesday Thursday Friday Saturday Sunday Invalid
        fallthroughDemo();


        // Sum
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
        }
        // prediction: 55
        System.out.println("Sum: " + sum);

        // Digits
        int number = 12345; 
        int digits = 0;
        if(number == 0) digits = 1;
        else{
            number = Math.abs(number);
            while(number > 0){
                number = number / 10;
                digits++;
            }
        }
        // prediction: 5
        System.out.println("Digits in 12345: " + digits);


        // do while vs while
        int x = 10;
        // prediction: Does not run
        while(x < 5){
            System.out.println("ran");
        }

        // prediction: Runs one time and prints run
        do{
            System.out.println("ran");
        }while(x < 5);

        // prediction: Number: 1 Number: 2 Number: 4 Number: 5 Number: 7
        for(int i = 1; i <= 10; i++){
            if(i % 3 == 0) continue;
            if(i == 8) break;

            System.out.println("Number: " + i);
        }

        // prediction: Right triangle of stars, 5 rows (1 star, then 2, up to 5).
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // For loop does not do anything except for running for 3 times doing nothing, and the next print statement is independent to this for loop and prints "hi"
        for (int i = 0; i < 3; i++);
        System.out.println("hi");

    

    }

    public static String grade(int marks){
        if(marks >= 90){
            return "A";
        }else if(marks >= 75){
            return "B";
        }else if(marks >= 60){
            return "C";
        }else{
            return "F";
        } 
    }

    public static String dayName(int d){
        switch(d){
            case 1: 
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid";
        }
    }

    public static void fallthroughDemo(){
        int v = 2;
        switch(v){
            case 1: System.out.println("Monday");
            case 2: System.out.println("Tuesday");
            case 3: System.out.println("Wednesday");
            case 4: System.out.println("Thursday");
            case 5: System.out.println("Friday");
            case 6: System.out.println("Saturday");
            case 7: System.out.println("Sunday");
            default: System.out.println("Invalid");
        }
    }
}
