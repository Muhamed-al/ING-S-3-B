package Gestion_Quiz;

public abstract class Question {

    private String question;
    private Difficulte difficulte;
    private int nbPoints;

    public Question(String question, Difficulte difficulte, int nbPoints) {
        this.question = question;
        this.difficulte = difficulte;
        this.nbPoints = nbPoints;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Difficulte getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(Difficulte difficulte) {
        this.difficulte = difficulte;
    }

    public int getNbPoints() {
        return nbPoints;
    }

    public void setNbPoints(int nbPoints) {
        this.nbPoints = nbPoints;
    }

    public abstract void ask();
}
