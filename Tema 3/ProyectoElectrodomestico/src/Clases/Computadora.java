/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ONII
 */
public class Computadora extends Electrodomestico{  // Herencia de Electrodomestico
    
    //  Atributos o Variables
    
    double consumoProcesador,consumoGraficaW,consumoRAMW;

    //  Constructor
    
    public Computadora(double consumoProcesador, double consumoGraficaW, double consumoRAMW, String modelo, String marca, double precio, int cantidadVendida) {
        super(modelo, marca, precio, cantidadVendida);
        this.consumoProcesador = consumoProcesador;
        this.consumoGraficaW = consumoGraficaW;
        this.consumoRAMW = consumoRAMW;
    }

    //  Setter & Getter
    
    public double getConsumoProcesador() {
        return consumoProcesador;
    }

    public void setConsumoProcesador(double consumoProcesador) {
        this.consumoProcesador = consumoProcesador;
    }

    public double getConsumoGraficaW() {
        return consumoGraficaW;
    }

    public void setConsumoGraficaW(double consumoGraficaW) {
        this.consumoGraficaW = consumoGraficaW;
    }

    public double getConsumoRAMW() {
        return consumoRAMW;
    }

    public void setConsumoRAMW(double consumoRAMW) {
        this.consumoRAMW = consumoRAMW;
    }
    
    //  Funciones o Metodos
    
    public void mostrarDatosComputadora(){
    
        System.out.println("Modelo: " + modelo + " || " + "Marca: " + marca + " || " + "Precio: " + precio + " || " + "Cantidad Vendida: " + cantidadVendida + " ||");
        System.out.println("Consumo de procesador: " + consumoProcesador + "W || " +"Consumo Grafica: " + consumoGraficaW + "W || " + "Consumo RAM: " + consumoRAMW + "W ||");
        System.out.println("Consumo total: " + consumoTotalW() + "W");
        System.out.println(" ");
    }
    
    public double consumoTotalW(){
    
        double totalConsumoW = consumoProcesador + consumoGraficaW + consumoRAMW;
        
        return totalConsumoW;
    }
    
}
