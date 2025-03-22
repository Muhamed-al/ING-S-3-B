package Gestion_Tansport;

import java.lang.invoke.VarHandle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Voiture");
        System.out.println("2. Camion");
        int choix = sc.nextInt();

        System.out.println("Donner la marque du voiture");
        String marque = sc.next();
        System.out.println("Donne le prix par jours");
        double prixParJour = sc.nextDouble();

        if (choix == 1 ){
            System.out.println("Donner le type de carburant Diesel/Essence");
            String typeCarburant = sc.next();
            Vehicule vehicule = new Voiture(marque , prixParJour , typeCarburant);

            System.out.println("Donne rle nombre du jours du location");
            int nbJours = sc.nextInt();

            double res = vehicule.calculerPrixLocation(nbJours);
            System.out.println("Prix Total : " + res);
        }else if (choix == 2){
            System.out.println("Donne le poids max du camion");
            double poidsMax =sc.nextDouble();
            Vehicule vehicule = new Camion(marque , prixParJour , poidsMax);

            System.out.println("Donne rle nombre du jours du location");
            int nbJours = sc.nextInt();
            double res = vehicule.calculerPrixLocation(nbJours);

            System.out.println("Prix Total : " + res);
        } else{
            System.out.println("Choix Invalide ! ");
        }
    }
}
