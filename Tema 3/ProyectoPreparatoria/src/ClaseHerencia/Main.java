/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseHerencia;
import javax.swing.JOptionPane;
/**
 *
 * @author ONII
 */
public class Main { // Clase Principal
    
    public static void main(String[] args) {
        
        // variables o Atributos locales de le clase "Main"
        
        String xNombre, xCarrera, xNomAsign;
        int xNumControl;
        double xCalAsign;
        
        /*  Solicitud de datos por teclado por la clase "JOptionPane" por el metodo "ShowInputDialog"     
        *   Y se guardan en las Variables o atributos designados
        */  
        
        xNombre = JOptionPane.showInputDialog("Capturar el nombre: ");
        xCarrera = JOptionPane.showInputDialog("Capturar carrera: ");
        xNomAsign = JOptionPane.showInputDialog("Capturar nombre de Asignatura: ");
        xNumControl = Integer.parseInt(JOptionPane.showInputDialog("Capturar numero de control: "));
        xCalAsign = Double.parseDouble(JOptionPane.showInputDialog("Capturar la Calificacion: "));
        
        // Instancia de la Clase "RecordCalificacion" por el objeto "RecCal"
        
        RecordCalificacion RecCal = new RecordCalificacion(xNomAsign, xCalAsign, xNombre, xCarrera,  xNumControl);
        
        //  Obtencion de los datos del objeto "RecCal" y guardandolos en las variables designadas
        
        xNombre = RecCal.getNombre();
        xCarrera = RecCal.getCarrera();
        xNumControl = RecCal.getNumControl();
        xNomAsign = RecCal.getNomAsign();
        xCalAsign = RecCal.getCalAsign();
        
        //  Impresion de los Atributos o Variables 
        
        System.out.println("Nombre: " + xNombre);
        System.out.println("Carrera: " + xCarrera);
        System.out.println("Numero de Control: " + xNumControl);
        System.out.println("Nombre Asignatura: " + xNomAsign);
        System.out.println("Calificación: " + xCalAsign);
        System.out.println("");
        
        //  Solicitud de datos por teclado y guadandolos en las Variables o Atributos designados
        
        xNombre = JOptionPane.showInputDialog("Capturar el nombre: ");
        xCarrera = JOptionPane.showInputDialog("Capturar carrera: ");
        xNomAsign = JOptionPane.showInputDialog("Capturar nombre de Asignatura: ");
        xNumControl = Integer.parseInt(JOptionPane.showInputDialog("Capturar numero de control: "));
        xCalAsign = Double.parseDouble(JOptionPane.showInputDialog("Capturar la Calificacion: "));
        
        //  Asignacion de los datos introducidos por teclado a las Variables o Atributos designados
        
        RecCal.setNombre(xNombre);
        RecCal.setCarrera(xCarrera);
        RecCal.setNomAsign(xNomAsign);
        RecCal.setNumControl(xNumControl);
        RecCal.setCalAsign(xCalAsign);
        
        //  Imprecion de los Atributos del objeto "RecCal" Actualizados
        
        System.out.println("//-- Datos Actualizados --//");
        System.out.println("Nombre: " + RecCal.getNombre());
        System.out.println("Carrera: " + RecCal.getCarrera());
        System.out.println("Numero de Control: " + RecCal.getNumControl());
        System.out.println("Nombre Asignatura: " + RecCal.getNomAsign());
        System.out.println("Calificación: " + RecCal.getCalAsign());
        System.out.println("");
        
    }    
}
