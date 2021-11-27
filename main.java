// EX1
package puissance4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class projet {
  public static void initialiseGrille(String[] args){
    int grille[][]={{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},};
    // on inicialise la grille: 6 lignes 7 colonnes

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); // nb joueur
    int j = sc.nextInt(); // nb colonne
    // à chaque partie on va réinicialiser a et j. Comme ça on a une seule variable pour les deux joueurs :D jaj 

    int x = 3; //nb lignes
    int y = 5; //nb colonnes
  }
  public static void javajouer (int a, int j){
    boolean estVide = false;
    for (int i = grille.length; estPleine != true; i--){ //on boucle du bas de la grille joueur vers le haut; donc de imax en java vers imin
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
}
//EX2 
  public static boolean aGagneHor(int x, int y, int a){
    boolean res = true;

    if(grille[y][x] == 0){res = false;} 
    // si la case est vide als il ne peut pas y avoir d'allignement. :D

    else if (grille[y][x] == 1){
      for (int i = 0; i < 4; i++){
        if (grille[y+i][x] != 1){res = false;} 
        else if(grille[y][x+1] != 1){res = false;} 
        }
      res = true;
      }
    else if (grille[y][x] == 2 ){
      for (int i = 0; i < 4; i++){
      if (grille[y+i][x] != 1){res = false;}
      }
  return res;
    }  
  }
