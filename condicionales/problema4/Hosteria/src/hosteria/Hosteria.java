/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hosteria;

import java.util.Scanner;

/**
 *
 * @author porke
 */
public class Hosteria {

    /**
     * @param args the command line arguments
     */
    /*
     En una hosteria de la ciudad de Loja se hace un descuento del 10% si el 
    cliente se hospeda más de 5 días, del 15% si se hospeda más de 10 días y del
    20% si se hospeda más de 15 días. Elaborar un solución que pida como datos 
    de entrada el número de días y el precio diario de la habitación y luego 
    calcule e imprima el subtotal por pagar, el descuento y el total por pagar.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total;
        double subtotal;
        int diasHospedado;
        double precioDia;
        double descuento;
        System.out.println("Ingrese el numero de dias que se hospedo");
        diasHospedado = sc.nextInt();
        System.out.println("Ingrese el precio por dia de hospedaje");
        precioDia = sc.nextInt();
        subtotal = (diasHospedado * precioDia);
        if (diasHospedado > 15) {
            descuento = subtotal * 0.2;
            total = subtotal - descuento;
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total a pagar: $" + total);

        } else if (diasHospedado > 10 && diasHospedado <= 15) {
            descuento = subtotal * 0.15;
            total = subtotal - descuento;
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total a pagar: $" + total);

        } else if (diasHospedado > 5 && diasHospedado <= 10) {
            descuento = subtotal * 0.1;
            total = subtotal - descuento;
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total a pagar: $" + total);

        } else {
            total = subtotal;
            descuento = 0;
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total a pagar: $" + total);
        }

    }

}
