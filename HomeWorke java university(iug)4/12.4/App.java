import java.util.Date;

class App {
    public static void main(String[] args) {
        try {
            Loan loan = new Loan(2, 0, -10);
        } catch (IllegalArgumentException ex) {
            System.out.println("IllegalArgumentException: " + ex.getMessage());
        }
    }
}

class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double amount;
    private Date date;

    public Loan() {
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double amount) {
        this.setAmount(amount);
        this.setAnnualInterestRate(annualInterestRate);
        this.setNumberOfYears(numberOfYears);
        date = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate <= 0) {
            throw new IllegalArgumentException("annualInterestRate must be greater than 0.");
        } else {
            this.annualInterestRate = annualInterestRate;
        }
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears <= 0) {
            throw new IllegalArgumentException("years should not be 0");
        } else {
            this.numberOfYears = numberOfYears;
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount should not be 0");
        } else {
            this.amount = amount;
        }
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = amount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    public Date getDate() {
        return date;
    }
}