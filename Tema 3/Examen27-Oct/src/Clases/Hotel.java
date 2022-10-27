/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ONII
 */
public class Hotel extends Edificio{
    
    //  Atributos o Variables de la clase
    
    String nombreHuesped;
    double costoDiarioHabitacion;
    int tipoHabitacion;
    
    //  Constructores de la clase

    public Hotel(String nombreHuesped, double costoDiarioHabitacion, int tipoHabitacion, String direccion, int codigoPostal) {
        super(direccion, codigoPostal);
        this.nombreHuesped = nombreHuesped;
        this.costoDiarioHabitacion = costoDiarioHabitacion;
        this.tipoHabitacion = tipoHabitacion;
    }

    public Hotel() {
    }
            
    //  Setter & Getter

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public void setNombreHuesped(String nombreHuesped) {
        this.nombreHuesped = nombreHuesped;
    }

    public double getCostoDiarioHabitacion() {
        return costoDiarioHabitacion;
    }

    public void setCostoDiarioHabitacion(double costoDiarioHabitacion) {
        this.costoDiarioHabitacion = costoDiarioHabitacion;
    }

    public int getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(int tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    //  Funcion o Metodo de la clase Importe servicio es igual al costo diario de la habitacion por la cantidad de dias reservados
    
    public double calcularImporteServicio(int cantidadDiasReservacion){
        
        double importeServicio = costoDiarioHabitacion*cantidadDiasReservacion; 
        
        return importeServicio;
    }
    
    
}
