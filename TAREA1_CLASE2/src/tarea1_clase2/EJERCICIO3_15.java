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
public class EJERCICIO3_15 {
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        
    System.out.print("introduce el caracter ASCII con el que quieres dibujar la pirámide: ");
    String car = teclado.nextLine();
    
    System.out.println("introduce formato en el que quieres que salga la pirámide: ");
    System.out.print(" 1. Hacia arriba \n 2. Hacia abajo \n 3. Hacia la derecha \n 4. Hacia la izquierda \n");
    int form = Integer.parseInt(teclado.nextLine());
    
    switch (form){
      case 1:
        System.out.println("    " + car);
        System.out.println("   " + car + car + car);
        System.out.println("  " + car + car + car + car + car);
        System.out.println(" " + car + car + car + car + car + car + car);
        System.out.println(car + car + car + car + car + car + car + car + car);
        break;
      case 2:
        System.out.println(car + car + car + car + car + car + car + car + car);
        System.out.println(" " + car + car + car + car + car + car + car);
        System.out.println("  " + car + car + car + car + car);
        System.out.println("   " + car + car + car);
        System.out.println("    " + car);
        break;
      case 3:
        System.out.println("    " + car);
        System.out.println("   " + car + car);
        System.out.println("  " + car + car + car);
        System.out.println(" " + car + car + car + car);
        System.out.println(car + car + car + car + car);
        System.out.println(" " + car + car + car + car);
        System.out.println("  " + car + car + car);
        System.out.println("   " + car + car);
        System.out.println("    " + car);
        break;
      case 4:
        System.out.println(car + "    ");
        System.out.println(car + car + "   ");
        System.out.println(car + car + car + "  ");
        System.out.println(car + car + car + car + " ");
        System.out.println(car + car + car + car + car);
        System.out.println(car + car + car + car + " ");
        System.out.println(car + car + car + "  ");
        System.out.println(car + car + "   ");
        System.out.println(car + "    ");
        break;
      default:
        System.out.println("Este formato no está disponible.");
    }
    }
}
