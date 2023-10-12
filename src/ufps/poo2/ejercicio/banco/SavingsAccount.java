package ufps.poo2.ejercicio.banco;

public class SavingsAccount extends Account {
    private double interest;

    public SavingsAccount(int a, Customer customer, double interest) {
        super(a, customer);
        this.interest = interest;
    }

    public void deposit(double sum){
        if (sum > 0){
            double interestAmount = getBalance() * interest;
            sum += interestAmount;
            super.deposit(sum);
        }
        else {
            System.err.println("SavingAccount.deposit(...): " + "no forma de depostar una cantidad negativa de dinero");
        }
    }
}
