/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseHerencia;

/**
 *
 * @author ONII
 */
public class Empresa {
    
    //  Atributos de la clase Padre Empreza
    
    String nombreEmpresa;
    int codigoPostal;
    
    
    //  Constructores de la Clase "Empresa"
    
    public Empresa(String nombreEmpresa, int codigoPostal) {
        this.nombreEmpresa = nombreEmpresa;
        this.codigoPostal = codigoPostal;
    }
    
    public Empresa() {
        this.nombreEmpresa = "";
        this.codigoPostal = 0;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    
    
}
