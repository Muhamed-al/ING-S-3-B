package cours;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animal> animaux;

    public Zoo() {
        this.animaux = new ArrayList<>();
    }

    public void ajouterAnimal(Animal animal){
        animaux.add(animal);
    }

    public void afficherAnimaux(){
        for (Animal animal : animaux){
            animal.afficherInfo();
        }

        // Methode 2
        //animaux.forEach(animal -> animal.afficherInfo());
    }

    public void faireTousDubruits(){
        for (Animal animal : animaux){
            animal.faireDuBruits();
        }
        //animaux.forEach(animal-> animal.faireDuBruits());
    }
}
