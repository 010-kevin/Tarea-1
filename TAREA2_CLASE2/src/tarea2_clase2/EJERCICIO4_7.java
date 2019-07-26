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
public class EJERCICIO4_7 {
    
    public static void main(String[] args) {
    int a = 4;
    int combi;
    int comb = 9999;
    boolean ver = false;
    Scanner teclado = new Scanner(System.in);
    do {
      System.out.print("Combinación: ");
      combi = Integer.parseInt(teclado.nextLine());
      if (combi == comb) {
        ver = true;
      } else {
        System.out.println("Combinación errónea");
      }
      a--;
    } while((a > 0) && (!ver));
    if (ver) {
      System.out.println("Contrseña correcta.");
    } else {
      System.out.println("has agotado tus 4 oportunidades.");
    }
    }
    
}
