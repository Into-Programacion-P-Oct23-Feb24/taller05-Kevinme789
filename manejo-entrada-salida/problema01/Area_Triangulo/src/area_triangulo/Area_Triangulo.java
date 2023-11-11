/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area_triangulo;

import java.util.Scanner;

/**
 *
 * @author porke
 */
public class Area_Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese la base del triangulo");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        altura = sc.nextDouble();
        area = (base * altura) /2;
        System.out.println("El area del triangulo es de: " + area);
         
    }
    
}
