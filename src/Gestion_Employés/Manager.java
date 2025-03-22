package Gestion_Employés;

public class Manager extends Employe{

    private double prime;


    public Manager (String nom , int age , double salaire , double prime){
        super(nom, age, salaire);
        this.prime = prime;
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    @Override
    public void afficherDetails(){
        super.afficherDetails();
        System.out.println("Prime  :" + prime);
    }
}
