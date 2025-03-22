package Exercice_héritage_java_17;

public sealed class Vehicule permits Car , MotorCycle , Truck{

    private String brand;

    public Vehicule(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void startEngine(){
        System.out.println("Le vehicule demarre");
    }
}
