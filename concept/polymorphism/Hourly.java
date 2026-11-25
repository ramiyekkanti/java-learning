package week1.polymorphism;

public class Hourly implements Payable {
    private double rate;
    private double hours;

    public Hourly(double rate, double hours){
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public double pay(){
        return rate * hours;
    }
}
