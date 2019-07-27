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
public class EJERCICIO3_9 {
    
    public static void main(String[] args) {
       int x = 0;
       Scanner teclado = new Scanner (System.in);
    /* Recibe primera variable */
    System.out.print("Por favor, introduce una variable: ");
    int var1 = Integer.parseInt(teclado.nextLine());
    /* Recibe segunda variable */
    System.out.print("Por favor, introduce otra variable: ");
    int var2 = Integer.parseInt(teclado.nextLine());
    /* Calcula incógnita y la muestra en pantalla */
    x = (-var2)/var1;
    System.out.printf("En %dx + %d = 0, x = %d", var1, var2, x);
    }
    
}
