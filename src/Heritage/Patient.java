package Heritage;

public sealed class Patient extends Personne permits Gestionnaire{
    private String maladie;

    public Patient(String name , String email , String maladie ){
        super(name , email);
        this.maladie = maladie;
    }


    public String getMaladie() {
        return this.maladie;
    }

    public void setMaladie(String maladie){
        this.maladie = maladie;
    }

    public void afficherDetails(){
        super.afficherDetails();
        System.out.println("Maladie : " + this.maladie);
    }



}
