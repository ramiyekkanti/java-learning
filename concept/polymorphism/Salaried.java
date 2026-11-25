package concept.polymorphism;

public class Salaried implements Payable{
    private double monthly;

    public Salaried(double monthly){
        this.monthly = monthly;
    }

    @Override
    public double pay(){
        return monthly;
    }
}
