package Exercice4;

public class Manager extends Employe{

    private double prime;

    public Manager(String name , double salaire , double prime){
        super(name , salaire);
        this.prime = prime;
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public void calculerSalaire(){
        System.out.println("Salaire : " + (getSalaire() + prime));
    }

}
