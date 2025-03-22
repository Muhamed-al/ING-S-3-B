package Polymorphisme.Redefinition;

public class Chat extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Le chat miaule");
    }
}
