package Gestion_Quiz;

import java.util.Scanner;

public class YesOrNoQuestion extends  Question{
    private boolean correctResponse;

    public YesOrNoQuestion(String question, Difficulte difficulte, int nbPoints, boolean correctResponse) {
        super(question, difficulte, nbPoints);
        this.correctResponse = correctResponse;
    }

    public boolean isCorrectResponse() {
        return correctResponse;
    }

    public void setCorrectResponse(boolean correctResponse) {
        this.correctResponse = correctResponse;
    }

    @Override
    public void ask() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Question :" + getQuestion());
        String response = sc.nextLine();
    }
}
