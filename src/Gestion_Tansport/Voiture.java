package Gestion_Tansport;

public class Voiture extends  Vehicule{

    private String typeCarburant;

    public Voiture(String marque, double prixParJour , String typeCarburant){
        super(marque , prixParJour);
        this.typeCarburant = typeCarburant;

    }

    @Override
    public double calculerPrixLocation(int jours){
        if (typeCarburant.equalsIgnoreCase("diesel")){
            return super.calculerPrixLocation(jours) + jours*10;
        }else {
            return super.calculerPrixLocation(jours);
        }
    }


    public String getTypeCarburant() {
        return typeCarburant;
    }

    public void setTypeCarburant(String typeCarburant) {
        this.typeCarburant = typeCarburant;
    }
}
