package GestionZOO;

public class Oiseau extends Animal {
    private double envergure;

    public Oiseau(String nom, int age, double envergure) {
        super(nom, age, TypeAnimal.OISEAU);
        this.envergure = envergure;
    }

    public void voler() {
        System.out.println("L’oiseau vole dans le ciel.");
    }

    @Override
    public void manger() {
        System.out.println("L’oiseau picore sa nourriture.");
    }

    @Override
    public void faireDuBruit() {
        System.out.println("L’oiseau chante !");
    }
}
