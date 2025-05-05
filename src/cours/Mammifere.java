package cours;

public class Mammifere extends Animal{

    private double temperatureCorps;

    public Mammifere(String name, int age, double temperatureCorps) {
        super(name, age, TypeAnimal.MAMMIFERE);
        this.temperatureCorps = temperatureCorps;
    }

    public double getTemperatureCorps() {
        return temperatureCorps;
    }

    public void setTemperatureCorps(double temperatureCorps) {
        this.temperatureCorps = temperatureCorps;
    }

    @Override
    public void manger() {
        System.out.println("Les Mammiferes mange");
    }

    @Override
    public void faireDuBruits() {
        System.out.println("Les Mammiferes font du bruits");
    }

    public void allaiter(){
        System.out.println("Le mammiferes nourrit ses petits");
    }
}
