package Exercice_héritage_java_17;

public non-sealed class MotorCycle extends Vehicule{

    public MotorCycle(String brand) {
        super(brand);
    }

    public void wheelie(){
        System.out.println("la moto fait un wheeling");
    }
}
