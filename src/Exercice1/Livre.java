package Exercice1;

public class Livre {
    private String titre;
    private String auteur;
    private boolean dispo;

    public Livre(String titre , String auteur , boolean dispo){
        this.titre= titre ;
        this.auteur = auteur;
        this.dispo = dispo;
    }

    public String getTitre(){
        return this.titre;
    }

    public void setTitre(String titre){
        this.titre= titre;
    }

    public String getAuteur(){
        return this.auteur;
    }

    public void setAuteur(String auteur){
        this.auteur= auteur;
    }

    public boolean isDispo(){
        return this.dispo;
    }

    public void setDispo(boolean dispo){
        this.dispo = dispo;
    }

    public void emprunter(){
        if (dispo){
            System.out.println("Vous avez emprunté le livre " + titre + " avec succés");
            dispo = false;
        }else{
            System.out.println("Le livre " + titre + "n'est pas disponible");
        }
    }

    public void retourner(){
        dispo = true;
        System.out.println("Vous avez retourné le livre " + titre + "avec succés");
    }


}
