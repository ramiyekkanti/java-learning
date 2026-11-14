public class PrintF {
    // printf() = A method used to format and print output.
    // Syntax = % [flags] [width] [.precision] [character-specifier]

    // [flags]
    //   -  = Left-aligns the output (space padding on the right).
    //   +  = Displays a plus sign for positive numbers.
    //   0  = Pads numbers with zeros on the left.
    //   ,  = Adds grouping separators (e.g., 1,000,000).
    //   (  = Encloses negative numbers in parentheses.

    // [width]
    //   Specifies the minimum number of characters to print.
    //   Example: %4d ->  12 (two spaces on the left).

    // [.precision]
    //   For floating-point numbers, specifies the number of digits after the decimal.
    //   Example: %.2f -> 12.35

    // [character-specifier]
    //   %s = String
    //   %d = Integer (decimal)
    //   %f = Floating-point number
    //   %c = Character
    //   %b = Boolean
    //   %n = Platform-specific newline

    public static void main(String[] args){
        String name = "Rami";
        int age = 28;
        double height = 172.0;

        // Rami is 28 years old, and his height is 172.000000 cm
        // %s for string, %d for int, %f for floating value, are the character-specifiers.
        System.out.printf("%s is %d years old, and his height is %f cm\n", name, age, height);
        
        // Rami is 28 years old, and his height is 172.0 cm
        // .1 in between % and f is the precision which lets us format number of digits after the decimal point.
        System.out.printf("%s is %d years old, and his height is %.1f cm\n", name, age, height);

        int price1 = 0;
        int price2 = 12;
        int price3 = 245;
        int price4 = 6789;

        // Without padding width
        System.out.printf("price1: %d \nprice2: %d \nprice3: %d \nprice4: %d \n\n", price1, price2, price3, price4);
        
        // With space padding on the left of width 4.
        System.out.printf("price1: %4d \nprice2: %4d \nprice3: %4d \nprice4: %4d \n\n", price1, price2, price3, price4);
        
        // With space padding on the right of width 4.
        System.out.printf("price1: %-4d \nprice2: %-4d \nprice3: %-4d \nprice4: %-4d \n\n", price1, price2, price3, price4);
        
        // With zero padding on the left with width 4.
        System.out.printf("price1: %04d \nprice2: %04d \nprice3: %04d \nprice4: %04d \n\n", price1, price2, price3, price4);
        

        // Population: 1,476,625,577
        long population = 1476625577L;
        boolean isGrown = true;
        System.out.printf("Population: %,d%n", population);
        System.out.printf("Did population grow?: %b%n", isGrown);
    }
}
