package Hangman;

import java.util.Scanner;

public class Game {
    private Word[]  mots = {
            new Word("LION", Category.ANIMAUX),
            new Word("CHAT", Category.ANIMAUX),
            new Word("FRANCE", Category.PAYS),
            new Word("JAPON", Category.PAYS),
            new Word("AVATAR", Category.FILMS),
            new Word("BATMAN", Category.FILMS),
            new Word("TABLE", Category.OBJETS),
            new Word("LAMPE", Category.OBJETS)
    };

    private Word motADeviner;
    private int erreurs = 0;
    private final int MAX_ERREURS = 6;
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Catégories disponibles : ANIMAUX, PAYS, FILMS, OBJETS");
        System.out.print("Choisissez une catégorie : ");
        String choix = scanner.nextLine().toUpperCase();

        Category categorie = Category.valueOf(choix);

        // Prend le premier mot qui correspond
        for (Word w : mots) {
            if (w.getCategorie() == categorie) {
                motADeviner = w;
                break;
            }
        }

        if (motADeviner == null) {
            System.out.println("Catégorie invalide.");
            return;
        }

        while (erreurs < MAX_ERREURS && !motADeviner.estComplet()) {
            System.out.println("Mot : " + motADeviner.getMotMasque());
            System.out.print("Lettre : ");
            char lettre = scanner.nextLine().toUpperCase().charAt(0);

            if (motADeviner.devinerLettre(lettre)) {
                System.out.println("✔️ Bonne réponse !");
            } else {
                erreurs++;
                System.out.println("❌ Mauvaise réponse ! Erreurs : " + erreurs + "/" + MAX_ERREURS);
                drawFigure();
            }
        }

        if (motADeviner.estComplet()) {
            System.out.println("🎉 Bravo ! Mot deviné : " + motADeviner.getMotOriginal());
        } else {
            System.out.println("💀 Perdu ! Le mot était : " + motADeviner.getMotOriginal());
        }
    }

        private void drawFigure() {
            String[] figure = {
                    "  ____",
                    " |    |",
                    erreurs >= 1 ? " |    O" : " |",
                    erreurs >= 2 ? " |   /" + (erreurs >= 3 ? "|" : "") + "\\" : " |",
                    erreurs >= 4 ? " |    |" : " |",
                    erreurs >= 5 ? " |   /" + (erreurs == 6 ? " \\" : "") : " |",
                    "_|_"
            };

            for (String line : figure) {
                System.out.println(line);
            }
        }
}
