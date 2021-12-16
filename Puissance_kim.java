import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Puissance_kim {
  public static int entierAleatoire(int a, int b) {
    // Retourne un entier aléatoire entre a (inclus) et b (inclus)
    return ThreadLocalRandom.current().nextInt(a, b + 1);
  }

  public static int[][] grille; // POURQUOI POURQOI UPQUOIUZPIOAUE

  public static void initialiseGrille() { // ON acces quoi qu'il arrive
    grille = new int[6][7];
    for (int i = 0; i < 6; i++) // Les lignes
    {
      for (int j = 0; j < 7; j++) {
        grille[i][j] = 0;
      }
    }
    // on inicialise la grille: 6 lignes 7 colonnes

  }

  // EX2
  public static void jouer(int col, int joueur) {
    boolean estVide = false;
    if (joueur != 1 && joueur != 2) {
      System.out.println("Entrez un numéro de joueur valide");
    } else {
      for (int i = 0; estVide != true; i++) {
        // on boucle du bas de la grille joueur vers le haut; donc de imax en java vers
        // imin
        if (grille[i][col] == 0) {
          grille[i][col] = joueur;
          estVide = true;
        }

        else if (grille[i][col] != 0) {
          estVide = false;
        }
        // si la case est vide, on remplace le 0 par le nb du joueur. Si elle ne l'est
        // pas, on avance la ligle (sur la même colonne)
      }
    }
  }

  public static void afficheCase(int Case) {
    if (Case == 1) {
      System.out.print("|X");
    } else if (Case == 2) {
      System.out.print("|O");
    } else {
      System.out.print("| ");
    }
  }

  public static void afficheGrille() {
    for (int i = grille.length - 1; i != -2; i--) { // On boucle sur les lignes de la dernière vers la première pour
                                                    // bien afficher
      if (i != (-1)) {
        for (int j = 0; j < grille[0].length; j++) // On boucle sur le nb de colonne (Une fois qu'on dans une ligne on
                                                   // l'affiche numéro par numéro)
        {
          afficheCase(grille[i][j]);
        }
        System.out.print("|");
      } else {
        System.out.print(" ");
        for (int j = 0; j < grille[0].length; j++) // On boucle sur le nb de colonne (ligne avec les numéros tout en bas
        {
          System.out.print(j + " ");
        }
      }
      System.out.println();
    }
  }

  // EX3
  // EX5



  public static boolean aGagneHor(int x, int y, int a) {
    boolean res = true;

    if (grille[y][x] != a) {
      res = false;
    } // on a deux options si la case n'a pas de a(EX: 1): soit elle a un 2 soit elle
      // a un 0. Dans les deux cas on ne peut pas avoir un allignement de 1 si dans la
      // case il n'y a pas de 1.
    // si la case est vide als il ne peut pas y avoir d'allignement. :D

    else if (grille[y][x] == a) { // on verifie que dans la case il y ait un a pour voir s'il y a un allignement
                                  // horizonal.
      if (grille[y][x + 1] == a) { // on voit si qnd on avance d'une colonne (sur la même ligne) il y a un 'a'. ==>
                                   // allignement horizontal vers la droite
        for (int i = 0; i < 3; i++) {
          if (grille[y][x + i] != a) {
            res = false;
          }
        }
      }

      else if (grille[y][x - 1] == a) { // Même for mais cette fois on recule d'une colonne .==> allignement horizontal
                                        // vers la gauche
        for (int i = 0; i < 3; i++) {
          if (grille[y][x - i] != a) {
            res = false;
          }
        }
      }
    }
    return res;
  }

  public static boolean aGagneVer(int x, int y, int a) {
    boolean res = true;

    if (grille[y][x] != a) {
      res = false;
    } // comme dans la case choisie il n'y a pas de a als il ne peut pas y avoir
      // d'allignement à partir de cette case :l

    else if (grille[y][x] == a) { // on verifie que dans la case choisie il y ait un a.
      if (grille[y + 1][x] == a) { // on voit s'il y a un allignement vertical vers le haut
        for (int i = 0; i < 3; i++) {
          if (grille[y + i][x] != a) {
            res = false;
          }
        }
      }

      else if (grille[y - 1][x] == a) { // on voit s'il y a un allignement vertical vers le bas
        for (int i = 0; i < 3; i++) {
          if (grille[y - i][x] != a) {
            res = false;
          }
        }
      }
    }
    return res;
  }

  public static boolean aGagneDiagMont(int x, int y, int a) {
    boolean estComplete = true;

    if (grille[y][x] != a) {
      estComplete = false;
    } else if (grille[y + 1][x + 1] == a) { // on va verifier s'il y a un a dans la diagonale qui monte vers la droite.
      for (int i = 0; i < 3; i++) {
        if (grille[y + i][x + i] != a) {
          estComplete = false;
        }
      }
    } else if (grille[y + 1][x - 1] == a) { // on va verifier s'il y a un a dans la diagonale qui monte vers la gauche.
      for (int i = 0; i < 3; i++) {
        if (grille[y + i][x - i] != a) {
          estComplete = false;
        }
      }
    }
    return estComplete;
  }

  public static boolean aGagneDiagDesc(int x, int y, int a) {
    boolean estComplete = true;

    if (grille[y][x] != a) {
      estComplete = false;
    } else if (grille[y - 1][x - 1] == a) { // on va verifier s'il y a un a dans la diagonale qui déscend vers la
                                            // gauche.
      for (int i = 0; i < 3; i++) {
        if (grille[y - i][x - i] != a) {
          estComplete = false;
        }
      }
    } else if (grille[y - 1][x + 1] == a) { // on va verifier s'il y a un a dans la diagonale qui déscend vers la
                                            // droite.
      for (int i = 0; i < 3; i++) {
        if (grille[y - i][x + i] != a) {
          estComplete = false;
        }
      }
    }
    return estComplete;
  }

  public static boolean aGagne(int a) {
    boolean res = true;
    for (int i = 0; i < grille.length; i++) {
      for (int j = 0; j < grille[1].length; j++) {
        aGagneVer(a, i, j);
        aGagneDiagMont(a, i, j);
        aGagneDiagDesc(a, i, j);
      }
    }
    return res;
  }

  // on peut détecter un match nul dans la grille lorsque personne ne gagne. Donc
  // quand la fonction "aGagne" return un false.
  public static boolean matchNul(int a) {
    boolean res = false;
    if (aGagne(a) == false) {
      res = true;
    }
    return res;
  }

  public static void bouclejeu() {
    System.out.println()
  }
  public static void main(String[] args) {

    initialiseGrille();
    jouer(3, 1);
    jouer(3, 2);
    jouer(4, 1);
    afficheGrille();

  }
}
