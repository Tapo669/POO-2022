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
        System.out.println("//--- Empresa ---//");
        //  Instancia A
        System.out.println("Empresa: " + EmpresaA.getNombreEmpresa());
        System.out.println("Codigo postal: " + EmpresaA.getCodigoPostal());
        System.out.println(" ");
        
        //  Instancia B
        System.out.println("Empresa: " + EmpresaB.getNombreEmpresa());
        System.out.println("Codigo postal: " + EmpresaB.getCodigoPostal());
        System.out.println(" ");
        
        
        //  Imprecion de la Clase Hija "Cliente"
        System.out.println("//--- Cliente ---//");
        
        ClienteA.mostrarDatosCliente(); //  Instancia A
        System.out.println(" ");
        ClienteB.mostrarDatosCliente(); //  Instancia B
        System.out.println(" ");
        ClienteA.mostrarDatosCliente_Empreza(); //  Instancia A
        System.out.println(" ");
        ClienteB.mostrarDatosCliente_Empreza(); //  Instancia B
        System.out.println(" ");
        
        
        //  Imprecion de la Clase Hija "Trabajador"
        System.out.println("//--- Trabajador ---//");

        TrabajadorA.mostrarDatosTrabajador();   //  Instancia A
        System.out.println(" ");
        TrabajadorB.mostrarDatosTrabajador();   //  Instancia B
        System.out.println(" ");
        TrabajadorA.mostrarDatosTrabajadorEmpresa();    //  Instancia A
        System.out.println(" ");
        TrabajadorB.mostrarDatosTrabajadorEmpresa();    //  Instancia B
        System.out.println(" ");
        
        
    }
    
}
