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
public class EJERCICIO4_9 {
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        
    System.out.print("Introduce un número: ");
    int num = Integer.parseInt(teclado.nextLine());
    int i;
    for (i = 0; num > 0; i++){
      num = num/10;
    }
    System.out.println("El número tiene "+i+" cifras.");
    }
    
}
