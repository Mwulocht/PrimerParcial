package ufps.poo2.ejercicio.banco;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void openAccount(char type, int accountNumber, Customer customer) {
        Account account;
        if (type == 'A') {
            account = new Account(accountNumber, customer);
        } else if (type == 'C') {
            account = new CurrentAccount(accountNumber, customer, 1000);
        } else if (type == 'D') {
            account = new CDTAccount(accountNumber, customer, 0.01);
        } else {
            throw new IllegalArgumentException("Tipo de cuenta no válido.");
        }
        accounts.add(account);
    }

    public void payDividend(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        }
    }

    public void closeAccount(int accountNumber) {
        accounts.remove(accountNumber);
    }

    public void deposit(int accountNumber, double amount) {
        if (accountNumber >= 0 && accountNumber < accounts.size()) {
            Account account = accounts.get(accountNumber);
            if (account != null) {
                account.deposit(amount);
            } else {
                System.err.println("La cuenta con el número " + accountNumber + " no existe.");
            }
        } else {
            System.err.println("Número de cuenta no válido: " + accountNumber);
        }
    }
    

    public void withdraw(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        }
    }

    public double getBalance(int accountNumber) {
        Account account = accounts.get(accountNumber);
        return (account != null) ? account.getBalance() : 0;
    }

    public void sendLetterToOverdraftAccounts() {
        for (Account account : accounts) {
            if (account instanceof CurrentAccount && ((CurrentAccount) account).isOverdraft()) {
                System.out.println("La cuenta " + account.getAccountNumber() + " está sobregirado ");
            }
        }
    }

    public void calculateCDTInterest(int accountNumber, int days) {
        Account account = accounts.get(accountNumber);
        if (account instanceof CDTAccount) {
            ((CDTAccount) account).calculateInterest(days);
        }
    }

    public void printCDTInterest(int days) {
        System.out.println("Rentabilidad de las cuentas CDT después de " + days + " días:");
        for (Account account : accounts) {
            if (account instanceof CDTAccount) {
                double balance = account.getBalance();
                System.out.println("Cuenta " + account.getAccountNumber() + ": Saldo = " + balance);
            }
        }
    }

    public double obtenerSaldo(int accountNumber) { // F1 Parcial ---// Metodo obtener saldo
        Account account = accounts.get(accountNumber);
        if (account != null) {
            if (account instanceof CurrentAccount) {
                CurrentAccount currentAccount = (CurrentAccount) account;
                if (currentAccount.isOverdraft()) {
                    // retorna el saldo más el sobregiro
                    return account.getBalance() + currentAccount.getOverdraft();
                } else {
                    // Si es una cuenta corriente sin sobregiro, retornar el saldo tal como está
                    return account.getBalance();
                }
            } else if (account instanceof CDTAccount) {
                // calcula rentabilidad para 10 dias
                calculateCDTInterest(accountNumber, 10); // aqui calcula el sobregiro por 10 dias
                return account.getBalance();
            } else {

                return account.getBalance();
            }
        } else {
            //la cuenta no existe
            return 0;
        }
    }

    public void printAccountBalancesInformation() { //---
        System.out.println("cuentas y saldos: ");
        for (Account account : accounts) {
            int accountNumber = account.getAccountNumber();
            Customer customer = account.getCustomer();
            String fullName = customer.getFirstName() + " " + customer.getLastName();
            System.out.println("Cuenta numero: " + accountNumber + " Cliente: " + fullName);
            double balance = obtenerSaldo(accountNumber); // Utilizamos el método obtenerSaldo
            System.out.println("Cuenta: " + accountNumber + ", Saldo: " + balance);


        }
    }

}
