package week1.polymorphism;

interface Payable {

    double pay();
    default double payWithBonus(double percent){
        return pay() + (pay() * (percent / 100));
    } 
}
