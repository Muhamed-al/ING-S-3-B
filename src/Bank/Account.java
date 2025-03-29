package Bank;

public abstract class Account {

    private String accountNumber;
    private double balance;
    private  String ownerName;

    public Account(String accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void  deposit(double montant){
        if (montant < 0){
            System.out.println("le montant doit etre positif");
        }else{
            balance += montant;
            System.out.println("Depot de " + montant +" effectué avec succes. Nouveau solde : " + balance);
        }
    }

    public void withdraw(double montant){
        if (montant > 0 && montant<= balance){
            balance -= montant;
            System.out.println("Retrait de " + montant +" effectué avec succes. Nouveau solde : " + balance);
        }else{
            System.out.println("Fond insuffisant ou montant invalide");
        }
    }

    public abstract void dispalyAccountDetails();
}
