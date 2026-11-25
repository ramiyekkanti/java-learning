package concept.oop;

public class Counter {
    private int value;
    private static int totalCreated;

    Counter(){
        totalCreated++;
    }

    void increment(){
        value++;
    }

    int getValue(){
        return value;
    }

    public static int getTotalCreated(){
        return totalCreated;
    }
}

