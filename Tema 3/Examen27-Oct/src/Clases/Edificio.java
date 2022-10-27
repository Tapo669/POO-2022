/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ONII
 */
public class Edificio {
    
    //  Atributos Variables de la clase
    
    String direccion;
    int codigoPostal;

    //  Constructores de la clase
    
    public Edificio(String direccion, int codigoPostal) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
    }
    
        public Edificio() {
        this.direccion = "";
        this.codigoPostal = 0;
    }

    //  Getter & Setter
        
        
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
        
        
}
