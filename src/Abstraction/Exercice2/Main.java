package Abstraction.Exercice2;

public class Main {

    public static void main(String[] args){
        Message email = new Email("Bonjour");
        email.envoyer();

        Message sms = new SMS("Bonjour ca va ?");
        sms.envoyer();

        Message linkedIn = new LinkedIn("Bonjour from LinkedIn");
        linkedIn.envoyer();
    }
}
