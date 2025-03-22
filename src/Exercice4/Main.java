package Exercice4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        System.out.println("Employer ou Manager (E/M)");
        String choix  = sc.next();

        if (choix.equalsIgnoreCase("e")){
            System.out.println("Donner le nom du l'employé");
            String name = sc.next();
            System.out.println("Donner le salaire de l'employé");
            double salaire = sc.nextDouble();
            Employe e = new Employe(name , salaire);
            e.calculerSalaire();
        } else if (choix.equalsIgnoreCase("m")) {
            System.out.println("donner le nom du manager : ");
            String name = sc.next();
            System.out.println("Donner le salaire de l'employé : ");
            double salaire = sc.nextDouble();
            System.out.println("Donner le prime du manager : ");
            double prime = sc.nextDouble();
            Manager m = new Manager(name , salaire , prime);
            m.calculerSalaire();
        }else{
            System.out.println("Choix Invalide ");
        }
    }
}
