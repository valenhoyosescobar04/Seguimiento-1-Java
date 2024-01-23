package com.tcv;

public class CicloWhile {
    public static void main(String[] args) {
        System.out.println("Ejemplo con ciclo while:");

        int suma = 0;
        int contador = 1;

        while (contador <= 10) {
            suma += contador;
            contador++;
        }

        System.out.println("La suma es: " + suma);
    }
}
