import java.util.concurrent.ThreadLocalRandom;

public class Puissance_kim {
    public static int grille[][]; //POURQUOI POURQOI UPQUOIUZPIOAUE
    public static void initialiseGrille(){ //ON acces quoi qu'il arrive
        grille = new int[6][7];
        for(int i = 0; i<6; i++) //Les lignes
            {
                for(int j = 0; j<7;j++)
                    {
                        grille[i][j] = 0;
                    }
            }
    // on inicialise la grille: 6 lignes 7 colonnes

    }

  public static int entierAleatoire(int a, int b){
    //Retourne un entier aléatoire entre a (inclus) et b (inclus)
    return ThreadLocalRandom.current().nextInt(a, b + 1);	
    }

    public static void afficheGrille()
    {
        for(int i=grille.length -1; i != -2 ; i--){ // On boucle sur les lignes de la dernière vers la première pour bien afficher
            if(i!=(-1))
                {
                    for(int j = 0; j < grille[0].length;j++) // On boucle sur le nb de colonne (Une fois qu'on dans une ligne on l'affiche numéro par numéro)
                {
                    System.out.print("|"+grille[i][j]+"|"); //On affiche de haut en bas donc faut boucler sur imax
                }
                }
            else
                {
                    for(int j = 0; j < grille[0].length;j++) // On boucle sur le nb de colonne (ligne avec les numéros)
                        {
                            System.out.print(" " + j + " ");
                        }
                }
            System.out.println();
        }}

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
    public static void main(String[] args) {
        initialiseGrille();
        Programme_final.jouer(3,1);
        afficheGrille();

    }
}

