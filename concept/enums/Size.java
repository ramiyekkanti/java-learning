package concept.enums;

public enum Size{
    SMALL(100),
    MEDIUM(150),
    LARGE(200);

    private final int price;

    Size(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
