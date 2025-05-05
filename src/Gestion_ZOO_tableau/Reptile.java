package Gestion_ZOO_tableau;

public class Reptile extends Animal {
    private boolean venimeux;

    public Reptile(String nom, int age, boolean venimeux) {
        super(nom, age, TypeAnimal.REPTILE);
        this.venimeux = venimeux;
    }

    public void changerPeau() {
        System.out.println(getNom() + " mue et change de peau.");
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " siffle.");
    }
}
