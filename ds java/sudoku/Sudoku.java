package sudoku;

import java.util.Scanner;

public class Sudoku{
  public static void main(String[] args) {
      
    puzzle p = new puzzle();
    System.out.print("Enter le nb [1-9] si le case vide noter 0 \n");
    p.remplirtab(p.t);
    
    p.affichesol(p.t);
    
    if (p.solution(p.t)) {
      System.out.println("Résolu avec succès \n");
    }
    else {
      System.out.println("Non résolu avec succès \n");
    }
    
    p.affichesol(p.t);
    
  } 
}


