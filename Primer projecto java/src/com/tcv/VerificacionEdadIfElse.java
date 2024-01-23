package com.tcv;

public class VerificacionEdadIfElse {
    public static void main(String[] args) {
        int edad = 19;

        if (edad >= 18) {
            System.out.println("Tienes acceso permitido.");
        } else {
            System.out.println("Debes ser mayor de edad para acceder.");
        }
    }
}