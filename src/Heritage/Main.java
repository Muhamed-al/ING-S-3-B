package Heritage;

public class Main {

    public static void main(String[] args) {

        Personne p = new Personne("Amine", "2i8Ft@example.com");
        p.afficherDetails();


        Patient pat = new Patient("Jhon Doe", "2i8Ft@example.com", "Maladie 1");
        pat.afficherDetails();


        Doctor d = new Doctor("DR. FOULEN ", "2i8Ft@example.com", "Specialite 1");
        d.afficherDetails();
    }
}
