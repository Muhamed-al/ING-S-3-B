package Exercice3;

public class Vehicule {

    private String marque;
    private double vitesseMax;

    public Vehicule(String marque, double vitesseMax) {
        this.marque = marque;
        this.vitesseMax = vitesseMax;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    public void afficherInfo() {
        System.out.println("Marque: " + marque);
        System.out.println("Vitesse maximale: " + vitesseMax + " km/h");
    }
}
