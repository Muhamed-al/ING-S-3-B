package StringBuilder;

public class Main {

    public static void main(String[] args){
        // Les String sont non modifiables
        // A chaque concaténation la JVM crée un autre objet dans la mémoire
        String message="Bonjour";
        System.out.println(message.concat(" ing 3 n"));

        // Les StringBuilder sont modifiables
        StringBuilder sb= new StringBuilder();
        sb.append("Bonjour"); // append permet d'ajouter a la fin de la chaine
        System.out.println(sb);
        sb.append(" Le monde");
        sb.insert(7 , " tout "); // insert permet d'ajouter a une indice donnée
        System.out.println(sb);

        String result = sb.toString(); // toString() est utilisée pour transformer une StringBuilder vers String


    }
}
