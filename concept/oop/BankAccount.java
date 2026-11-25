package concept.oop;

public class BankAccount {
    private String owner;
    private double balance;

    BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    double getBalance(){
        return balance;
    }

    void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
        }else{
            balance += amount;
        }
    }

    boolean withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
            return false;
        }else if(amount > balance){
            System.out.println("Insufficient funds");
            return false;
        }else{
            balance -= amount;
            return true;
        }
    }

    @Override
    public String toString(){
        return "Owner: " + owner + ", Balance: " + balance;
    }

}
