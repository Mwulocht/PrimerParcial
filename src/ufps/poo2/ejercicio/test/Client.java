package ufps.poo2.ejercicio.test;

import ufps.poo2.ejercicio.banco.Bank;
import ufps.poo2.ejercicio.banco.Customer;


public class Client {

	public static void main(String[] args) {


		Bank bank = new Bank();

		Customer customer1 = new Customer(10050, "David", "Delgado");
        Customer customer2 = new Customer(10058, "Fred", "Peterson");
		Customer customer3 = new Customer(12317, "Alfredo", "Polainas");

        bank.openAccount('A', 1, customer1); // Cuenta Regular
        bank.openAccount('C', 2, customer2); // Cuenta Current 
		bank.openAccount('D', 3, customer3); // Cuenta CDT

        // 
        bank.deposit(1, 1000);
        bank.deposit(2, 2300);
        bank.deposit(3, 1200);

        // imprimir
        bank.printAccountBalancesInformation();






		// esto hace x cosa

		// Account acObj = new Account(); // Genera error, ¿por qué?

		// ================================================
		// TESTING ACCOUNT CLASS
		// ================================================

		// -------------------------------------------------
		// Debe descomentar este bloque cuando implemente las clases
		// -------------------------------------------------

		// Account acObj = new Account(4);
		//
		//
		// System.out.println(acObj.getBalance());
		// acObj.deposit(10);
		// acObj.deposit(40);
		// acObj.deposit(20);
		// System.out.println(acObj.getBalance());

		// acObj.withdraw(20);
		// System.out.println(acObj.getBalance());

		// ================================================
		// TESTING BANK CLASS
		// ================================================

		// -------------------------------------------------
		// Debe descomentar este bloque cuando implemente las clases
		// -------------------------------------------------

		// Bank bank = new Bank();
		//
		// bank.openAccount('A', 3354678);
		// bank.openAccount('A', 3359302);
		// bank.openAccount('C', 3379844);

		// bank.openAccount('A', 1);
		// bank.payDividend(1, 100);
		// bank.withdraw(1, 5);
		// System.out.println("Balance cuenta 1: "+bank.getBalance(1));
		//
		// bank.payDividend(3354678, 10);
		// bank.payDividend(3354678, 30);
		//
		// bank.payDividend(3359302, 50);
		// bank.payDividend(3359302, 50);
		//
		// bank.payDividend(3379844, 10);
		// bank.payDividend(3379844, 10);
		//
		// System.out.println("*** Val = "+bank.getBalance(3379844));
		//
		// bank.withdraw(3379844, 20);
		// bank.withdraw(3379844, 5);
		//
		// System.out.println("*** Val = "+bank.getBalance(3379844));
		//
		// bank.withdraw(3379844, 15);
		//
		// System.out.println("*** Val = "+bank.getBalance(3379844));
		//
		// bank.sendLetterToOverdraftAccounts();

		// ==================================================

		/*
		 * Debería obtener un resultado similar a este:
		 *** 
		 * Val = 20.0
		 * CurrentAccount.withdraw
		 * CurrentAccount.withdraw
		 * Bank.getBalance
		 * Bank.payDividend ::: ac.getBalance() = -5.0
		 *** Val = -5.0
		 * CurrentAccount.withdraw
		 * CurrentAccount.withdraw(...): cannot withdraw this amount.
		 * Bank.getBalance
		 * Bank.payDividend ::: ac.getBalance() = -5.0
		 *** Val = -5.0
		 * Sending letter to this 3379844 account
		 */

		/*
		 * 
		 * /// PARTE DEL QUIZ DONDE SE AÑADE EL CDT /////
		 * 
		 * Bank bank = new Bank();
		 * 
		 * System.out.println("De acá se imprime lo del Quiz :)");
		 * 
		 * // Abren las cuentas de tipo D, que sería la nueva cuenta de tipo CDT
		 * 
		 * bank.openAccount('D', 1018);
		 * bank.openAccount('D', 7913);
		 * bank.openAccount('D', 6969);
		 * 
		 * bank.openAccount('D', 5656);
		 * 
		 * // Deposito a las cuentas
		 * 
		 * bank.deposit(1018, 7800);
		 * bank.deposit(7913, 5600);
		 * bank.deposit(6969, 15000);
		 * 
		 * bank.deposit(5656, 69);
		 * 
		 * System.out.println("Balance de Cuenta CDT 1: "+bank.getBalance(1018));
		 * System.out.println("Balance de Cuenta CDT 2: "+bank.getBalance(7913));
		 * System.out.println("Balance de Cuenta CDT 3: "+bank.getBalance(6969));
		 * 
		 * System.out.println("Balance cuenta xd: "+bank.getBalance(5656));
		 * 
		 * /// calculo del CDT en intereses con X numero de días // rentabilidad
		 * 
		 * bank.calculateCDTInterest(1018, 30);
		 * bank.calculateCDTInterest(7913, 30);
		 * bank.calculateCDTInterest(6969, 30);
		 * 
		 * bank.calculateCDTInterest(5656, 30);
		 * 
		 * bank.printCDTInterest(30);
		 * 
		 * }
		 */

	}
}
