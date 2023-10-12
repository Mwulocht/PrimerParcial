package ufps.poo2.ejercicio.banco;

class CurrentAccount extends Account {
    private boolean overdraft;
    private double overdraftLimit;

    public CurrentAccount(int a, Customer customer, double overdraftLimit) {
        super(a, customer);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double sum) {
        if (getBalance() < sum) {
            overdraft = true;
        }
        super.withdraw(sum);
    }

    public boolean isOverdraft() {
        return overdraft;
    }

    public double getOverdraft() {
        return getBalance() - overdraftLimit;
    }
}
