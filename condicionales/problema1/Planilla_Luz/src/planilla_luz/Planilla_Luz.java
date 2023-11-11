/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package planilla_luz;

import java.util.Scanner;

/**
 *
 * @author porke
 */
public class Planilla_Luz {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total;
        int edad;
        float costoKilovatio;
        float kilovatiosConsumidos;
        System.out.println("Ingrese el valor de costo por kilovatio/hora");
        costoKilovatio = sc.nextFloat();
        System.out.println("Ingrese el numero de kilovatios consumidos en el "
                + "mes");
        kilovatiosConsumidos = sc.nextFloat();
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();

        total = costoKilovatio * kilovatiosConsumidos;
        if (edad > 65) {
            total = total - (total * 0.1);
            System.out.println("Su total a pagar con descuento es: " + total);
        } else {
            System.out.println("Su total a pagar es: " + total);
        }

    }

}
