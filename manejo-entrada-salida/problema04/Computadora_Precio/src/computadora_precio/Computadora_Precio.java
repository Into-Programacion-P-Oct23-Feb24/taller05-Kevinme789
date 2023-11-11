/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computadora_precio;

import java.util.Scanner;

/**
 *
 * @author porke
 */
public class Computadora_Precio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cpu;
        double teclado;
        double pantalla;
        double raton;
        double valorTotal;
        System.out.println("Ingrese el costo del CPU");
        cpu = sc.nextDouble();
        System.out.println("Ingrese el costo del teclado");
        teclado = sc.nextDouble();
        System.out.println("Ingrese el costo de la pantalla");
        pantalla = sc.nextDouble();
        System.out.println("Ingrese el costo del raton");
        raton = sc.nextDouble();
        valorTotal = cpu + teclado + pantalla + raton;
        System.out.println("El valor total de la computadora de escritorio"
                + " es de: " + valorTotal);
    }
    
}
