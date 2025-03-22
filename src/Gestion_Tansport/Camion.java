package Gestion_Tansport;

public class Camion extends Vehicule {

    private double poidsMax;

    public Camion(String marque, double prixParJour , double poidsMax ){
        super(marque , prixParJour);
        this.poidsMax = poidsMax;
    }


    @Override
    public double calculerPrixLocation(int jours){
        if (poidsMax >= 3){
            return super.calculerPrixLocation(jours) + jours * 50;
        }else{
            return super.calculerPrixLocation(jours);
        }
    }

    public double getPoidsMax() {
        return poidsMax;
    }

    public void setPoidsMax(double poidsMax) {
        this.poidsMax = poidsMax;
    }
}
