package Exercice_héritage_java_17;

public final class Car extends Vehicule{


    public Car(String brand) {
        super(brand);
    }

    public void drive(){
        System.out.println("la voiture roule");
    }
}
