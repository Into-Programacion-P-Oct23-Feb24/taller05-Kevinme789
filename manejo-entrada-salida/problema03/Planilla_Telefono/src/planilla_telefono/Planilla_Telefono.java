/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package planilla_telefono;

import java.util.Scanner;

/**
 *
 * @author porke
 */
public class Planilla_Telefono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroMinutos;
        double costoMinutos;
        double planillaTelefono;
        System.out.println("Ingrese el numero de minutos que consumio en el mes");
        numeroMinutos = sc.nextInt();
        System.out.println("Ingrese el costo por minuto");
        costoMinutos = sc.nextDouble();
        planillaTelefono = costoMinutos * numeroMinutos;
        System.out.println("El valor de la planilla de telefono es de: "
                + planillaTelefono);
        
    }
    
}
