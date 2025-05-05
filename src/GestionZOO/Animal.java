package GestionZOO;

public abstract class Animal implements AnimalActions {
    private String nom;
    private int age;
    private TypeAnimal type;

    public Animal(String nom, int age, TypeAnimal type) {
        this.nom = nom;
        this.age = age;
        this.type = type;
    }

    public void afficherInfos() {
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);
        System.out.println("Type : " + type);
    }
}
