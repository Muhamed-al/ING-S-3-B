package Gestion_ZOO_tableau;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Zoo zoo = new Zoo();
       while(true){
           afficheMenu();
           int choix = scanner.nextInt();
           switch (choix){
               case 1:
                   ajouterAnimal(scanner,zoo, TypeAnimal.MAMMIFERE);
                   break;
               case 2:
                   ajouterAnimal(scanner,zoo, TypeAnimal.OISEAU);
                   break;
               case 3:
                   ajouterAnimal(scanner, zoo,TypeAnimal.REPTILE);
                   break;
               case 4:
                   zoo.afficherAnimaux();
                   break;
               case 5:
                   zoo.faireDuBruitTous();
                   break;
               case 6:
                   System.out.println("fermeture ....");
                   return;
               default:
                   System.out.println("Option Introuvable ");

           }
       }

    }

    private static void ajouterAnimal(Scanner scanner, Zoo zoo, TypeAnimal typeAnimal) {
        System.out.println(" nom : ");
        String nom = scanner.next();
        System.out.println("Age : ");
        int age = scanner.nextInt();

        switch (typeAnimal){
            case MAMMIFERE:
                System.out.println("temperature ");
                double temp = scanner.nextDouble();
                zoo.ajouterAnimal(new Mammifere(nom,age,temp));
                break;
            case OISEAU :
                System.out.println("Envergure  ");
                double env = scanner.nextDouble();
                zoo.ajouterAnimal(new Oiseau(nom,age,env));
                break;
            case REPTILE :
                System.out.println("Venimeux (true/false) ");
                boolean isVenimaux = scanner.nextBoolean();
                zoo.ajouterAnimal(new Reptile(nom,age,isVenimaux));
                break;
            default:
                System.out.println("error");
                break;
        }
    }

    private static void afficheMenu() {
        System.out.println("Menu Zoo");
        System.out.println("1. Ajouter Mamifere");
        System.out.println("2. Ajouter Oiseau");
        System.out.println("3. Ajouter Reptile");
        System.out.println("4. Affiche Les animaux");
        System.out.println("5. Faire bruit");
        System.out.println("6. Quitter");
    }
}