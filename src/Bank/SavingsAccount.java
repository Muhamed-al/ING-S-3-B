package Bank;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, String ownerName, double interestRate) {
        super(accountNumber, balance, ownerName);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        double interest = getBalance() * interestRate/100;
        setBalance(getBalance() + interest);
        System.out.println("Interets de " + interest + "appliqués");
    }


    @Override
    public void dispalyAccountDetails() {
        System.out.println("Compte Epargne - " + getOwnerName());
        System.out.println("Numéro " + getAccountNumber());
        System.out.println("Solde " + getBalance());

    }
}
