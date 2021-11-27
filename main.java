package puissance4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class projet {
  public static void initialiseGrille(String[] args){
    int grille[][]={{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},};
    // on inicialise la grille: 6 lignes 7 colonnes

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); 
    // pour chaque fois qu'on joue on va réinicialiser a. Comme ça on a une seule variable pour les deux joueurs (et en plus un seur code pour toutes les parties) :D jaj 

    int j = sc.nextInt();


  }
  public static void javajouer (int a, int j){

  }

  public static int entierAleatoire(int a, int b){
    //Retourne un entier aléatoire entre a (inclus) et b (inclus)
    return ThreadLocalRandom.current().nextInt(a, b + 1);	
    }

  public static void main(String[] args) {

    }
}
>>>>>>> 819b515ceaecea73ef116658b12793476144b888
