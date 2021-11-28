// EX1
package puissance4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class main {
  public static void initialiseGrille(String[] args){
    int grille[][]={{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},};
    // on inicialise la grille: 6 lignes 7 colonnes

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); // nb joueur
    int j = sc.nextInt(); // nb colonne
    // à chaque partie on va réinicialiser a et j. Comme ça on a une seule variable pour les deux joueurs :D jaj 

    int x = 3; //num. ligne de la case étudiée
    int y = 5; //num. colonne de la case étudiée
  }
  public static void javajouer (int a, int j){
    boolean estVide = false;
    for (int i = grille.length; estPleine != true; i--){ 
      //on boucle du bas de la grille joueur vers le haut; donc de imax en java vers imin
      if (grille[i][j] == 0){ 
      grille[i][j] = a;
      estVide = true;
      }
      
      else if (grille[i][j] != 0){
        estVide = false;
      }
      // si la case est vide, on remplace le 0 par le nb du joueur. Si elle ne l'est pas, on avance la ligle (sur la même colonne)
    }
  }

//EX2 
  public static boolean aGagneHor(int x, int y, int a){
    boolean estComplete = true;

    if(grille[y][x] != a){estComplete = false;} // on a deux options si la case n'a pas de a(EX: 1): soit elle a un 2 soit elle a un 0. Dans les deux cas on ne peut pas avoir un allignement de 1 si dans la case il n'y a pas de 1.
    // si la case est vide als il ne peut pas y avoir d'allignement. :D
    
    else if (grille[y][x] == a){ // on verifie que dans la case il y ait un a pour voir s'il y a un allignement horizonal.
      if (grille[y][x+1] == a){ // on voit si qnd on avance d'une colonne (sur la même ligne) il y a un 'a'. ==> allignement horizontal vers la droite
        for (i = 0; i < 3; i++){
          if (grille[y][x+i] != a){
            res = false;
          }
        }
      }

      else if(grille[y][x-1] == a){   // Même for mais cette fois on recule d'une colonne .==> allignement horizontal vers la gauche
        for (i = 0; i < 3; i++){
          if (grille[y][x-i] != a){
            res = false;
          }
        }
      }
    }
  return estComplete;
  }

  public static boolean aGagneVer(int x, int y, int a){
    boolean estComplete = true;

    if(grille[y][x] != a){estComplete = false;} // comme dans la case choisie il n'y a pas de a als il ne peut pas y avoir d'allignement à partir de cette case :l
    
    else if (grille[y][x] == a){ // on verifie que dans la case choisie il y ait un a. 
      if (grille[y+1][x] == a){   // on voit s'il y a un allignement vertical vers le haut
        for (i = 0; i < 3; i++){
          if (grille[y+i][x] != a){
            res = false;
          }
        }
      }

      else if(grille[y-1][x] == a){   // on voit s'il y a un allignement vertical vers le bas
        for (i = 0; i < 3; i++){
          if (grille[y-i][x] != a){
            res = false;
          }
        }
      }
    }
  return estComplete;
  }


  public static boolean aGagneDiagMont (int x, int y, int a){
    boolean estComplete = true;

    if(grille[y][x] != a){estComplete = false;}
    else if(grille[y+1][x+1] == a) { // on va verifier s'il y a un a dans la diagonale qui monte vers la droite. 
      for (int i = 0; i < 3; i++){
        if (grille[y+i][x+i] != a){estComplete = false;}
      }
    }
    else if(grille[y+1][x-1] == a){ // on va verifier s'il y a un a dans la diagonale qui monte vers la gauche. 
      for (int i = 0; i < 3; i++){
        if (grille[y+i][x-i] != a){estComplete = false;}
      }
    }
  return estComplete;
  }
    public static boolean aGagneDiagDesc (int x, int y, int a){
    boolean estComplete = true;

    if(grille[y][x] != a){estComplete = false;}
    else if(grille[y-1][x-1] == a) { // on va verifier s'il y a un a dans la diagonale qui déscend vers la gauche. 
      for (int i = 0; i < 3; i++){
        if (grille[y-i][x-i] != a){estComplete = false;}
      }
    }
    else if(grille[y-1][x+1] == a){ // on va verifier s'il y a un a dans la diagonale qui déscend vers la droite. 
      for (int i = 0; i < 3; i++){
        if (grille[y-i][x+i] != a){estComplete = false;}
      }
    }
  return estComplete;
  }
}