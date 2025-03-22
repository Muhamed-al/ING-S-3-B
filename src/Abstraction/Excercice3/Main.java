package Abstraction.Excercice3;

public class Main {

    public static void main(String[] args){
        Paiement paypal = new Paypal();
        paypal.effectuerPaiement(100);

        Paiement crypto = new Cryptomonnaie();
        crypto.effectuerPaiement(300);
    }
}
