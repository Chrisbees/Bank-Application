package com.chrisbees;

public class BankAccount {
    private String accountName;
    private String accountNumber;
    private int accountBalance;
    private String email;
    private String phoneNumber;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public void addDeposit(int accountBalance){
        if (accountBalance > 0) {
            this.accountBalance+=accountBalance;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdrawFunds(int withdraw){
        if (this.accountBalance < withdraw){
            System.out.println("Insufficient Funds");
        } else {
            this.accountBalance-=withdraw;
        }
    }
}
