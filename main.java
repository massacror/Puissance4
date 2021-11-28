// EX1
package puissance4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class main {
    static int grille[][]={{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},};
    // public static void initialiseGrille(){

    // // on inicialise la grille: 6 lignes 7 colonnes

    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt(); // nb joueur
    
    // int j = sc.nextInt(); // nb colonne
    // // à chaque partie on va réinicialiser a et j. Comme ça on a une seule variable pour les deux joueurs :D jaj 

    // int x = 3; //num. ligne de la case étudiée
    // int y = 5; //num. colonne de la case étudiée
    // }
  public static void javajouer (int a, int j){
    boolean estVide = false;
    for (int i = grille.length; estVide != true; i--){ 
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

  public static int entierAleatoire(int a, int b){
    //Retourne un entier aléatoire entre a (inclus) et b (inclus)
    return ThreadLocalRandom.current().nextInt(a, b + 1);	
    }

    public static void afficheGrille()
    {
        for(int i=grille.length; i != -1 ; i--){ // On boucle sur les lignes de la dernière vers la première pour bien afficher
            if(i!=-1)
                {
                    for(int j = 0; j < grille[0].length;j++) // On boucle sur le nb de colonne (Une fois qu'on dans une ligne on l'affiche numéro par numéro)
                {
                    System.out.println("|"+grille[i][j]+"|"); //On affiche de haut en bas donc faut boucler sur imax
                }
                }
            else
                {
                    for(int j = 0; j < grille[0].length;j++) // On boucle sur le nb de colonne (ligne avec les numéros)
                        {
                            System.out.println("|" + j + "|");
                        }
                }
        }}

    public static void main(String[] args) {

  }

//EX2 
  public static boolean aGagneHor(int x, int y, int a){
    boolean res = true;

    if(grille[y][x] != a){res = false;} // on a deux options si la case n'a pas de a(EX: 1): soit elle a un 2 soit elle a un 0. Dans les deux cas on ne peut pas avoir un allignement de 1 si dans la case il n'y a pas de 1.
    // si la case est vide als il ne peut pas y avoir d'allignement. :D
    
    else if (grille[y][x] == a){ // on verifie que dans la case il y ait un a pour voir s'il y a un allignement horizonal.
      if (grille[y][x+1] == a){ // on voit si qnd on avance d'une colonne (sur la même ligne) il y a un 'a'. ==> allignement horizontal vers la droite
        for (int i = 0; i < 3; i++){
          if (grille[y][x+i] != a){
            res = false;
          }
        }
      }

      else if(grille[y][x-1] == a){   // Même for mais cette fois on recule d'une colonne .==> allignement horizontal vers la gauche
        for (int i = 0; i < 3; i++){
          if (grille[y][x-i] != a){
            res = false;
          }
        }
      }
    }
  return res;
  }

  public static boolean aGagneVer(int x, int y, int a){
    boolean res = true;

    if(grille[y][x] != a){res = false;} // comme dans la case choisie il n'y a pas de a als il ne peut pas y avoir d'allignement à partir de cette case :l
    
    else if (grille[y][x] == a){ // on verifie que dans la case choisie il y ait un a. 
      if (grille[y+1][x] == a){   // on voit s'il y a un allignement vertical vers le haut
        for (int i = 0; i < 3; i++){
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
