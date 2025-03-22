package Exercice5;

public class CarteBancaire extends Paiement{

    @Override
    public void effectuerPaiement(double montant){
        System.out.println("Paiment de "+montant+" effectué avec Carte Bancaire ");
    }
}
