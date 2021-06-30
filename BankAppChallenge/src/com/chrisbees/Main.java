package com.chrisbees;

public class Main {

    public static void main(String[] args) {
        BankAccount firstBank = new BankAccount();
        System.out.println("Your balance is " + firstBank.getAccountBalance());
        firstBank.addDeposit(5000);
        System.out.println("Your balance is " + firstBank.getAccountBalance());
        firstBank.withdrawFunds(3800);
        System.out.println("Your balance is " + firstBank.getAccountBalance());

    }
}
