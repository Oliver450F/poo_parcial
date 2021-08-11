/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author olive
 */
public class Aereo extends Vehiculo {
    private String avion,elicoptero;
public Aereo (){}
    public Aereo(String avion, String elicoptero, String tipo, String linea, String chasis, String serie, String asientos, String color, String placa, String marca, String modelo, String vin, String motor, String cilindraje) {
        super(tipo, linea, chasis, serie, asientos, color, placa, marca, modelo, vin, motor, cilindraje);
        this.avion = avion;
        this.elicoptero = elicoptero;
    }

    public String getAvion() {
        return avion;
    }

    public void setAvion(String avion) {
        this.avion = avion;
    }

    public String getElicoptero() {
        return elicoptero;
    }

    public void setElicoptero(String elicoptero) {
        this.elicoptero = elicoptero;
    }
    
    
}
