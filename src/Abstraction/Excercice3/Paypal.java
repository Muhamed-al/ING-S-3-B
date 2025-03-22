package Abstraction.Excercice3;

public class Paypal extends Paiement{


    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement effectué par Paypal");
    }
}
