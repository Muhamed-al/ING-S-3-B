package Gestion_ZOO_tableau;

public class Oiseau extends Animal {
    private double envergure;

    public Oiseau(String nom, int age, double envergure) {
        super(nom, age, TypeAnimal.OISEAU);
        this.envergure = envergure;
    }

    public void voler() {
        System.out.println(getNom() + " vole dans le ciel.");
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " chante ou piaille.");
    }


}