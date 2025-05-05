package Gestion_Quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QCM extends Question{

    private List<String> responses;
    private int correctResponse;
    public  QCM(String question, Difficulte difficulte, int nbPoints ,int correctResponse){
        super(question , difficulte , nbPoints);
        this.responses = new ArrayList<>();
        this.correctResponse = correctResponse;
    }


    @Override
    public void ask() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Question : " + getQuestion());
    }
}
