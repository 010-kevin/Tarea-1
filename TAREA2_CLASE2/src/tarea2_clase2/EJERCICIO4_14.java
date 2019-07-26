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
public class EJERCICIO4_14 {
    
     public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        
    System.out.print("Introduce la base ");
    double base = Double.parseDouble(teclado.nextLine());
    
    System.out.print("Introduce el exponente ");
    int exponente = Integer.parseInt(teclado.nextLine());
    
    double total = 1;
    for(int i = 0; i < exponente; i++){
      total = base * total;
    }
    System.out.print(base+ " elevado a "+ exponente+" = "+total+".");
    }
    
}
