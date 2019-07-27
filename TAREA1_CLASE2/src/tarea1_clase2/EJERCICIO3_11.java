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
public class EJERCICIO3_11 {
    
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      System.out.print("introduce la hora: ");
    int hora = Integer.parseInt(teclado.nextLine());
    if ((0 < hora) && (hora > 23)) {
      System.out.println("El dato no es correcto");
    } else {
      System.out.print("introduce los minutos: ");
      int min = Integer.parseInt(teclado.nextLine());
        if ((0 < min) && (min > 59)) {
          System.out.println("El dato no es correcto");
        } else {
        
        if ((hora == 0) && (min == 0)){
          System.out.println("es medianoche");
        
        } else {
          int horaS = (23 - hora)* 3600;
          int minS = (60 - min)* 60;
          int medianoche = horaS + minS;
          System.out.println("Faltan " + medianoche + " segundos para medianoche.");
        }
      }
    }
    }
    
}
