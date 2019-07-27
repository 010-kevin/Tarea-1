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
public class EJERCICIO3_1 {
    
    public static void main(String[] args) {
         String dia;
    /* Recoge dia de la semana */
    Scanner teclado = new Scanner(System.in);
    System.out.print("Por favor, introduce un dia de la semana: ");
    dia = teclado.nextLine(); 
    /* Switch para encontrar asignatura */
    switch (dia){
        case "lunes":
        case "miercoles":
          System.out.print("Hay Fisica II.");
          break;
        case "martes":
        case "jueves":
        case "viernes":
          System.out.print("Hay Programacion II ..");
          break;
        case "sabado":
        case "domingo":
          System.out.print("RELAX.");
        default:
          System.out.print("¿Dia de la semana Cuate :(  ?");
    }
    }
    
}
