package Exercice1;

public class Personne {

    private String name;
    private int age;
    private int cin;

    public Personne(String n , int a , int c ){
        name=n;
        age=a;
        cin=c;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age=a;
    }
    public int getCin(){
        return cin;
    }
    public void setCin(int c){
        cin=c;
    }

    public void afficherDetails(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Cin : " + cin);
    }


}
