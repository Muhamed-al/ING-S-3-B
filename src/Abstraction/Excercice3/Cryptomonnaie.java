package Abstraction.Excercice3;

public class Cryptomonnaie extends Paiement{
    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement effectué par cryptomonnaie");
    }
}
