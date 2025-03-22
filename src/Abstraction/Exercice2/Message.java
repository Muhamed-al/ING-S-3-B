package Abstraction.Exercice2;

public abstract class Message {

    private String contenu;

    public Message(String contenu) {
        this.contenu = contenu;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public abstract void envoyer();
}
