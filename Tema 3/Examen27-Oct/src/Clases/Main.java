/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ONII
 */
public class Main {
    
    public static void main(String[] args) {
        
        //  Instancias de la clase "Edificio" con el objeto "EdificioA" y "Hotel" con el objeto "HotelA"
        
        Edificio EdificioA = new Edificio("Cima 2", 87494);
        Hotel HotelA = new Hotel("Erick Humberto", 750.00, 1, "Cima 2", 87946);
        
        //  Mostrar datos del objeto EdificioA

        System.out.println("//-- Edificio --//");
        System.out.println("Direccion del Edificio: " + EdificioA.getDireccion());
        System.out.println("Codigo Postal: " + EdificioA.getCodigoPostal());
        System.out.println(" ");
        
        //  Mostrar datos objeto HotelA
        
        System.out.println("//-- Hotel --//");
        System.out.println("Nombre Huesped: " + HotelA.getNombreHuesped());
        System.out.println("Precio por dia de habitacion: " + HotelA.getCostoDiarioHabitacion());
        System.out.println("Tipo de habitacion(1 habitacion Sencilla || 2 Habitacion doble): " + HotelA.getTipoHabitacion());
        System.out.println("Direccion del Hotel: " + HotelA.getDireccion());
        System.out.println("Codigo postal: " + HotelA.getCodigoPostal());

        
        
    }    
}
