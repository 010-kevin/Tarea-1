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
public class EJERCICIO3_8 {
    
     public static void main(String[] args) {
    String bol = "a";
    Scanner teclado = new Scanner(System.in);
    
    System.out.print("introduce la primera nota: ");
    double n1 = Double.parseDouble(teclado.nextLine());
    System.out.print("introduce la segunda nota: ");
    double n2 = Double.parseDouble(teclado.nextLine());
    System.out.print("introduce la tercera nota: ");
    double n3 = Double.parseDouble(teclado.nextLine());
    
    double media = (n1+n2+n3)/3;
    /* if para decir la nota */
    if (media < 5){
      bol = "insuficiente";
    } else if (media < 6){
      bol = "suficiente";
    } else if (media < 7){
      bol = "bien";
    } else if (media < 9){
      bol = "notable";
    } else if (media <= 10){
      bol = "sobresaliente";
    } else {
      System.out.println("Una de las notas es incorrecta. ");
    }
    System.out.printf("Su nota en el boletín es: %s. ", bol);
    }
    
}
