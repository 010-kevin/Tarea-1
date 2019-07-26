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
public class EJERCICIO4_21 {
    
     public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    double divid = 0;
    int contimp = 0;
    double mayor = 0;
    double impar = 0;
    int contador = 0;
    double num;
    do{
      System.out.print("Introduce un número ");
      num = Double.parseDouble(teclado.nextLine());
      
      if (num%2 != 0){
        impar = num;
        divid += num;
        contimp++;
      } else {
        if (num > mayor){
          mayor = num;
        }
      }
      contador++;
    } while (num > 0);
    double media = (divid-impar)/(contimp-1);
    System.out.println("Ha introducido "+ contador + " números.");
    System.out.println("La media de los impares es: "+ media +".");
    System.out.println("El mayor número par ha sido el: "+mayor+".");
    }
    
}
