/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ONII
 */
public class Televisor extends Electrodomestico{    // Herencia de Electrodomestico
    
    // Atributos o Variables
    
    int resolucion, FPS;
    String size;
    
    //  Constructor

    public Televisor(int resolucion, String size, int FPS, String modelo, String marca, double precio, int cantidadVendida) {
        super(modelo, marca, precio, cantidadVendida);
        this.resolucion = resolucion;
        this.size = size;
        this.FPS = FPS;
    }

    public Televisor(String modelo, String marca, double precio, int cantidadVendida) {
        super(modelo, marca, precio, cantidadVendida);
    }


    //  Setter & Getter
    
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getFPS() {
        return FPS;
    }

    public void setFPS(int FPS) {
        this.FPS = FPS;
    }

    //  Funciones o Metodos
    
    public void mostrarDatosTelevisor(){
    System.out.println(" ");
    System.out.println("Modelo: " + modelo + " || " + "Marca: " + marca + " || " + "Precio: " + precio + " || " + "Cantidad Vendida: " + cantidadVendida + " ||");
    System.out.println("Resolución: " + resolucion + "px || " +"Tamaño: " + size + " || " + "Refresco: " + FPS + "fps ||");
    System.out.println(" ");
    }
    
    public int calcularResolucion(int x){
        
            switch(x){
            
                case 1:
                    resolucion = 1280*720;
                    break;
        
                case 2:
                    resolucion = 1920*1080; 
                    break;
                
                case 3:
                    resolucion = 2560 * 1440;
                    break;
                
                default :
                    resolucion = 0;
            }
        return resolucion;
    }
    
    
    public String sizeTelevisor(int x){
  
        switch(x){
            case 1:
                size =  "1280x720";
                break;
            case 2:
                size = "1920x1080"; 
                break;
            case 3:
                size = "2560x1440"; 
                break;
        }
        
        return size;
    }
    
    
}

