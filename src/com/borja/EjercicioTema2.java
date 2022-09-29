package com.borja;

public class EjercicioTema2 {

    public static void main(String[] args) {

        double precio = 105.99;
        double precioiva = getPrecio(precio);
        System.out.println(precioiva);
    }

    static double getPrecio(double precio) {

        return precio*1.21;

    }
}
