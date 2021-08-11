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
public class Terrestre extends Vehiculo {
    private String automovil,moto;
public Terrestre(){}
    public Terrestre(String automovil, String moto, String tipo, String linea, String chasis, String serie, String asientos, String color, String placa, String marca, String modelo, String vin, String motor, String cilindraje) {
        super(tipo, linea, chasis, serie, asientos, color, placa, marca, modelo, vin, motor, cilindraje);
        this.automovil = automovil;
        this.moto = moto;
    }

    public String getAutomovil() {
        return automovil;
    }

    public void setAutomovil(String automovil) {
        this.automovil = automovil;
    }

    public String getMoto() {
        return moto;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }
    
    
}
