/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.Scanner; //    Import de la Funcion Scanner
/**
 *
 * @author ONII
 */
public class Principal_A {
        
    public static void main(String[] args){
        
        // Instancias de la clase Hija Casa y Apartamento

        Casa Casa1 = new Casa("Block", "Centrico", 500.00, 2, 35, "Agua", "Luz", "Juan Alberto,", 45);
        Apartamento Apartamento1 = new Apartamento(25, 450.0, false, 1, "UtilName", "Agua", "Luz", "Luis Angel", 30);
        
        Scanner ObjIn = new Scanner(System.in); //  Instancia de Scanner
        
        //  Impresion de la clase Hija Casa
        
        System.out.println("// Casa //");

        System.out.print("La casa es suya(true / false): ");
        Casa1.setPertenecia(ObjIn.nextBoolean());   // Asignacion del valor introducido por teclado al Atributo "pertenencia"
        
        /*
                --- Condicional entre Predial y Renta de Objeto Casa1 ---
            Si de la casa1 Pertenencia es verdadero
                Solicita al Usiario el Tamaño de la Propiedad y la asignara al Atributo "size"
                Solicita al Usuario el precio por M2 y lo asignara al Atributo "costeM2"
                
                Imprime El importe a pagar de predial llamando a la Función "pagarPredial" que recibe valor de "costeM2"
                
            Pero Si de la casa1 Pertenencia es falso
                Solicita al Usuario la cantidad de mensualidades por pagar y las asigna a la variable "x"
                Solicita al Usuario el coste de la renta por mes y lo asigna a la variable "y"
                Imprime el importe a pagar de la renta llamando a la Función "pagarRenta" que recibe valor de "x" y "y"
        */      
        
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
            
        
        //  Impresion de la clase Hija Apartameto
        
        System.out.println(" ");
        System.out.println("// Apartamento //");
       
        System.out.print("Introducir el numero de mensualidades por pagar: ");
        int a = ObjIn.nextInt();    //  Asigna el valor introducido por teclado a la variable "a"
            
        System.out.print("Introducir el coste por mes de la renta: ");
        Apartamento1.setRenta(ObjIn.nextDouble());  //  Asigna el valor introducido por teclado al Atributo "renta"
          
        System.out.println("Importe de la renta: " + Apartamento1.pagarRenta(a));   //  Imprime el importe de la renta llamando a la Función "pagarRenta" que recibe el valor de "a"
        
    }
    
}
