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
public class TAREA1_CLASE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dia;
    /* Recoge dia de la semana */
    Scanner teclado = new Scanner(System.in);
    System.out.print("Por favor, introduce un dia de la semana: ");
    dia = teclado.nextLine(); 
    /* Switch para encontrar asignatura */
    switch (dia){
        case "lunes":
        case "miércoles":
          System.out.print("Hay Sistemas Informáticos.");
          break;
        case "martes":
        case "jueves":
        case "viernes":
          System.out.print("Hay Programación..");
          break;
        case "sábado":
        case "domingo":
          System.out.print("No hay clase.");
        default:
          System.out.print("¿Qué parte de dia de la semana no entendiste?");
    }
    }
    }
    

