package Gestion_Employés;

public class Entreprise {

    private Employe[] employes;
    private int compteur;

    public Entreprise(int nbEmpl){
        this.employes = new Employe[nbEmpl];
        this.compteur = 0;
    }

    public void ajouterEmploye(Employe e){
        if (compteur < employes.length){
            employes[compteur] = e;
            compteur++;
        }else{
            System.out.println("Entreprise pleine ! ");
        }
    }

    public void afficherTousLesEmployes(){
        // Method 1 : with int i
        /*for(int i = 0 ; i< employes.length ;i++){
            employes[i].afficherDetails();
        }*/
        // Method 2 : with element
        for(Employe e : employes){
            e.afficherDetails();
            System.out.println("-----------------------------");
        }
    }

    public Employe[] getEmployes() {
        return employes;
    }

    public void setEmployes(Employe[] employes) {
        this.employes = employes;
    }

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }
}
