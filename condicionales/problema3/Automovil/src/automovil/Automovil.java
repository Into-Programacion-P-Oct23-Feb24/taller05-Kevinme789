/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automovil;

import java.util.Scanner;

/**
 *
 * @author porke
 */
public class Automovil {

    /**
     * @param args the command line arguments
     */
    /*
    Elaborar una solución que permita leer los datos de un automóvil (marca, 
    origen y costo) imprima el impuesto por pagar y el precio de venta (incluido
    el impuesto). Si el origen es Alemania el impuesto es 20%, si es de Japón el 
    impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marcaAutomovil;
        String origen;
        double costo;
        double impuesto;
        double precioVenta;
        System.out.println("Ingrese la Marca de su Automovil:");
        marcaAutomovil = sc.nextLine();
        System.out.println("Ingrese el pais de origen de su Automovil:");
        origen = sc.nextLine();
        System.out.println("Ingrese el costo del automovil");
        costo = sc.nextDouble();
        if (origen.equals("Alemania") || origen.equals("alemania")
                || origen.equals("ALEMANIA")) {
            impuesto = costo * 0.20;
            precioVenta = costo + impuesto;
            System.out.printf("\nMarca de Automovil: %s\nPais de origen de su "
                    + "automovil: %s\n\nPrecio antes de impuestos: %.2f\nImpuesto "
                    + "por pagar: %.2f\nPrecio de Venta: %.2f\n",
                    marcaAutomovil, origen, costo, impuesto,
                    precioVenta);
        } else if (origen.equals("Japon") || origen.equals("japon")
                || origen.equals("JAPON")) {
            impuesto = costo * 0.30;
            precioVenta = costo + impuesto;
            System.out.printf("\nMarca de Automovil: %s\nPais de origen de su "
                    + "automovil: %s\n\nPrecio antes de impuestos: %.2f\nImpuesto "
                    + "por pagar: %.2f\nPrecio de Venta: %.2f\n",
                    marcaAutomovil, origen, costo, impuesto,
                    precioVenta);

        } else if (origen.equals("Italia") || origen.equals("italia")
                || origen.equals("ITALIA")) {
            impuesto = costo * 0.15;
            precioVenta = costo + impuesto;
            System.out.printf("\nMarca de Automovil: %s\nPais de origen de su "
                    + "automovil: %s\n\nPrecio antes de impuestos: %.2f\nImpuesto "
                    + "por pagar: %.2f\nPrecio de Venta: %.2f\n",
                    marcaAutomovil, origen, costo, impuesto,
                    precioVenta);

        } else if (origen.equals("Usa") || origen.equals("usa")
                || origen.equals("USA")) {
            impuesto = costo * 0.08;
            precioVenta = costo + impuesto;
            System.out.printf("\nMarca de Automovil: %s\nPais de origen de su "
                    + "automovil: %s\n\nPrecio antes de impuestos: %.2f\nImpuesto "
                    + "por pagar: %.2f\nPrecio de Venta: %.2f\n",
                    marcaAutomovil, origen, costo, impuesto,
                    precioVenta);

        } else {
            System.out.println("El pais que ingreso es incorrecto");

        }
    }

}
