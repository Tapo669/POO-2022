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
public class MainB {
    
    public static void main(String[] args) {
        
        //  Instancia de la clase "Hotel" con el objeto "HotelB"
        
        Hotel HotelB = new Hotel();
               
        Scanner ObjIn = new Scanner(System.in); //  Instancia del metodo Scanner
        
        //  Captura de datos del Objeto "HotelB"
        
        System.out.print("Capturar Nombre del Huesped:");
        HotelB.setNombreHuesped(ObjIn.next());
        System.out.print("Capturar costo de habitacion por dia:");
        HotelB.setCostoDiarioHabitacion(ObjIn.nextDouble());
        System.out.print("Capturar tipo de habitación(1 habitacion Sencilla || 2 Habitacion doble): ");
        HotelB.setTipoHabitacion(ObjIn.nextInt());
        System.out.print("Capturar Dirección del Hotel: ");
        HotelB.setDireccion(ObjIn.next());
        System.out.print("Capturar codigo postal: ");
        HotelB.setCodigoPostal(ObjIn.nextInt());
        System.out.println("");
        
        //  Impresion de datos del objeto "HotelB"
        
        System.out.println("//-- Hotel B --//");
        System.out.println("Nombre Huesped: " + HotelB.getNombreHuesped());
        System.out.println("Costo Diario de la Habitacion: " + HotelB.getCostoDiarioHabitacion());
        System.out.println("Tipo de habitacion: " + HotelB.getTipoHabitacion());
        System.out.println("Direccion: " + HotelB.getDireccion());
        System.out.println("Codigo postal: " + HotelB.getCodigoPostal());
        
        
        
    }    
}
