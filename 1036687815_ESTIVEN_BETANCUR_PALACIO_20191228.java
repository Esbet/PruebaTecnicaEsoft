package pkg1036687815_estiven.betancur.palacio_2019.pkg12.pkg28;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Estiven Betancur
 */
public class BETANCURPALACIO_20191228 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,m;
        int total,opcion;
        boolean salir=false;
        Scanner sc=new Scanner(System.in);   
        while(!salir){
             System.out.println("******MENÜ**********");
             System.out.println("1. Ejecutar Funciones 1");
             System.out.println("2. Salir 2");
             System.out.println("*******************");
             
            System.out.println("Escribe una de las opciones");
            opcion = sc.nextInt();
            switch(opcion){
               case 1:
                    System.out.print(" Nro de columas de la matriz: ");  
                    n=sc.nextInt();  
                    System.out.print(" Nro de filas de la matriz: ");  
                    m=sc.nextInt();  
                    if(n>1 && m>1){
                       int matriz[][]= new int[n][m];
                       llenarMatriz(matriz);
                       MostrarMatriz(matriz);
                       PromColumnasImpares(matriz);
                       TColumnasMayor(matriz);
                    }else{
                      System.out.print("El numero de filas y de columnas debe ser mayor a 1 ");

                    } 
                   break;
                case 2:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 2");
           }
       
      
     
    }
    }
    public static void llenarMatriz(int matriz[][]){
        int random, sumc,sumt=0;
        float promedio=0,total=0;
      
      
             for(int i=0; i<matriz.length; i++){
                for(int j=0; j<matriz[0].length; j++){
                    matriz[i][j]= random=(int)Math.floor(Math.random()*((matriz.length*matriz[0].length)-1+1)+1);
                }
            }
    }
    public static void MostrarMatriz(int matriz[][]){
        for (int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j]+"\t");  
            }
               System.out.println("");  
        }
    }
    public static void PromColumnasImpares(int matriz[][]){
        int t = 0,sumcol;
        float promedio=0,total=0;
       for (int i = 0; i < matriz[0].length; i++) {  
            sumcol=0;
            for (int j = 0; j < matriz.length; j++) {
                if(i%2==0){
                   sumcol=sumcol+matriz[j][i];
                   t++;
                }
            }
            total+=sumcol;
            promedio= (total/t);
       }
        System.out.println("Promedio columnas impares: "+promedio);
    }
    
    public static void TColumnasMayor (int matriz[][]){
        int sumc,sumt=0;
        for (int i = 0; i < matriz[0].length; i++) {  
            sumc=0;  
            for (int j = 0; j < matriz.length; j++) {  
                sumc=sumc+matriz[j][i];
            }  
            if(sumc>12){
                sumt++;
            }
        } 
          System.out.println(" Cantidad de columnas cuyo total es mayor que 12 son: "+sumt);    
    }
  
    
}
