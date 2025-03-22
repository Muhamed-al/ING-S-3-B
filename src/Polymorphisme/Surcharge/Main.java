package Polymorphisme.Surcharge;

public class Main {

    public static void main(String[] args){
        Calculator cal = new Calculator();
        int a = 10 ;
        int b = 23;

        double x = 10.6;
        double y = 45.2;

        int res = cal.add(a , b);
        double res1 = cal.add(x,y);

    }
}
