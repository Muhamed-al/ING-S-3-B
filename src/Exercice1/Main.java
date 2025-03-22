package Exercice1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Donner le titre du livre ");
        String titre = sc.nextLine();
        System.out.println("Donner l'auteur du livre ");
        String auteur = sc.nextLine();
        System.out.println("Donner la disponibilité du livre ");
        boolean dispo = sc.nextBoolean();

        Livre l = new Livre(titre , auteur , dispo);

        System.out.println("Que voulez vous faire : ");
        System.out.println("1 - Emprunter");
        System.out.println("2 - Retourner");
        int choix = sc.nextInt();

        switch(choix){
            case 1 :
                l.emprunter();
                break;
            case 2 :
                l.retourner();
                break;
            default :
                System.out.println("Vous devez choisir entre 1 et 2 ");
        }
    }
}