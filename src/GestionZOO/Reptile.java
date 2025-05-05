package GestionZOO;

public class Reptile extends Animal {
    private boolean venimeux;

    public Reptile(String nom, int age, boolean venimeux) {
        super(nom, age, TypeAnimal.REPTILE);
        this.venimeux = venimeux;
    }

    public void changerPeau() {
        System.out.println("Le reptile mue (change de peau).");
    }

    @Override
    public void manger() {
        System.out.println("Le reptile mange silencieusement.");
    }

    @Override
    public void faireDuBruit() {
        System.out.println("Le reptile siffle !");
    }
}
