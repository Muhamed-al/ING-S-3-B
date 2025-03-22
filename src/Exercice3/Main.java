package Exercice3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moto ou voiture ? (m/v) : ");
        String choix = sc.next();

        if(choix.equalsIgnoreCase("m")){
            System.out.println("Donner la marque de la moto : ");
            String marque = sc.next();
            System.out.println("Donner la vitesse maximale de la moto : ");
            double vitesseMax = sc.nextDouble();
            System.out.println("Donner le cylindre de la moto : ");
            int cylindree = sc.nextInt();
            Moto m = new Moto(marque , vitesseMax , cylindree);
            m.afficherInfo();
        } else if (choix.equalsIgnoreCase("v")) {
            System.out.println("Donner la marque de la voiture : ");
            String marque = sc.next();
            System.out.println("donner la vitesse maximale de la voiture : ");
            double vitesseMax = sc.nextDouble();
            System.out.println("Donner le nombre de portes de la voiture : ");
            int nbPortes = sc.nextInt();

            Voiture v = new Voiture(marque , vitesseMax , nbPortes);
            v.afficherInfo();
        }else{
            System.out.println("Choix Invalide");
        }

    }
}
