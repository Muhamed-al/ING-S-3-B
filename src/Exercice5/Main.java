package Exercice5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Donnez le montant a payer");
            double montant =sc.nextDouble();

            System.out.println("choisir le type type de paiment");
            System.out.println("1. Carte Bancaire");
            System.out.println("2. Paypal");
            int choix = sc.nextInt();
            Paiement paiement;
            switch (choix){
                case 1 :
                    paiement = new CarteBancaire();
                    paiement.effectuerPaiement(montant);
                    break;
                case 2 :
                    paiement = new Paypal();
                    paiement.effectuerPaiement(montant);
                    break;
                default:
                    System.out.println("Choix Invalide");
            }
        }

    }
}
