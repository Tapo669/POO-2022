/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.Scanner;
/**
 *
 * @author ONII
 */
public class Principal_A {
        
    public static void main(String[] args){

        Casa Casa1 = new Casa("Block", "Centrico", 500.00, 2, 35, "Agua", "Luz", "Juan Alberto,", 45);
        Apartamento Apartamento1 = new Apartamento(25, 450.0, false, 1, "UtilName", "Agua", "Luz", "Luis Angel", 30);
        
        Scanner ObjIn = new Scanner(System.in);
        
        System.out.println("// Casa //");

        System.out.print("La casa es suya(true / false): ");
        Casa1.setPertenecia(ObjIn.nextBoolean());
        
      
        if (Casa1.pertenecia == true){
            
            System.out.print("Introduzca el tamaño de la propiedad: ");
            Casa1.setSize(ObjIn.nextInt());
            
            System.out.print("Introduzca el precio por metro cuadrado: "); 
            double costeM2 = ObjIn.nextDouble();
            
            System.out.println("Importe a pagar(Predial): " + Casa1.pagarPredial(costeM2));
        } 
       
        else if(Casa1.pertenecia == false){
            System.out.print("Introducir las mensualidades por pagar: ");
            int x = ObjIn.nextInt();
            
            System.out.print("Introducir el Coste por mes de renta: ");
            double y = ObjIn.nextDouble();
            
            System.out.println("Importe de la renta: " + Casa1.pagarRenta(x, y));
        }  
            
        System.out.println(" ");
        System.out.println("// Apartamento //");
        
        if (Apartamento1.pertenencia == false){
            
            System.out.print("Introducir el numero de mensualidades por pagar: ");
            int a = ObjIn.nextInt();
            
            System.out.print("Introducir el coste por mes de la renta: ");
            Apartamento1.setRenta(ObjIn.nextDouble());
          
            System.out.println("Importe de la renta: " + Apartamento1.pagarRenta(a));
        }

    
    
        
    }
    
}
