/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseHerencia;

/**
 *
 * @author ONII
 */
public class RecordCalificacion extends Estudiante{ //  Clase hija de la Clase "Estudiante"

    //  Atributos de la clase
    
    String nomAsign;
    double calAsign;
    
    //  Constructor de la clase
    
    public RecordCalificacion(String nomAsign, double calAsign, String nombre, String carrera, int numControl) {
        super(nombre, carrera, numControl);
        this.nomAsign = nomAsign;
        this.calAsign = calAsign;
    }
    
    //  Metodos Setter & Getter
    
    public String getNomAsign() {
        return nomAsign;
    }

    public void setNomAsign(String nomAsign) {
        this.nomAsign = nomAsign;
    }

    public double getCalAsign() {
        return calAsign;
    }

    public void setCalAsign(double calAsign) {
        this.calAsign = calAsign;
    }
}
