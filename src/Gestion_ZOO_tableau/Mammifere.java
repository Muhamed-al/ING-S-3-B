package Gestion_ZOO_tableau;

public class Mammifere extends Animal {
    private double temperatureCorps;

    public Mammifere(String nom, int age, double temperatureCorps) {
        super(nom, age, TypeAnimal.MAMMIFERE);
        this.temperatureCorps = temperatureCorps;
    }

    public void allaiter() {
        System.out.println(getNom() + " nourrit ses petits.");
    }

    @Override
    public void faireDuBruit() {
        System.out.println( getNom() + " rugit ou grogne.");
    }

}