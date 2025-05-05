package cours;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Zoo zoo = new Zoo();

        Animal mammifere = new Mammifere("aaaa" , 22 , 45);
        zoo.ajouterAnimal(mammifere);

        Animal oiseau = new Oiseau("qqqq" , 12 , 2.5);
        zoo.ajouterAnimal(oiseau);

        zoo.afficherAnimaux();

        zoo.faireTousDubruits();

    }
}
