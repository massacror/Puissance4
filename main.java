// EX1
package puissance4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

javajouer();
public class projet {
  public static void initialiseGrille(String[] args){
    int grille[][]={{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},};
    // on inicialise la grille: 6 lignes 7 colonnes

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); // nb joueur
    int j = sc.nextInt(); // nb colonne
    // à chaque partie on va réinicialiser a et j. Comme ça on a une seule variable pour les deux joueurs :D jaj 

  }
  public static void javajouer (int a, int j, int[][] grille){  // je suis en train de prendre en paramètre aussi grille[][].. jsp si c'est très léal.
    for (int i = 0; i < (grille.length+1); i++){
      if (grille[i][j] == 0){ 
      grille[i][j] = a;}
      else i++;
      // si la case est vide, on remplace le 0 par le nb du joueur. Si elle ne l'est pas, on avance la ligle (sur la même colonne)
    }
  }
}
