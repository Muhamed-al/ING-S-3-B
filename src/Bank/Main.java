package Bank;

public class Main {

    public static void main(String[] args){
        Bank bank = new Bank(5);

        SavingsAccount savings = new SavingsAccount("001" , 5000 , "Jhon" , 2.5);
        CurrentAccount current = new CurrentAccount("002" , 5000 , "Doe" , 500);

        bank.addAccount(savings);
        bank.addAccount(current);

        bank.depositToAccount("001" , 800);
        bank.withDraw("002" , 500);

        savings.applyInterest();

        bank.displayAccountDetails("001");
        bank.displayAccountDetails("002");
    }
}
