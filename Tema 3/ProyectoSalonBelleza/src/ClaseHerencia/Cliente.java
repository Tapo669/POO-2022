/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseHerencia;

/**
 *
 * @author ONII
 */
public class Cliente extends Empresa{   //  Herencia de clase Empresa
    
    //  Atributos o Variables de la clase "Cliente"
    
    String cliente;
    int edad;
    
    //  Metodos o Funciones de la clase "Cliente"
    
    public void mostrarDatosCliente(){
        
        System.out.println("Cliente: " + cliente);
        System.out.println("Edad: " + edad);

    }
    
    public void mostrarDatosCliente_Empreza(){
        
        System.out.println("Cliente: " + cliente);
        System.out.println("Edad: " + edad);
        System.out.println("Salon de Belleza: " + nombreEmpresa);
        System.out.println("Codigo Postal:" + codigoPostal);
        
    }

    //  Constructores clase "Cliente"
    
    public Cliente(String cliente, int edad, String nombreEmpresa, int codigoPostal) {
        super(nombreEmpresa, codigoPostal);
        this.cliente = cliente;
        this.edad = edad;
    }

    public Cliente() {
    }
}




