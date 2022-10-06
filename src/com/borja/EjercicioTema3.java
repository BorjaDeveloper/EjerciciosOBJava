package com.borja;

public class EjercicioTema3 {

    public static void main(String[] args) {

        //Crear un bucle que permita concatenar textos e imprima el resultado final por consola.

        //Creamos un array llamado miTexto
        String[] miTexto = new String[]{"Juan ", "Pedro ", "Alvaro "};

        //Con un simple bucle for recorremos el array e imprimimos por pantalla
        for(int i = 0; i < miTexto.length; i++) {
            System.out.print(miTexto[i]);
        }
    }
}
