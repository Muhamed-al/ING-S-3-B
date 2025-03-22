package Gestion_Employés;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Entreprise entreprise = new Entreprise(2);

        while(true){
            System.out.println("Menu");
            System.out.println("1. Afficher Entreprise");
            System.out.println("2. Ajouter Employer");
            System.out.println("3. Quitter");
            int choix = sc.nextInt();

            switch (choix){
                case 1 :
                    entreprise.afficherTousLesEmployes();
                    break;
                case 2 :
                    System.out.println("Voulez vous ajouter un Manager (M) ou Developer(D)");
                    String type = sc.next();

                    Employe employe;
                    System.out.println("Donner le nom d'employe");
                    String nom = sc.next();
                    System.out.println("Donne l'age du l'employé ");
                    int age = sc.nextInt();
                    System.out.println("Donner le salaire du l'employé ");
                    double salaire= sc.nextDouble();
                    if (type.equalsIgnoreCase("d")){
                        System.out.println("Donner le nomebre des heures Suppl");
                        double nbHeuresSupp = sc.nextDouble();
                        employe = new Developer(nom , age , salaire , nbHeuresSupp);
                        entreprise.ajouterEmploye(employe);
                    } else if (type.equalsIgnoreCase("m")) {
                        System.out.println("Donner le prime du Manager");
                        double prime = sc.nextDouble();
                        employe = new Manager(nom , age , salaire , prime);
                        entreprise.ajouterEmploye(employe);
                    }else {
                        System.out.println("Choix Invalide");
                    }
                    break;
                case 3 :
                    System.out.println("Merci d'avoir utiliser notre systeme de gestion des employés ");
                    return;
                default:
                    System.out.println("Choix invalide");
            }
        }
    }
}
