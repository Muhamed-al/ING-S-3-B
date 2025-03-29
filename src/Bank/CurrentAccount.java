package Bank;

public class CurrentAccount extends Account{

    private double overDraftLimit;

    public CurrentAccount(String accountNumber, double balance, String ownerName, double overDraftLimit) {
        super(accountNumber, balance, ownerName);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double montant){
        if (montant > 0 && getBalance() +overDraftLimit >= montant){
            setBalance(getBalance() - montant);
            System.out.println("Retrait de " + montant +" effectué avec succes. Nouveau solde : " + getBalance());
        }else{
            System.out.println("Retrait refusé : depassment de la limite ");
        }
    }

    @Override
    public void dispalyAccountDetails() {
        System.out.println("Compte Epargne - " + getOwnerName());
        System.out.println("Numéro " + getAccountNumber());
        System.out.println("Solde " + getBalance());
        System.out.println("Limite de decouert " + overDraftLimit);
    }


}
