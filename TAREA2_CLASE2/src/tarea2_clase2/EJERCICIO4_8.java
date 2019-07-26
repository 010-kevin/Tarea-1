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
public class EJERCICIO4_8 {
    
     public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        
    System.out.print("Introduce un número ");
    int num = Integer.parseInt(teclado.nextLine());
    System.out.println("Tabla de multiplicar del "+num+"\n");
    for (int i = 1; i<= 10; i++){
      System.out.println(num+" x "+i+" = "+num*i);
    }
    }
    
}
