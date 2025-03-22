package Abstraction.Exercice1;

public class Main {

    public static void main(String[] args){
        Vehicule voiture = new Voiture();
        voiture.demarrer();
        voiture.arreter();


        Vehicule moto = new Moto();
        moto.demarrer();
        moto.arreter();

    }
}
