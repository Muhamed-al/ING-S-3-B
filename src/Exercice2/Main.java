package Exercice2;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner numero du compte ");
        int numCompte = sc.nextInt();
        System.out.println("Donner votre solde :");
        double solde = sc.nextDouble();

        CompteBancaire compte = new CompteBancaire(numCompte , solde);
        while(true){
            System.out.println("Que voulez vous faire :");
            System.out.println("1 - Deposer");
            System.out.println("2 - Retirer");
            int choix = sc.nextInt();
            double montant;
            switch (choix){
                case 1 :
                    System.out.println("Donner le montant a deposé");
                    montant = sc.nextDouble();
                    compte.deposer(montant);
                    break;
                case 2 :
                    System.out.println("Donner le montant a retiré");
                    montant = sc.nextDouble();
                    compte.retirer(montant);
                    break;
                default:
                    System.out.println("ERROOOOOOOOOOOOOOOOOOOOOOOR");
            }
        }

    }
}