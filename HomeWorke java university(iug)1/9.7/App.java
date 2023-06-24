import java.util.Date;

public class App {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("balance is : " + account.gBalance());
        System.out.println("monthly interest "+ account.getMonthlyInterest());
        System.out.println("account date create : "+ account.gDate());
    }
}




class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    
    Account() {
        dateCreated = new Date();
    }
    
    Account(int id, double balance, double annualInterestRate) {
        this();
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    int gId(){
        return this.id;
    }

    double gBalance() {
        return this.balance;
    }

    double gAnnualInterestRate() {
        return this.annualInterestRate;
    }

    Date gDate() {
        return this.dateCreated;
    }

    double getMonthlyInterestRate(){
        return this.annualInterestRate/12;
    }

    double getMonthlyInterest() {
        return balance * this.getMonthlyInterestRate();
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void deposit(double amount) {
        balance += amount;
    }
}