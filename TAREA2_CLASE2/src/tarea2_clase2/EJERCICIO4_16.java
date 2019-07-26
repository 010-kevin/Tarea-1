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
public class EJERCICIO4_16 {
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        
    System.out.print("Introduce un número: ");
    int num1 = Integer.parseInt(teclado.nextLine());
    
    System.out.print("Introduce un número diferente: ");
    int num2 = Integer.parseInt(teclado.nextLine());
    if (num1 == num2){
      System.out.print("¡no es diferente!");
    } else {
      int menor = 0;
      int mayor = 0;
      int i = 0;
      if (num1 < num2){
        menor = num1;
        mayor = num2;
      } else {
        menor = num2;
        mayor = num1;
      }
      for(i = 0; menor < mayor; i++){
        menor+= 7;
      }
      System.out.print("El número 7 cabe "+(i-1)+" veces entre el "+num1+" y el "+num2);
    }
    }
    
}
