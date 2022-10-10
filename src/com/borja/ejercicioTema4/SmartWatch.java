package com.borja.ejercicioTema4;

public class SmartWatch extends SmartDevice{

    boolean pulsaciones;
    double kmRecorridos;

    public SmartWatch(){
    }

    public SmartWatch(String marca, String modelo, int capacidad, int pulgPantalla, boolean gps,
                      boolean pulsaciones, double kmRecorridos) {
        super(marca, modelo, capacidad, pulgPantalla, gps);
        this.pulsaciones = pulsaciones;
        this.kmRecorridos = kmRecorridos;
    }
}
