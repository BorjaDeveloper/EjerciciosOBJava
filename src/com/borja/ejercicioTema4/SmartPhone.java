package com.borja.ejercicioTema4;

public class SmartPhone extends SmartDevice{

    double pixelCamara;
    boolean cargaRapida;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, int capacidad, int pulgPantalla, boolean gps,
                      double pixelCamara, boolean cargaRapida) {
        super(marca, modelo, capacidad, pulgPantalla, gps);
        this.pixelCamara = pixelCamara;
        this.cargaRapida = cargaRapida;
    }
}
