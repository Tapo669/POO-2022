/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ONII
 */

public class Casa extends Propiedad{
    
    
    String material;
    String locale;
    double costeIpoteca;
    int numHabitaciones;
    int numExterior;
    boolean pertenecia;

    public Casa(String material, String locale, double costeIpoteca, int numHabitaciones, int numExterior, /*boolean pertenecia,*/ String servicio1, String servicio2, String propietario, int size) {
        super(servicio1, servicio2, propietario, size);
        this.material = material;
        this.locale = locale;
        this.costeIpoteca = costeIpoteca;
        this.numHabitaciones = numHabitaciones;
        this.numExterior = numExterior;
//        this.pertenecia = pertenecia;
    }



    public Casa() {
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public double getCosteIpoteca() {
        return costeIpoteca;
    }

    public void setCosteIpoteca(double costeIpoteca) {
        this.costeIpoteca = costeIpoteca;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumExterior() {
        return numExterior;
    }

    public void setNumExterior(int numExterior) {
        this.numExterior = numExterior;
    }

    public boolean isPertenecia() {
        return pertenecia;
    }

    public void setPertenecia(boolean pertenecia) {
        this.pertenecia = pertenecia;
    }

    public double pagarPredial(double costeM2){
    
        double importePredial = size * costeM2;
        
        return importePredial;
    }


    public double pagarRenta(int mensualidades, double renta){
         
        double importeRenta = mensualidades * renta;
        
        return importeRenta;
    }    
    
    
}
