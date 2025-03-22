package Polymorphisme.Redefinition;


public class Main {

    public static void main(String[] args){

        Animal[] animaux = new Animal[2];
        Animal chat1  = new Chat();
        Animal chien1 = new Chien();

        animaux[0] = chien1;
        animaux[1] = chat1;

        for (int i = 0 ; i < animaux.length ; i++){
            if(animaux[i] instanceof Chien){
                System.out.println("Chien");
            }else{
                System.out.println("Chat ");
            }
            animaux[i].makeSound();
        }

        for (Animal a : animaux){
            a.makeSound();
        }




    }
}
