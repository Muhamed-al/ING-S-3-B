package Exercice5;


public class Paypal extends Paiement {

    @Override
    public void effectuerPaiement(double montant){
        System.out.println("Paiment de "+montant+" effectué avec Paypal ");
    }
}
