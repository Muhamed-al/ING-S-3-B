package Polymorphisme.Surcharge;

public class Calculator{

    int add(){
        return 1;
    }

    int add(int a , int b){
        return a+b;
    }


    String add(String a , String b){
        return a+b;
    }

    double add(double a , double b ){
        return a+b;
    }
}
