package GestionZOO;

public class Mammifere extends Animal {
    private double temperatureCorps;

    public Mammifere(String nom, int age, double temperatureCorps) {
        super(nom, age, TypeAnimal.MAMMIFERE);
        this.temperatureCorps = temperatureCorps;
    }

    public void allaiter() {
        System.out.println("Le mammifère allaite ses petits.");
    }

    @Override
    public void manger() {
        System.out.println("Le mammifère mange.");
    }

    @Override
    public void faireDuBruit() {
        System.out.println("Le mammifère rugit !");
    }
}
