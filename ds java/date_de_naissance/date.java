
package date_de_naissance;

import static java.lang.Math.pow;
import java.util.Scanner;
public class date {
    
    int set1[] = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31};
    int set2[] = {2,3,6,7,10,11,14,15,18,19,22,23,26,27,30,31};
    int set3[] = {4,5,6,7,12,13,14,15,20,21,22,23,28,29,30,31};
    int set4[] = {8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31};
    int set5[] = {16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
    
     
    Scanner clavier = new Scanner(System.in);
    
   void affiche(){
     // nb décimale
     int dc = 0 ;
     //SET 1
     // afficher le premier tableau  
     for (int i=0 ; i<16 ; i++){
          if (i % 4 == 0 && i !=0)
          {
              System.out.print("\n");
          }
       System.out.print(set1[i]+"\t");
      }
     System.out.print("\n");
     System.out.print("--------------------");
     System.out.print("Entrer 0 pour non , enter 1 pour oui : ");
     
     //Demander à l’utilisateur d’écrire 0 ou 1
     int a = 2;
     do{    
     int bn1 = clavier.nextInt();
     a =bn1 ;
     }while(a!=0 && a!=1);
     
     // nb décimale
     dc+=a*pow(2,0);
     
     System.out.print("\n");
     
     //SET 2
     for (int i=0 ; i<16 ; i++){
          if (i % 4 == 0 && i !=0)
          {
              System.out.print("\n");
          }
       System.out.print(set2[i]+"\t");
      }
     System.out.print("\n");
     System.out.print("--------------------");
     System.out.print("Entrer 0 pour non , enter 1 pour oui : ");
     
     
     int z = 0;
     do{    
     int bn2 = clavier.nextInt();
     z =bn2 ;
     }while(z!=0 && z!=1); 
    
     // nb décimale
     dc+=z*pow(2,1);
     
     System.out.print("\n");
     
     //SET 3
     for (int i=0 ; i<16 ; i++){
          if (i % 4 == 0 && i !=0)
          {
              System.out.print("\n");
          }
       System.out.print(set3[i]+"\t");
      }
     System.out.print("\n");
     System.out.print("--------------------");
     System.out.print("Entrer 0 pour non , enter 1 pour oui : ");
     
     int k = 0;
     do{    
     int bn3 = clavier.nextInt();
     k =bn3 ;
     }while(k!=0 && k!=1);
     
     
     dc+=k*pow(2,2);
     
     System.out.print("\n");
     
     //SET 4
     for (int i=0 ; i<16 ; i++){
          if (i % 4 == 0 && i !=0)
          {
              System.out.print("\n");
          }
       System.out.print(set4[i]+"\t");
      }
     System.out.print("\n");
     System.out.print("--------------------");
     System.out.print("Entrer 0 pour non , enter 1 pour oui : ");
     
     int e = 0;
     do{    
     int bn4 = clavier.nextInt();
     e =bn4 ;
     }while(e!=0 && e!=1); 
      
     dc+=e*pow(2,3);
     
     System.out.print("\n");
     
     //SET 5
     for (int i=0 ; i<16 ; i++){
          if (i % 4 == 0 && i !=0)
          {
              System.out.print("\n");
          }
       System.out.print(set5[i]+"\t");
      }
     System.out.print("\n");
     System.out.print("--------------------");
     System.out.print("Entrer 0 pour non , enter 1 pour oui : ");
     
     int r = 0;
     do{    
     int bn4 = clavier.nextInt();
     r=bn4 ;
     }while(r!=0 && r!=1); 
     
     dc+=r*pow(2,4);
     
     System.out.print("\n");
     
     // Aficher le nb dc décimale 
     
     System.out.print("le nombre décimale est "+dc+"\n");
   } 
}
