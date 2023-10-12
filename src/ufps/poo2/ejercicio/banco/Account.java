package ufps.poo2.ejercicio.banco;

public class Account {

	private double bal; // The current balance
	private int accnum; // The account number
	private Customer customer;

	public Account(int accnum, Customer customer) {
		bal = 0.0;
		this.accnum = accnum;
		this.customer = customer;
	}

	public void deposit(double sum) {
		if (sum > 0)
			bal += sum;
		else
			System.err.println("Account.deposit(...): " + "cannot deposit negative amount.");
	}

	public void withdraw(double sum) {
		if (sum > 0)
			bal -= sum;
		else
			System.err.println("Account.withdraw(...): " + "cannot withdraw negative amount.");
	}

	public double getBalance() {
		return bal;
	}

	public int getAccountNumber() {
		return accnum;
	}

	public String toString() {
		return "Acc " + accnum + ": " + "balance = " + bal;
	}

	public final void print() {
		// Don't override this,
		// override the toString method
		System.out.println(toString());
	}

	public Customer getCustomer() {
		return customer;
	}

	public Customer setCustomer(){
		return customer;
	}

}
