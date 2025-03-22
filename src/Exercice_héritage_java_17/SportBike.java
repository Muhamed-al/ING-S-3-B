package Exercice_héritage_java_17;

public class SportBike extends MotorCycle{

    public SportBike(String brand) {
        super(brand);
    }

    public void turboBoost(){
        System.out.println("la moto active le turbo");
    }
}
