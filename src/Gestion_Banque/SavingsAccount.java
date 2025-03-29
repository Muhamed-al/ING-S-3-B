package Gestion_Banque;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String ownerName, double initialBalance, double interestRate) {
        super(accountNumber, ownerName, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        setBalance(getBalance() + interest);
        System.out.println("Intérêts de " + interest + "DT appliqués. Nouveau solde : " + getBalance() + "DT");
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Compte Épargne - " + getOwnerName() + " (N°: " + getAccountNumber() + ")");
        System.out.println("Solde : " + getBalance() + "DT | Taux d'intérêt : " + interestRate + "%");
    }
}
