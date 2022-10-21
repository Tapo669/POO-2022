/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ONII
 */
public class Electrodomestico {
    
    //  Atributos o Variables
    
    String modelo, marca;
    double precio;
    int cantidadVendida;

    //   Constructor
    
    public Electrodomestico(String modelo, String marca, double precio, int cantidadVendida) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.cantidadVendida = cantidadVendida;
    }
    
    public Electrodomestico() {
        this.modelo = "";
        this.marca = "";
        this.precio = 0.0;
        this.cantidadVendida = 0;
    }

    //  Setter & Getter
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }
    
    
    //  Funciones o Metodos
    
    public void mostrarDatosElectrodomestico(){
    
        System.out.println("Modelo: " + modelo + " || " + "Marca: " + marca + " || " + "Precio: " + precio + " || " + "Cantidad Vendida: " + cantidadVendida + " ||");
        System.out.println("Ganancia: " + calcularGanancia());
        System.out.println(" ");
    }
    
    public double calcularGanancia(){
    
        double resultado = precio * cantidadVendida;
        
        return resultado;
    }
}
