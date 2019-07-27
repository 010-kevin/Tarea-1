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
public class EJERCICIO3_14 {
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.print("introduce un número: ");
    int num = Integer.parseInt(teclado.nextLine());
    
    String d = "no";
    String par = "no";
    
    if ((num % 5 == 0) && (num % 5 == 0)){
      d = " es divisible entre 5 y, además, par.";
    } else if ((num % 5 != 0) && (num % 2 != 0)){
      d = " es indivisible entre 5 e impar.";
    }
   
    else if (num % 5 == 0){
      d = " es divisible entre 5.";
    } else if (num % 5 != 0){
      d = " no es divisible entre 5.";
    } 
    
    else if (num % 2 == 0){
      d = " es par.";
    } else if (num % 2 != 0){
      d = " es impar.";
    }
    System.out.print("El número " + num + d);
    }
}
