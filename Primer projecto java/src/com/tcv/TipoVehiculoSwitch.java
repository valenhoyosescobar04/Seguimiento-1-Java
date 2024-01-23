package com.tcv;

public class TipoVehiculoSwitch {
    public static void main(String[] args) {
        String tipo = "coche";

        switch (tipo) {
            case "coche" -> System.out.println("Es un vehículo de cuatro ruedas.");
            case "moto" -> System.out.println("Es un vehículo de dos ruedas.");
            case "camión" -> System.out.println("Es un vehículo de carga.");
            default -> System.out.println("Tipo de vehículo desconocido.");
        }
    }

}
