/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1_clase2;

import java.util.Scanner;

/**
 *
 * @author KEVIN MARTINEZ
 */
public class EJERCICIO3_13 {
    
     public static void main(String[] args) {
    Scanner teclado =  new Scanner(System.in);
        
    System.out.print("introduce un número: ");
    int a = Integer.parseInt(teclado.nextLine());
    
    System.out.print("introduce un número: ");
    int b = Integer.parseInt(teclado.nextLine());
    
    System.out.print("introduce un número: ");
    int c = Integer.parseInt(teclado.nextLine());
    
    System.out.print("Ordenados de menor a mayor: ");
    
    if ((a <= b) && (a <= c)){
      System.out.print(a + " < ");
      if (b <= c){
        System.out.print(b + " < " +c);
      } else {
        System.out.print(c + " < " + b);
      }
    } else if ((b <= a) && (b <= c)){
      System.out.print(b + " < ");
      if (a <= c){
        System.out.print(a + " < " + c);
      } else {
        System.out.print(c + " < " + a);
      }
    } else if ((c <= a) && (c <= b)){
      System.out.print(c +" < ");
      if (a <= b){
        System.out.print(a + " < " + b);
      } else {
        System.out.print(b + " < " + a);
      }
    }
    }
}
