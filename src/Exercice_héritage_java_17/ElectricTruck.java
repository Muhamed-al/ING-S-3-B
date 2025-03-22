package Exercice_héritage_java_17;

public final class ElectricTruck  extends Truck{


    public ElectricTruck(String brand) {
        super(brand);
    }

    public void chargeBaterry(){
        System.out.println("Le camion elec recharge sa batterie");
    }
}
