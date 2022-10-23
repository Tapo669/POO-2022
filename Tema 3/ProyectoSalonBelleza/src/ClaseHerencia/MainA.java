/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseHerencia;

/**
 *
 * @author ONII
 */
public class MainA {
    
    public static void main(String[] args){
    
        //  Instancias de clase padre "Empresa"
        Empresa EmpresaA = new Empresa("Lizzy's Barbería y Salón", 87491);
        Empresa EmpresaB = new Empresa("Bonilla’s Beauty Salon", 87943);
        
        //  Instancias de clase hija "Cliente"
        Cliente ClienteA = new Cliente("Juan", 48, "Lizzy's Barbería y Salón", 87491);
        Cliente ClienteB = new Cliente("Roberto", 23, "Bonilla’s Beauty Salon", 87943);
        
        //  Instancias de clase hija "Trabajador"
        Trabajador TrabajadorA = new Trabajador(56969, 120, 200, "Lizzy's Barbería y Salón", 87491);
        Trabajador TrabajadorB = new Trabajador(56980, 358, 50, "Bonilla’s Beauty Salon", 87943);
       
        
        //  Imprecion de Clase Padre "Empresa"
        //  Instancia A
        System.out.println("El nombre de la empresa es: " + EmpresaA.getNombreEmpresa());
        System.out.println("El codigo postal de la empresa es: " + EmpresaA.getCodigoPostal());
        //  Instancia B
        System.out.println("El nombre de la empresa es: " + EmpresaB.getNombreEmpresa());
        System.out.println("El codigo postal de la empresa es: " + EmpresaB.getCodigoPostal());
        
        
        //  Imprecion de la Clase Hija "Cliente"
        
        ClienteA.mostrarDatosCliente();
        ClienteA.mostrarDatosCliente_Empreza();
        ClienteB.mostrarDatosCliente();
        ClienteB.mostrarDatosCliente_Empreza();
        
    }
    
}
