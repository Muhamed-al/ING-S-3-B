package Exercice3;

public class Moto extends Vehicule{
    private int cylindree;

    public Moto(String marque, double vitesseMax , int cylindree) {
        super(marque, vitesseMax);
        this.cylindree = cylindree;
    }

    public int getCylindree() {
        return cylindree;
    }

    public void setCylindree(int cylindree) {
        this.cylindree = cylindree;
    }

    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Cylindree: " + cylindree + " cc");
    }
}
