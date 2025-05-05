package cours;

public class Oiseau extends Animal{

    private double envergure;

    public Oiseau(String name, int age, double envergure) {
        super(name, age, TypeAnimal.OISEAU);
        this.envergure = envergure;
    }

    public double getEnvergure() {
        return envergure;
    }

    public void setEnvergure(double envergure) {
        this.envergure = envergure;
    }

    @Override
    public void manger() {
        System.out.println("Les oiseaux mange");
    }
    @Override
    public void faireDuBruits() {
        System.out.println("Les oiseaux font du bruits");
    }


}
