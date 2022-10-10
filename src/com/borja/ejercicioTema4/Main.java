package com.borja.ejercicioTema4;

public class Main {

    public static void main(String[] args) {

        SmartPhone iphone12 = new SmartPhone();

        SmartPhone samsung12 = new SmartPhone("Samsung", "doce", 64, 6, false,
                128, false);

        SmartDevice garminFenix = new SmartDevice();

        SmartDevice polarIgnite = new SmartDevice("Polar", "Ignite", 8, 3,
                true);

        System.out.println(samsung12.marca);
        System.out.println(samsung12.modelo);
        System.out.println(samsung12.capacidad);
        System.out.println(samsung12.cargaRapida);
        System.out.println(samsung12.pulgPantalla);
        System.out.println(samsung12.gps);
        System.out.println(samsung12.pixelCamara);

        System.out.println("FIN");

        System.out.println(polarIgnite.marca);
        System.out.println(polarIgnite.modelo);
        System.out.println(polarIgnite.capacidad);
        System.out.println(polarIgnite.pulgPantalla);
        System.out.println(polarIgnite.gps);
    }
}
