package Gestion_Banque;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String ownerName, double initialBalance, double overdraftLimit) {
        super(accountNumber, ownerName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double limit) {
        this.overdraftLimit = limit;
        System.out.println("Limite de découvert définie à " + overdraftLimit + "DT");
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Retrait de " + amount + "DT effectué. Nouveau solde : " + getBalance() + "DT");
            return true;
        } else {
            System.out.println("Retrait refusé : dépassement de la limite de découvert.");
            return false;
        }
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Compte Courant - " + getOwnerName() + " (N°: " + getAccountNumber() + ")");
        System.out.println("Solde : " + getBalance() + "DT | Limite de découvert : " + overdraftLimit + "DT");
    }
}
