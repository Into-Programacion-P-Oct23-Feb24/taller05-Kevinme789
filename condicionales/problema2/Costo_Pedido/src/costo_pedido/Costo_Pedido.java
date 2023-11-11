/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package costo_pedido;

import java.util.Scanner;

/**
 *
 * @author porke
 */
public class Costo_Pedido {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String descripcion = "Portatil HP";
        int almacen = 100;
        double precio = 1500;
        int cantidad;
        double total;
        
        System.out.printf("Producto a comprar: %s\nPrecio por unidad: %.2f\n"
                ,descripcion, precio);
        System.out.println("Ingrese la cantidad de unidades a comprar:");
        cantidad = sc.nextInt();
        total = precio * cantidad;

        if (cantidad > 50 && cantidad <= almacen ) {
            total = total - (total * 0.15);
            System.out.println("Su total a pagar con descuento incluido es de: " 
                    + total);
        } else if (cantidad <= 50 && cantidad <= almacen ){
            System.out.println("Su total a pagar es: " + total);
        }
        else{ 
         System.out.println("No contamos con esa cantidad de unidades ");
        }
    }
    
}
