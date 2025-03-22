package Heritage;

public non-sealed class Doctor extends Personne{


    private String specialite;

    public Doctor(String name , String email , String specialite ){
        super(name , email);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Specialite : " + this.specialite);
    }



}
