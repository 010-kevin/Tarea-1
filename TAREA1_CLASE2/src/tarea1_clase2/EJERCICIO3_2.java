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
public class EJERCICIO3_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hora= 0;
         System.out.print("Por favor, introduce la hora: ");
    hora = Integer.parseInt(teclado.nextLine());
    /* Calcula el tramo en el que está */
    if ((hora >= 6)&&(hora <= 12)){
      System.out.print("BUENOS DIAS.");
    } 
    else if ((hora >= 13)&&(hora <= 20)){
      System.out.print("BUENAS TARDES.");
    } 
    else if ((hora >= 21)&&(hora <= 1)){
      System.out.print("BUENAS NOCHES.");
    } 
    else if ((hora >= 1)&&(hora <= 4)){
      System.out.print("MADRUGADA.");
    } 
    else {
      System.out.print("No introdujo algo valido.");
    }
    }
    
}
