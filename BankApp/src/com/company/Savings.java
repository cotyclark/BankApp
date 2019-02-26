package com.company;

public class Savings extends Account {
    private static String accountType = "Savings";

    Savings (double initialDeposit) {
        super();
        this.setBalance(initialDeposit);
        this.checkInterest(0);
    }

    @Override
    public String toString() {
        return "Account Type: " + accountType + " Account\n" +
                "Account Number: " + this.getAccountNumber() + "\n" +
                "Balance: " + this.getBalance() + "\n" +
                "Interest Rate: " + this.getInterest() + "%\n";
    }
}
