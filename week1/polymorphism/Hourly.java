package week1.polymorphism;

public class Hourly implements Payable {
    double rate;
    double hours;

    Hourly(double rate, double hours){
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public double pay(){
        return rate * hours;
    }
}
