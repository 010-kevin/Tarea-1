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
public class EJERCICIO4_10 {
    
     public static void main(String[] args) {
    double num = 0;
    double divid = 0;
    double cont = 0;
    Scanner teclado = new Scanner(System.in);
      do{
        System.out.print("Introduce un número ");
        num = Double.parseDouble(teclado.nextLine());
        divid = divid + num;
        cont++;
      } while (num > 0);
      double media = (divid-num)/(cont-1);
      System.out.println("La media es: "+ media +" .");
    }
    
}
