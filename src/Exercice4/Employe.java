package Exercice4;

public class Employe {

    private String name;
    private double salaire;

    public Employe(String name , double salaire){
        this.name = name;
        this.salaire = salaire;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public void calculerSalaire(){
        System.out.println("Salaire : " + salaire);
    }
}
