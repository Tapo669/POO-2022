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
public class mainC {
    public static void main(String[] args) {
        
        //  INstancia de la clase "Hotel" con el objeto "HotelC"
        
        Hotel HotelC = new Hotel("Humberto", 900, 2, "Libertadores Cima 1", 87425);
        Scanner ObjIn = new Scanner(System.in); //  Instancia del metodo Scanner
        
        //  Solicitud de datos por teclado y asignacion a la variable/Atributo "x"
        
        System.out.println("Cantidad de dias de reservacion: ");
        int x = ObjIn.nextInt();
        
        //  Impresion de los Atributos del objeto "HotelC" y el metodo/Funcion "calcularImporteServicio"
        
        System.out.println("//-- Hotel C --//");
        System.out.println("Nombre Huesped: " + HotelC.getNombreHuesped());
        System.out.println("Costo Diario de la Habitacion: " + HotelC.getCostoDiarioHabitacion());
        System.out.println("Tipo de habitacion: " + HotelC.getTipoHabitacion());
        System.out.println("Direccion: " + HotelC.getDireccion());
        System.out.println("Codigo postal: " + HotelC.getCodigoPostal());
        
        System.out.println("Importe Servicio: " + HotelC.calcularImporteServicio(x));
    }    
}
