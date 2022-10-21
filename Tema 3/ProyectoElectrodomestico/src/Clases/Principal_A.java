/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.Scanner; // Import de la clase Scanner

/**
 *
 * @author ONII
 */
public class Principal_A {
    
    public static void main(String[] args){
        
        // Instancias de Clase Padre Electrodomestico, Clases Hijas Compuadora y Televisor 
    
        Electrodomestico ElecDomestic = new Electrodomestico("Mate20Pro", "Huawei", 1000, 450);
        Computadora PC = new Computadora(65, 75, 1.3, "15db000dx", "HP", 4500, 500);
        Televisor Tele = new Televisor("Fr1t0s","WebOS", 2000, 50); 
        
        // Impresion de Clase Padre
    
        System.out.println("//-- ELECTRODOMESTICO --//");
        System.out.println("Las especificaciones del Electrodomestico son: ");
        ElecDomestic.mostrarDatosElectrodomestico(); // Función del Objeto [ElecDomestic] de la clase Padre
        
        // Impresion de la Clase Hija Computadora
        
        System.out.println("//-- Computadora --//");
        System.out.println("Las especificaciones de la Computadora son: ");
        PC.mostrarDatosComputadora(); // Funcion del Objeto [PC] de la clase Hija Computadora
        
        
        // Impresion de la Clase Hija Computadora
        
        Scanner ObjIn = new Scanner(System.in); // Instancia de Scanner
        
        
        System.out.println("//-- Televisor --//");
        
        boolean val = true; // Variable de Validación
        
        
        /*
            Bucle Do While usado para validar si el numero introducido corresponde al valor 1, 2 o 3(Solo numeros enteros)
            De no ser así repetira la ejecucion hasta que un valor sea [1, 2, 3]
        */
        
        do{
        
            System.out.print("Elegir resolucion: 1 - HD  |  2 - FHD  |  3 - QHD  | -->  ");
        
            int x = ObjIn.nextInt();    // Asignacion del valor introducido por teclado a la variable "x"
            
            Tele.calcularResolucion(x); // Funcion del objeto [Tele] de la clase Hija Televisor recibe valor de "x" 
            Tele.sizeTelevisor(x);  // Funcion del objeto [Tele] de la clase Hija Televisor
            
            /*
                --- Condicional de validacion ---
            
                    Si "X = 1" o "X = 2" o "X = 3"
                        Entonces "val = false"
                    De no ser así imprimir: ¡Valor Invalido!
            */
            
            if((x == 1) || (x == 2) || (x == 3)){      
            
                val = false;    // Si la condicion se cumple "val sera igual a falso"
        
            }
            else System.out.println("¡Valor Invalido!");
        
        }while(val); // Condicional a cumplir para finalizar el bucle
        

        System.out.print("Las espesificadiones del televisor son: ");
        Tele.mostrarDatosTelevisor();   // Funcion del objeto [Tele] de la clase Hija Televisor
        
    }
    
}
