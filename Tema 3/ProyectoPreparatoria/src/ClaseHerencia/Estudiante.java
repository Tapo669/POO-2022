/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ClaseHerencia;

/**
 *
 * @author ONII
 */

public class Estudiante {   //  Clase Padre
    
    //  Atributos de la Clase
    
    String nombre, carrera;
    int numControl;
    
    //  Constructores de la clase

    public Estudiante(String nombre, String carrera, int numControl) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.numControl = numControl;
    }

    public String getNombre() {
        return nombre;
    }
    
    //  Metodos Setter & Getter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getNumControl() {
        return numControl;
    }

    public void setNumControl(int numControl) {
        this.numControl = numControl;
    }
}
