/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ONII
 */
public class Apartamento extends Propiedad{
    
    int numInterior;
    double renta;
    boolean pertenencia;
    int numHabitaciones;
    String nombreEdificio;

    public Apartamento(int numInterior, double renta, boolean pertenencia, int numHabitaciones, String nombreEdificio, String servicio1, String servicio2, String propietario, int size) {
        super(servicio1, servicio2, propietario, size);
        this.numInterior = numInterior;
        this.renta = renta;
        this.pertenencia = pertenencia;
        this.numHabitaciones = numHabitaciones;
        this.nombreEdificio = nombreEdificio;
    }

    public Apartamento() {
    }

    public int getNumInterior() {
        return numInterior;
    }

    public void setNumInterior(int numInterior) {
        this.numInterior = numInterior;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public boolean isPertenencia() {
        return pertenencia;
    }

    public void setPertenencia(boolean pertenencia) {
        this.pertenencia = pertenencia;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }


    
    public double pagarRenta(int mensualidades){
         
        double importeRenta = mensualidades * renta;
        
        return importeRenta;
    }
    
    
}
