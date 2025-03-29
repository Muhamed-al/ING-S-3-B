package Gestion_Banque;

public abstract class Account {
    private String accountNumber;
    private double balance;
    private String ownerName;

    public Account(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Dépôt de " + amount + "DT effectué. Nouveau solde : " + balance + "DT");
        } else {
            System.out.println("Le montant du dépôt doit être positif.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Retrait de " + amount + "DT effectué. Nouveau solde : " + balance + "DT");
            return true;
        } else {
            System.out.println("Fonds insuffisants ou montant invalide.");
            return false;
        }
    }

    public abstract void displayAccountDetails();
}
