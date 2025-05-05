package Gestion_ZOO_tableau;

abstract class Animal extends AnimalActions {
    private String nom;
    private int age;
    private TypeAnimal type;

    public Animal(String nom, int age, TypeAnimal type) {
        this.nom = nom;
        this.age = age;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void afficherInfos() {
        System.out.println("Nom: " + nom + ", Age: " + age + ", Type: " + type);
    }

    @Override
    public void manger() {
        System.out.println(nom + " mange.");
    }

    @Override
    public abstract void faireDuBruit();
}