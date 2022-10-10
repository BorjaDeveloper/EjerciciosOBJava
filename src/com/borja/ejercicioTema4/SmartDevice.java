package com.borja.ejercicioTema4;

public class SmartDevice {

    String marca;
    String modelo;
    int capacidad;
    int pulgPantalla;
    boolean gps;

    public SmartDevice(){
    }

    public SmartDevice(String marca, String modelo, int capacidad, int pulgPantalla, boolean gps) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.pulgPantalla = pulgPantalla;
        this.gps = gps;
    }

}
