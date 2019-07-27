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
public class EJERCICIO3_6 {
    
    public static void main(String[] args) {
    double a = 9.81;
    Scanner teclado = new Scanner(System.in);
    System.out.print("Por favor, introduce la altura: ");
    double b = Double.parseDouble(teclado.nextLine());
    
    double tiempo = Math.sqrt((2*b)/a);
    System.out.printf("Un objeto a una altura %f, tarda %.3f segundos en caer ", b, tiempo);
    }
    
}
