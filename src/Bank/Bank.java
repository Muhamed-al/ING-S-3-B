package Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private Account[] accounts;
    private int nbCompte;

    public Bank(int taille) {
        this.accounts = new Account[taille];
        this.nbCompte = 0;
    }

    public void addAccount(Account account){
        if (nbCompte < accounts.length){
            accounts[nbCompte++] = account;
            System.out.println("Compte ajouté avec succes ");
        }else{
            System.out.println("Bank complet");
        }
    }

    public void depositToAccount(String accountNumber , double montant){
        Account acc = findAccount(accountNumber);
        if (acc != null){
            acc.deposit(montant);
        }else{
            System.out.println("Compte non trouvé");
        }
    }

    public void withDraw(String accountNumber , double montant){
        Account acc = findAccount(accountNumber);
        if (acc != null){
            acc.withdraw(montant);
        }else{
            System.out.println("Compte non trouvé");
        }
    }

    public void displayAccountDetails(String accountNumber){
        Account acc = findAccount(accountNumber);
        if (acc != null){
            acc.dispalyAccountDetails();
        }else{
            System.out.println("Compte non trouvé");
        }
    }


    private Account findAccount(String accountNumber){
        for (Account acc : accounts){
            if (acc.getAccountNumber().equals(accountNumber)){
                return acc;
            }
        }
        return null;
    }
}
