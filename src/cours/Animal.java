package cours;

public abstract class Animal implements AnimalActions{

    private String name;
    private int age;
    private TypeAnimal type;

    public Animal(String name, int age, TypeAnimal type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TypeAnimal getType() {
        return type;
    }

    public void setType(TypeAnimal type) {
        this.type = type;
    }

    public void afficherInfo(){
        System.out.println("Nom : " + name);
        System.out.println("Age : " + age);
        System.out.println("Type : " + type);
    }

}
