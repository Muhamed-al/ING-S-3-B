package GestionZOO;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoo zoo = new Zoo();

        int choix;
        do {
            System.out.println("=== Menu du Zoo ===");
            System.out.println("1. Ajouter un mammifère");
            System.out.println("2. Ajouter un oiseau");
            System.out.println("3. Ajouter un reptile");
            System.out.println("4. Afficher tous les animaux");
            System.out.println("5. Faire faire du bruit à tous les animaux");
            System.out.println("6. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Consomme la ligne vide après le nextInt()

            switch (choix) {
                case 1 -> {
                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Âge : ");
                    int age = scanner.nextInt();
                    System.out.print("Température corporelle : ");
                    double temp = scanner.nextDouble();
                    scanner.nextLine();

                    Mammifere m = new Mammifere(nom, age, temp);
                    zoo.ajouterAnimal(m);
                    System.out.println("Mammifère ajouté !");
                }
                case 2 -> {
                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Âge : ");
                    int age = scanner.nextInt();
                    System.out.print("Envergure : ");
                    double envergure = scanner.nextDouble();
                    scanner.nextLine();

                    Oiseau o = new Oiseau(nom, age, envergure);
                    zoo.ajouterAnimal(o);
                    System.out.println("Oiseau ajouté !");
                }
                case 3 -> {
                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Âge : ");
                    int age = scanner.nextInt();
                    System.out.print("Est-il venimeux ? (true/false) : ");
                    boolean venimeux = scanner.nextBoolean();
                    scanner.nextLine();

                    Reptile r = new Reptile(nom, age, venimeux);
                    zoo.ajouterAnimal(r);
                    System.out.println("Reptile ajouté !");
                }
                case 4 -> {
                    System.out.println("Liste des animaux :");
                    zoo.afficherAnimaux();
                }
                case 5 -> {
                    System.out.println("Les animaux font du bruit :");
                    zoo.faireDuBruitTous();
                }
                case 6 -> {
                    System.out.println("Au revoir !");
                }
                default -> {
                    System.out.println("Choix invalide. Veuillez réessayer.");
                }
            }

        } while (choix != 6);

        scanner.close();
    }
}
