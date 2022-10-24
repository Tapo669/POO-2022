/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseHerencia;

/**
 *
 * @author ONII
 */
public class Trabajador extends Empresa{    // Herencia de clase "Empresa"
    
    //  Atributos o Variables de la clase "Trabajador"
    
    int numeroGafete, cantidadCortesCabelloMes, precioXCorte;
    
    //  Metodos o Funciones de la clase "Trabajador"
    
    public void mostrarDatosTrabajador(){
    
        System.out.println("Numero de Gafete: " + numeroGafete);
        System.out.println("Cantidad de cortes de cabello por mes: " + cantidadCortesCabelloMes);
        System.out.println("Precio por corte: " + precioXCorte);
        
    }
    
    public void mostrarDatosTrabajadorEmpresa(){
        
        System.out.println("Numero de Gafete: " + numeroGafete);
        System.out.println("Cantidad de cortes de cabello por mes: " + cantidadCortesCabelloMes);
        System.out.println("Precio por corte: " + precioXCorte);
        System.out.println("Nombre de la Empesa: " + nombreEmpresa);
        System.out.println("Codigo Postal: " + codigoPostal);
    
    }
    
        //  Constructores clase "Trabajador"

    public Trabajador(int numeroGafete, int cantidadCortesCabelloMes, int precioXCorte, String nombreEmpresa, int codigoPostal) {
        super(nombreEmpresa, codigoPostal);
        this.numeroGafete = numeroGafete;
        this.cantidadCortesCabelloMes = cantidadCortesCabelloMes;
        this.precioXCorte = precioXCorte;
    }

    public Trabajador() {
    }
    
    
}
