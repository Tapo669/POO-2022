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
    
    String cliente; //  Atributos de la clase Hija Cliente
    int edad;
    
    
    
    public void mostrarDatosCliente(){  //  Función clase Hija "Cliente"
        
        System.out.print("Nombre: " + cliente);
        System.out.print("Edad: " + edad);

    }
    
    public void mostrarDatosCliente_Empreza(){  //  Función clase Hija "Cliente"
        
        System.out.print("Nombre: " + cliente);
        System.out.print("Edad: " + edad);
        System.out.print("Salon de Belleza: " + nombreEmpresa);
        System.out.print("Codigo Postal:" + codigoPostal);
        
    }

    //  Constructores, Setter & Getter
    
    public Cliente(String cliente, int edad, String nombreEmpresa, int codigoPostal) {
        super(nombreEmpresa, codigoPostal);
        this.cliente = cliente;
        this.edad = edad;
    }

    public Cliente() {
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}




