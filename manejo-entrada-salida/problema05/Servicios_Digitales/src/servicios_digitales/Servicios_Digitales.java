/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package servicios_digitales;
import java.util.Scanner;

/**
 *
 * @author porke
 */
public class Servicios_Digitales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double total;
         int edad;
         double netflix;
         double youtubePremiun;
         double dropbox;
         double spotify;
         System.out.println("Ingrese el valor mensual de Netflix");
         netflix = sc.nextDouble();
         System.out.println("Ingrese el valor mensual de Youtube Premiun");
         youtubePremiun = sc.nextDouble();
         System.out.println("Ingrese el valor mensual de Dropbox");
         dropbox = sc.nextDouble();
         System.out.println("Ingrese el valor mensual de Spotify");
         spotify = sc.nextDouble();
         System.out.println("Ingrese su edad");
         edad = sc.nextInt();
         total = netflix + youtubePremiun + dropbox+ spotify;
         if (edad  < 30){
             total = total - (total * 0.2);
             System.out.println("Su valor mensual incluido el descuento"
                     + " a pagar es de: " + total);
         }else{
             System.out.println("Su valor mensual a pagar es: " + total);
         
         }
    }
    
}
