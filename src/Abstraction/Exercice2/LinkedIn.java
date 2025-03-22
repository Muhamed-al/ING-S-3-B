package Abstraction.Exercice2;

public class LinkedIn extends Message{

    public LinkedIn(String contenu) {
        super(contenu);
    }

    @Override
    public void envoyer() {
        System.out.println("Message par linkedIn envoyé" + getContenu());
    }
}
