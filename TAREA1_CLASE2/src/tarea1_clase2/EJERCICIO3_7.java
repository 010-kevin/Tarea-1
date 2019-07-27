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
public class EJERCICIO3_7 {
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.print("introduce la primera nota: ");
    double n1 = Double.parseDouble(teclado.nextLine());
    
    System.out.print("introduce la segunda nota: ");
    double n2 = Double.parseDouble(teclado.nextLine());
    
    System.out.print("introduce la tercera nota: ");
    double n3 = Double.parseDouble(teclado.nextLine());
    
    double media = (n1+n2+n3)/3;
    System.out.printf("La media de %.2f, %.2f y %.2f = %.2f: ", n1, n2, n3, media);
    }
    
}
