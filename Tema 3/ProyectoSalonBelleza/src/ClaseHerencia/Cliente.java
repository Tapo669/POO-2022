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
    
    //  Atributos de la clase Hija Cliente
    
    String cliente;
    int edad;
    
    
    
    public void mostrarDatosCliente(){


    }
    
    public void mostrarDatosCliente_Empreza(){
    
    
    
    }

    public Cliente(String cliente, int edad, String nombreEmpresa, int codigoPostal) {
        super(nombreEmpresa, codigoPostal);
        this.cliente = cliente;
        this.edad = edad;
    }

    public Cliente() {
    }





}




