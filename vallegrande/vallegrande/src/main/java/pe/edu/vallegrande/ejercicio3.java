/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.vallegrande;

/**
 *
 * @author Lab23
 */
public class ejercicio3 {
    public static void main(String[] args) {
         int numero = 5; // Definimos el número para el cual queremos generar la tabla de multiplicar
        for (int i = 1, resultado; i <= 10; i++) {
            resultado = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, resultado);
        }
    }
}