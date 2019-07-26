/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_clase2;

import java.util.Scanner;

/**
 *
 * @author KEVIN MARTINEZ
 */
public class EJERCICIO4_13 {
    
     public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    int cifras = Integer.parseInt(teclado.nextLine());
    int numCi = 10;
    int pos = 0;
    int neg = 0;
    for (int cont = 0; cont < numCi; cont++){
      if (cifras < 0){
        pos ++;
      } else {
        neg++;
      }
    }
    System.out.println("Hay "+pos+" positivios y "+neg+" negativos.");
    }
    
}
