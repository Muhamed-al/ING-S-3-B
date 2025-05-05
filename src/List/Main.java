package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 1. Créer une liste
        List<String> fruits = new ArrayList<>();

        // 2. Ajouter des éléments
        fruits.add("Pomme");
        fruits.add("Banane");
        fruits.add("Orange");
        fruits.add("Mangue");
        fruits.add("Banane"); // Doublon volontaire
        System.out.println("Liste des fruits : " + fruits);

        // 3. Ajouter à un index spécifique
        fruits.add(2, "Fraise");

        // 4. Afficher la liste
        System.out.println("Liste des fruits : " + fruits);

        // 5. Obtenir un élément
        String premier = fruits.get(0);
        System.out.println("Premier fruit : " + premier);

        // 6. Modifier un élément
        fruits.set(1, "Ananas");
        System.out.println("Liste après modification : " + fruits);

        // 7. Vérifier si un fruit est présent
        if (fruits.contains("Pomme")) {
            System.out.println("Pomme est dans la liste !");
        }

        // 8. Trouver l'index d'un élément
        System.out.println("Index de 'Banane' : " + fruits.indexOf("Banane"));
        System.out.println("Dernier index de 'Banane' : " + fruits.lastIndexOf("Banane"));

        // 9. Supprimer un élément par index
        fruits.remove(2); // Retire "Fraise"
        System.out.println("Après suppression par index : " + fruits);

        // 10. Supprimer un élément par nom
        fruits.remove("Mangue");
        System.out.println("Après suppression de 'Mangue' : " + fruits);

        // 11. Taille de la liste
        System.out.println("Taille de la liste : " + fruits.size());

        // 12. Vérifier si la liste est vide
        System.out.println("La liste est vide ? " + fruits.isEmpty());

        // 13. Boucle avec forEach
        System.out.println("Liste finale :");
        fruits.forEach(fruit -> System.out.println("- " + fruit));

        // 14. Convertir en tableau
            Object[] tableauFruits = fruits.toArray();
        System.out.println("Tableau : " + Arrays.toString(tableauFruits));

        // 15. Vider la liste
        fruits.clear();
        System.out.println("Liste après clear : " + fruits);
        System.out.println("Est vide ? " + fruits.isEmpty());
    }
}
