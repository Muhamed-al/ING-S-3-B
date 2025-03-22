package Exercice_héritage_java_17;

public class Main {

    public static void main(String[] args){
        System.out.println("******** CAR ");
        Car car = new Car("Toyota");
        car.startEngine();
        car.drive();
        System.out.println("******** MotorCycle ");
        MotorCycle moto = new MotorCycle("Yamaha");
        moto.startEngine();
        moto.wheelie();
        System.out.println("******** SportBike ");
        SportBike bike = new SportBike("Ducati");
        bike.startEngine();
        bike.turboBoost();
        bike.wheelie();
        System.out.println("******** ElectricTruck ");
        ElectricTruck eTruck = new ElectricTruck("Tesla");
        eTruck.startEngine();
        eTruck.chargeBaterry();
        eTruck.loadCargo();
    }
}
