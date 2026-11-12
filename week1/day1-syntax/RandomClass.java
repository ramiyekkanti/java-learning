import java.util.Random;    

public class RandomClass {
    public static void main(String[] args){
        Random rand = new Random();

        // Tossing a coin
        boolean isHeads = rand.nextBoolean();
        if(isHeads) System.out.println("Heads");
        else System.out.println("Tails");

        // Rolling a dice
        int dice = rand.nextInt(1, 7);
        System.out.println("Dice Value: " + dice);
    }
}
