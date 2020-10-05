package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		AccountHolder maynardK = new AccountHolder(
				"Maynard",
				"G.",
				"Krebs",
				"007252017",
				100.0,
				1000.0);
		System.out.println(maynardK.toString());
		maynardK.getCheckingAccount().deposit(500);
		maynardK.getSavingsAccount().withdraw(800);
		System.out.println(maynardK.getCheckingAccount().toString());
		System.out.println(maynardK.getSavingsAccount().toString());
		AccountHolder dobieG = new AccountHolder(
				"Dobie",
				"",
				"Gillis",
				"123456789",
				200.0,
				500.0);
		System.out.println(dobieG.toString());
		dobieG.getCheckingAccount().deposit(-500);
		dobieG.getSavingsAccount().withdraw(600);
		System.out.println(dobieG.toString());
	}

}