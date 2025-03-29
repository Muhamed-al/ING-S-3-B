package Gestion_Banque;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savings = new SavingsAccount("001", "Alice", 5000, 2.5);
        CurrentAccount current = new CurrentAccount("002", "Bob", 1000, 500);

        bank.addAccount(savings);
        bank.addAccount(current);

        bank.depositToAccount("001", 200);
        bank.withdrawFromAccount("002", 1200);
        savings.applyInterest();

        bank.displayAccountDetails("001");
        bank.displayAccountDetails("002");
    }
}