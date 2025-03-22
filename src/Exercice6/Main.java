package Exercice6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Chien");
        System.out.println("2. Chat");

        int choix = sc.nextInt();


        Animal animal;
        switch (choix){
            case 1 :
                animal = new Chien();
                animal.faireSon();
                break;
            case 2 :
                animal = new Chat();
                animal.faireSon();
                break;
            default:
                System.out.println("Choix Invalide");
        }
    }
}
