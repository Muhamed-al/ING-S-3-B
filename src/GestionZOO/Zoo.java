package GestionZOO;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animaux;

    public Zoo() {
        animaux = new ArrayList<>();
    }

    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
    }

    public void afficherAnimaux() {
        for (Animal a : animaux) {
            a.afficherInfos();
            System.out.println("---");
        }
    }

    public void faireDuBruitTous() {
        for (Animal a : animaux) {
            a.faireDuBruit();
        }
    }
}
