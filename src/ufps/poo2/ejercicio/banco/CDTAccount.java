package ufps.poo2.ejercicio.banco;

public class CDTAccount extends Account {
    private double interestRate; // Tasa de interés en porcentaje (ejemplo: 1% se almacena como 0.01)

    public CDTAccount(int accountNumber, Customer customer, double interestRate) {
        super(accountNumber, customer);
        this.interestRate = interestRate;
    }

    public void calculateInterest(int days) {
        double interestAmount = getBalance() * interestRate * days;
        deposit(interestAmount);
    }

    @Override
    public void withdraw(double sum) {
        System.err.println("CDTAccount.withdraw(...): No se pueden realizar retiros en una cuenta CDT.");
    }
}
