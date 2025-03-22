package Exercice3;

public class Voiture extends Vehicule{

    private int nbPortes;

    public Voiture(String marque, double vitesseMax , int nbPortes){
        super(marque , vitesseMax);
        this.nbPortes = nbPortes;
    }

    public int getNbPortes() {
        return nbPortes;
    }

    public void setNbPortes(int nbPortes) {
        this.nbPortes = nbPortes;
    }

    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Nombre de portes: " + nbPortes);
    }

}
