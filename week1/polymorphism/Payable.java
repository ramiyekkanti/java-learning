package week1.polymorphism;

public interface Payable {
    double pay();

    default double payWithBonus(double percent){
        double amount = pay();
        return amount + (amount * (percent / 100));
    } 
}
