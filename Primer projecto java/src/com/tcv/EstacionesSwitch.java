package com.tcv;

public class EstacionesSwitch {
    public static void main(String[] args) {
        String mes = "noviembre";

        switch (mes) {
            case "diciembre", "enero", "febrero" -> System.out.println("Es invierno.");
            case "marzo", "abril", "mayo" -> System.out.println("Es primavera.");
            case "junio", "julio", "agosto" -> System.out.println("Es verano.");
            case "septiembre", "octubre", "noviembre" -> System.out.println("Es otoño.");
            default -> System.out.println("Mes desconocido.");
        }
    }

}
