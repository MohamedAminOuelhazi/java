
package sudoku;

import java.util.Scanner;

public class puzzle {
  int[][] t = new int[9][9];
  
// remplirtab : une fonction pour remplir le tableau 
  
  public  void remplirtab(int [][] t)
    { for (int i=0 ;i<9;i++)
        for (int j=0;j<9;j++)
        {Scanner clavier = new Scanner(System.in);
        int nb1 = 10;
         do { 
            System.out.print("Enter le nb ["+i+"]"+"["+j+"] :");
            t[i][j] = clavier.nextInt();
            nb1 = t[i][j];
         }while(nb1<0 || nb1>9);
        }
    }
   
  //Doit être testé si le numéro ne se répète pas dans la même ligne i 
  
  public  boolean test_nb_ligne(int[][] t, int nb, int ligne) {
    for (int i = 0; i < 9; i++) {
      if (t[ligne][i] == nb) {
        return true;
      }
    }
    return false;
  }
//Doit être testé si le numéro ne se répète pas dans la même colonne i 
  public  boolean test_nb_col(int[][] t, int nb, int col) {
    for (int i = 0; i < 9; i++) {
      if (t[i][col] == nb) {
        return true;
      }
    }
    return false;
  }
  
  //Doit être testé si le numéro ne se répète pas dans chaque case 3 X 3 [i][j]
  
  public  boolean test_nb_box(int[][] t, int nb, int ligne, int col) {
    int lignebox = ligne - ligne % 3;
    int colbox = col - col % 3;
    
    for (int i = lignebox; i < lignebox + 3; i++) {
      for (int j = colbox; j < colbox + 3; j++) {
        if (t[i][j] == nb) {
          return true;
        }
      }
    }
    return false;
  }
  
  public  boolean test_place(int[][] t, int nb, int ligne, int col) {
    return !test_nb_ligne(t,nb, ligne) &&!test_nb_col(t, nb, col) &&!test_nb_box(t, nb, ligne, col);
  }
  // Ma solution : 
  public boolean solution(int[][] t) {
    for (int ligne = 0; ligne < 9; ligne++) {
      for (int col = 0; col < 9; col++) {
        if (t[ligne][col] == 0) {
          for (int nb = 1; nb <= 9; nb++) {
            if (test_place(t, nb, ligne, col)) {
              t[ligne][col] = nb;
              
              if (solution(t)) {
                return true;
              }
              else {
                t[ligne][col] = 0;
              }
            }
          }
          return false;
        }
      }
    }
    return true;
  }
  // pour affiche le solution 
  
  public  void affichesol(int[][] t) {
    for (int ligne = 0; ligne < 9; ligne++) {
      if (ligne % 3 == 0 && ligne != 0) {
        System.out.println("-----------");
      }
      for (int col = 0; col < 9; col++) {
        if (col % 3 == 0 && col != 0) {
          System.out.print("|");
        }
        System.out.print(t[ligne][col]);
      }
      System.out.println();
    }
  }
  
}
