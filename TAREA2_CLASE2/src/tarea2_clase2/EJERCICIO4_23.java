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
public class EJERCICIO4_23 {
    
     public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    double num = 0;
    double divid = 0;
    double cont = 0;
    do{
      System.out.print("Introduce un número: ");
      num = Double.parseDouble(teclado.nextLine());
      divid = divid + num;
      cont++;
    } while (divid < 10000);
    divid -= num;
    double media = (divid-num)/(cont-2);
    System.out.println("Ha introducido "+cont+" números.");
    System.out.println("La suma de todos los números es: "+divid+".");
    System.out.println("La media es: "+ media +".");
    }
}
