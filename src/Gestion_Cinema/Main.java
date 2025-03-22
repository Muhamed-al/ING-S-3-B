package Gestion_Cinema;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        CinemaHall cinema = new CinemaHall(5 , 5);

        while(true){
            System.out.println("Menu");
            System.out.println("1. Afficher Cinéma");
            System.out.println("2. Reserver une place");
            System.out.println("3. Libérer une place");
            System.out.println("4. Quitter");

            int choix = sc.nextInt();

            int row;
            int col;
            switch (choix){
                case 1 :
                    cinema.displaySeats();
                    break;
                case 2 :
                    System.out.println("Donner le numéro du rangée");
                    row = sc.nextInt();
                    System.out.println("Donner le numero du place");
                    col = sc.nextInt();
                    cinema.reserve(row , col);
                    break;
                case 3 :
                    System.out.println("Donner le numéro du rangée");
                    row = sc.nextInt();
                    System.out.println("Donner le numero du place");
                    col = sc.nextInt();
                    cinema.release(row , col);
                    break;
                case 4 :
                    System.out.println("Merci d'avoir utiliser notre system de gestion de cinema");
                    return;
                default:
                    System.out.println("Choix Invalide");
            }
        }
    }
}
