package concept.exceptions;

public class Account {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount <= 0){
            throw new IllegalArgumentException("Amount must be positive");
        }else if(amount > balance){
            double shortfall = amount - balance;
            throw new InsufficientFundsException(
                "Insufficient funds: balance " + balance + ", requested " + amount, 
                shortfall
            );
        }

        balance -= amount;
    }
}
