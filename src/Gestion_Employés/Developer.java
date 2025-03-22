package Gestion_Employés;

public class Developer extends Employe{

    private double nbHeuresSupp;

    public Developer(String nom , int age , double salaire , double nbHeuresSupp){
        super(nom , age , salaire);
        this.nbHeuresSupp = nbHeuresSupp;
    }

    public double getNbHeuresSupp() {
        return nbHeuresSupp;
    }

    public void setNbHeuresSupp(double nbHeuresSupp) {
        this.nbHeuresSupp = nbHeuresSupp;
    }

    @Override
    public void afficherDetails(){
        super.afficherDetails();
        System.out.println("Nombre des heures Suppl : " + nbHeuresSupp);
    }
}
