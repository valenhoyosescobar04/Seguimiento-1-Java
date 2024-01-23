package com.tcv;
import java.util.Scanner;
public class NegativoPositivoTernario {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            String resultado = (numero >= 0) ? "positivo" : "negativo";
            System.out.println("El número ingresado es " + resultado + ".");

            scanner.close();
        }
    }
