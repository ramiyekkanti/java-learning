package concept.exceptions;

public class ExceptionPractice {
    public static void main(String[] args){
        System.out.println(parseOrDefault("42", 7));
        System.out.println(parseOrDefault("abc", 7));
        System.out.println(parseOrDefault("", 0));
        System.out.println(parseOrDefault(" 15 ", 0));
        System.out.println(parseOrDefault("3.5", -1));
        System.out.println("-------------------------------------------------------");

        // Account Class
        Account acc = new Account(500);
        try{
            acc.withdraw(200);
            System.out.println("Balance: " + acc.getBalance());
            acc.withdraw(800);
        }catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
            System.out.println("Shortfall: " + e.getShortfall());
        }

        try{
            acc.withdraw(-100);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch(InsufficientFundsException e){
            System.out.println("Unexpected");
        }
        System.out.println("Balance: " + acc.getBalance());
        System.out.println("-------------------------------------------------------");

        
        process("12");
        process("x");
        System.out.println(tricky());
        System.out.println("-------------------------------------------------------");

        
        try{
            level1();
        }catch(IllegalStateException e){
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("-------------------------------------------------------");

        int[] data = {10, 20, 30};
        System.out.println(safeDivide(data, 1, 2));
        System.out.println(safeDivide(data, 5, 2));
        System.out.println(safeDivide(data, 0, 0));
        System.out.println(safeDivide(new int[]{}, 0, 1));
        System.out.println("-------------------------------------------------------");


        System.out.println(parseAndSum("10, x, 20"));
        System.out.println(parseAndSum("a,b"));
        System.out.println(parseAndSum("1,2,3"));
        System.out.println(parseAndSum(""));   
        System.out.println("-------------------------------------------------------");


        System.out.println(zoo(0));
        System.out.println(zoo(1));
        System.out.println(zoo(2));
        System.out.println(zoo(3));
        System.out.println(zoo(4));
        System.out.println(zoo(5));
        System.out.println("-------------------------------------------------------");
    }

    // Methods
    public static String zoo(int which){
        switch(which){
            case 0: {
                try{
                    String x = null;
                    x.length();
                }catch(NullPointerException e){
                    return e.getClass().getSimpleName();
                }
            }
            case 1: {
                try{
                    int num = Integer.parseInt("x");
                }catch(NumberFormatException e){
                    return e.getClass().getSimpleName();
                }
            }
            case 2: {
                try{
                    int[] arr = {1, 2};
                    int val = arr[5];
                }catch(ArrayIndexOutOfBoundsException e){
                    return e.getClass().getSimpleName();
                }
            }
            case 3: {
                try{
                    int div = 11/0;
                }catch(ArithmeticException e){
                    return e.getClass().getSimpleName();
                }
            }
            case 4: {
                try{
                    String x = "abc";
                    x = x.substring(5);
                }catch(StringIndexOutOfBoundsException e){
                    return e.getClass().getSimpleName();
                }
            }
            default:
                return "none";
        }
    }

    public static int parseAndSum(String s){
        int sum = 0;
        String[] list = s.split(",");

        for(String l : list){
            try{
                sum += Integer.parseInt(l.trim());
            }catch(NumberFormatException e){
                // skip entries that are not numbers
            }
        }

        return sum;
    }

    public static String safeDivide(int[] numbers, int index, int divisor){
        try{
            int div = numbers[index] / divisor;
            return String.valueOf(div);
        }
        catch(ArrayIndexOutOfBoundsException e){
            return "Bad index";
        }catch(ArithmeticException e){
            return "Cannot divide by zero";
        }
        
    }

    public static int parseOrDefault(String text, int fallback){
        try{
            return Integer.parseInt(text.trim());
        }catch(NumberFormatException nfe){
            return fallback;
        }
    }    
    
    public static void process(String input){
        System.out.println("Start");
        try{
            int numb = Integer.parseInt(input);
            System.out.println("Number: " + (numb * 2));
        }catch(NumberFormatException nfe){
            System.out.println("Bad input");
        }finally{
            System.out.println("Done");
        }
    }

    public static int tricky(){
        try{
            return 1;
        }
        finally{
            System.out.println("cleanup");
        }
    }

    public static void level1(){
        level2();
    }
    public static void level2(){
        level3();
    }
    public static void level3(){
        throw new IllegalStateException("boom");
    }
}
