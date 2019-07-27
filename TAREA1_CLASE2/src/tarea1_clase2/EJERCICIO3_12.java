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
public class EJERCICIO3_12 {
    
    public static void main(String[] args) {
    int puntos = 0;
    Scanner teclado = new Scanner(System.in);
   
    System.out.println("\n CUESTIONARIO DE 10 PREGUNTAS:\n");
    
    System.out.println(" 1) ¿Como declaro una variable entera? ");
    System.out.println("a) string");
    System.out.println("b) int");
    System.out.println("c) float");
    String respuesta = teclado.nextLine();
    
    if (respuesta.equals("b")) {
      puntos++;
      System.out.println("¡Respuesta correcta!");
    } else {
      System.out.println("¡Oh, no!, la respuesta es incorrecta.");
    }
    
    System.out.println("\n 2) ¿Cuál NO es un Lenguaje de Programación?");
    System.out.println("a) JAVA");
    System.out.println("b) PHYTON");
    System.out.println("c) REX");
    respuesta = teclado.nextLine();
    
    if (respuesta.equals("c")) {
      puntos++;
      System.out.println("¡Respuesta correcta!");
    } else {
      System.out.println("¡Oh, no!, la respuesta es incorrecta.");
    }
    //Tercera
    System.out.println("\n 3) ¿Como declaro una variable con punto decimal? ");
    System.out.println("a) float");
    System.out.println("b) int");
    System.out.println("c) string");
    respuesta = teclado.nextLine();
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println("¡Respuesta correcta!");
    } else {
      System.out.println("¡Oh, no!, la respuesta es incorrecta.");
    }
    //Cuarta
    System.out.println("\n 4) ¿Como declaro una letra/caracter?");
    System.out.println("a) char");
    System.out.println("b) float");
    System.out.println("c) string");
    respuesta = teclado.nextLine();
    if (respuesta.equals("c")){
      puntos++;
      System.out.println("¡Respuesta correcta!");
    } else {
      System.out.println("¡Oh, no!, la respuesta es incorrecta.");
    }
    //Quinta
    System.out.println("\n 5) ¿Para que sirve \n?");
    System.out.println("a) salto de linea");
    System.out.println("b) color a letras");
    System.out.println("c) nada");
    respuesta = teclado.nextLine();
    if (respuesta.equals("a")){
      puntos++;
      System.out.println("¡Respuesta correcta!");
    } else {
      System.out.println("¡Oh, no!, la respuesta es incorrecta.");
    }
    //Sexta
    System.out.println("\n 6) ¿Cuantos lenguajes de programacion existen?");
    System.out.println("a) Ninguno");
    System.out.println("b) 10");
    System.out.println("c) Muchos");
    respuesta = teclado.nextLine();
    if (respuesta.equals("c")){
      puntos++;
      System.out.println("¡Respuesta correcta!");
    } else {
      System.out.println("¡Oh, no!, la respuesta es incorrecta.");
    }
    //Séptima
    System.out.println("\n 7) ¿Cual de las siguientes no es una base de datos?");
    System.out.println("a) AGUA PURA");
    System.out.println("b) ACCESS");
    System.out.println("c) SQL");
    respuesta = teclado.nextLine();
    if (respuesta.equals("c")){
      puntos++;
      System.out.println("¡Respuesta correcta!");
    } else {
      System.out.println("¡Oh, no!, la respuesta es incorrecta.");
    }
    //Octava
    System.out.println("\n 8) ¿Te está gustando el cuestionario?");
    System.out.println("a) Sí");
    System.out.println("b) No");
    puntos++;
    respuesta = teclado.nextLine();
    if (respuesta.equals("a")){
      System.out.println("¡Muchas gracias, hombre!");
    } else {
      System.out.println("¡A mi cuestionario tampoco le estás gustando tú.");
    }
    //Novena
    System.out.println("\n 9) ¿Que utilizamos para comentar en java?");
    System.out.println("a) //");
    System.out.println("b) comentario");
    respuesta = teclado.nextLine();
    if (respuesta.equals("a")){
      puntos++;
      System.out.println("¡Respuesta correcta!");
    } else {
      System.out.println("¡Oh, no!, la respuesta es incorrecta.");
    }
    //Décima
    System.out.println("\n 10) ¿A cuántos espaciados debería equivaler una tabulación según el estándar de Google?");
    System.out.println("a) 1");
    System.out.println("b) 2");
    System.out.println("c) 3");
    
    respuesta = teclado.nextLine();
    
    if (respuesta.equals("b")){
      puntos++;
      System.out.println("¡Respuesta correcta!");
    } else {
      System.out.println("¡Oh, no!, la respuesta es incorrecta.");
    }
    //Puntuación
    System.out.println("\n La puntuación que ha sacado en este test es de: " + puntos);
    if (puntos < 5){
      System.out.println("¡Uf!, deberías estudiar un poco más.");
    } else if (puntos < 7){
      System.out.println("Está bastante bien, pero seguro que puedes hacerlo mejor");
    } else if (puntos <= 10){
      System.out.println("¡Genial, sigue así!");
    }
    }
    
}
