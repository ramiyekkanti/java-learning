package week1.practice;
import java.util.Scanner;

// A multiple-choice Java quiz game that displays questions and four answer options.
// Validates user input, checks answers, tracks the score, and displays the final percentage.
public class JavaQuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] questions = {
            "1. Which of the following is the correct entry point of a standard Java application?",
            "2. Which data type is used to store true or false values in Java?",
            "3. What is the index of the first element in a Java array?",
            "4. Which keyword is used to create an object in Java?",
            "5. What is the output of 10 / 3 when both operands are integers?",
            "6. Which method is used to get the length of a String?",
            "7. Which loop is guaranteed to execute at least once?",
            "8. What is the difference between == and equals() in Java?",
            "9. Which keyword is used to inherit a class in Java?",
            "10. What happens when you divide an integer by zero in Java?",
            "11. Which class is used to take user input in Java?",
            "12. What is the default value of an int instance variable in Java?",
            "13. Which keyword prevents a variable from being reassigned?",
            "14. What is the output of System.out.println(5 + 2 + \"Java\")?",
            "15. Which access modifier makes a member accessible only within its class?",
            "16. How many primitive data types are there in Java?",
            "17. Which method converts a String into an integer?",
            "18. What exception occurs when accessing an invalid array index?",
            "19. Can a Java class implement multiple interfaces?",
            "20. What is the output of System.out.println(10 % 3)?"
        };
        String[][] options = {
            {"main()", "start()", "run()", "init()"},
            {"int", "boolean", "char", "String"},
            {"0", "1", "-1", "Depends on size"},
            {"class", "this", "new", "static"},
            {"3.33", "3", "4", "3.0"},
            {"size()", "length()", "count()", "getLength()"},
            {"for loop", "while loop", "do-while loop", "enhanced for loop"},
            {"Both compare values", "== compares references; equals() checks logical equality", "Both compare references", "equals() compares memory addresses"},
            {"implements", "inherits", "extends", "super"},
            {"NullPointerException", "ArithmeticException", "NumberFormatException", "No exception"},
            {"Scanner", "Random", "System", "Input"},
            {"0", "1", "null", "-1"},
            {"static", "final", "const", "private"},
            {"7Java", "52Java", "Java7", "Compilation error"},
            {"public", "protected", "private", "static"},
            {"6", "7", "8", "9"},
            {"Integer.parseInt()", "Integer.toString()", "String.valueOf()", "Double.parseDouble()"},
            {"NullPointerException", "ArrayIndexOutOfBoundsException", "ArithmeticException", "IndexException"},
            {"Yes", "No", "Only two", "Only one"},
            {"1", "3", "0", "10"}
        };
        char[] answers = {
            'A', 'B', 'A', 'C', 'B',
            'B', 'C', 'B', 'C', 'B',
            'A', 'A', 'B', 'A', 'C',
            'C', 'A', 'B', 'A', 'A'
        };
        char[] optionChar = {'A', 'B', 'C', 'D'};
        int score = 0;
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n------------------------------------------");
            System.out.println("SCORE: " + score);
            System.out.println("------------------------------------------");

            System.out.println(questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(optionChar[j] + ". " + options[i][j]);
            }

            char ans;

            // Validate user input
            while (true) {
                System.out.print("Select the correct option (A-D): ");
                ans = Character.toUpperCase(sc.next().charAt(0));

                if (ans >= 'A' && ans <= 'D') {
                    break;
                }

                System.out.println("Invalid option! Please enter A, B, C, or D.");
            }

            // Check the answer
            if (ans == answers[i]) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! Correct answer: " + answers[i]);
            }
        }

        // Calculate final results
        double percentage = (score / (double) questions.length) * 100;

        System.out.println("\n==========================================");
        System.out.println("             QUIZ COMPLETED!");
        System.out.println("==========================================");
        System.out.println("Your Score: " + score + "/" + questions.length);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("==========================================");

        sc.close();
    }
}
