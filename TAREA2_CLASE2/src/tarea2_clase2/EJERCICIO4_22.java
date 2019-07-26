/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_clase2;

/**
 *
 * @author KEVIN MARTINEZ
 */
public class EJERCICIO4_22 {
    
    public static void main(String[] args) {
    
    boolean prim = false;
    System.out.print("Los números primos entre 2 y 100 son:");
    for (int num = 2; num <= 100; num++) {
      prim = true;
      for (int i = 2; i < num; i++){
        if (num%i == 0){
          prim = false;
        }
      }
      if (prim){
        System.out.print("- "+num+" ");
      }  
    } 
    }
}
