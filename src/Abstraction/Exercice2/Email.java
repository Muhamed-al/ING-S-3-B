package Abstraction.Exercice2;

public class Email extends Message{

    public Email(String contenu) {
        super(contenu);
    }

    @Override
    public void envoyer() {
        System.out.println("Email envoyé : " + getContenu());
    }
}
