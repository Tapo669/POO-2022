/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ONII
 */
public class Propiedad {
    
    String servicio1;
    String servicio2;
    String propietario;
    int size;

    public Propiedad(String servicio1, String servicio2, String propietario, int size) {
        this.servicio1 = servicio1;
        this.servicio2 = servicio2;
        this.propietario = propietario;
        this.size = size;
    }

    public Propiedad() {
        this.servicio1 = " ";
        this.servicio2 = " ";
        this.propietario = " ";
        this.size = 0;
    }

    public String getServicio1() {
        return servicio1;
    }

    public void setServicio1(String servicio1) {
        this.servicio1 = servicio1;
    }

    public String getServicio2() {
        return servicio2;
    }

    public void setServicio2(String servicio2) {
        this.servicio2 = servicio2;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
    
}
