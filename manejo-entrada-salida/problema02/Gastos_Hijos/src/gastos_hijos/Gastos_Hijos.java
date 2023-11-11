/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gastos_hijos;

import java.util.Scanner;

/**
 *
 * @author porke
 */
public class Gastos_Hijos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double primerHijo;
        double segundoHijo;
        double tercerHijo;
        double gastoTotal;
        System.out.println("Ingrese el gasto del primer hijo");
        primerHijo = sc.nextDouble();
        System.out.println("Ingrese el gasto del segundo hijo");
        segundoHijo = sc.nextDouble();
        System.out.println("Ingrese el gasto del tercer hijo");
        tercerHijo = sc.nextDouble();
        gastoTotal = primerHijo + segundoHijo + tercerHijo;
        System.out.println("Total de gastos de los hijos del padre de familia: " + 
                gastoTotal);
    }
    
}
