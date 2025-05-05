package Hangman;

public class Word {
    private  String mot;
    private Category categorie;
    private boolean[] lettresDevinees;

    public Word(String mot, Category categorie) {
        this.mot = mot.toUpperCase();
        this.categorie = categorie;
        this.lettresDevinees = new boolean[mot.length()];
    }

    public Category getCategorie() {
        return categorie;
    }

    public boolean devinerLettre(char lettre) {
        lettre = Character.toUpperCase(lettre);

        for (int i = 0; i < mot.length(); i++) {
            if (mot.charAt(i) == lettre) {
                lettresDevinees[i] = true;
                return true;
            }
        }
        return false;
    }

    public boolean estComplet() {
        for (boolean devine : lettresDevinees) {
            if (!devine)
                return false;
        }
        return true;
    }

    public String getMotMasque() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mot.length(); i++) {
            if (lettresDevinees[i] == true) {
                sb.append(mot.charAt(i)).append(" ");
            } else {
                sb.append("_ ");
            }
        }
        return sb.toString().trim();

        ///  "jihed  ".trim() ) => "jihed"
     }

    public String getMotOriginal() {
        return mot;
    }
}