package week1.polymorphism;

public class Salaried implements Payable{
    double monthly;

    Salaried(double monthly){
        this.monthly = monthly;
    }

    @Override
    public double pay(){
        return monthly;
    }
}
