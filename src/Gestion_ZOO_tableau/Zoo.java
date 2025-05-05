package Gestion_ZOO_tableau;

public class Zoo {
    private Animal[] animaux;
    private int nombresAnimaux;
    public Zoo() {
        animaux = new Animal[10];
        this.nombresAnimaux = 0;
    }

    public void ajouterAnimal(Animal animal) {
        if (nombresAnimaux < animaux.length){
            animaux[nombresAnimaux++] = animal;
            System.out.println(nombresAnimaux);
            System.out.println("Animal ajouté avec succes");
        }
    }

    public void afficherAnimaux()
    {
        if (nombresAnimaux == 0){
            System.out.println("Aucun Animal");
        }else {
            for (int i = 0; i < animaux.length; i++) {
                if (animaux[i] != null){
                    animaux[i].afficherInfos();
                }
            }
        }
    }

    public void faireDuBruitTous() {
        for (int i = 0; i < animaux.length; i++) {
            if (animaux[i] != null){
                animaux[i].faireDuBruit();
            }
        }
    }
}