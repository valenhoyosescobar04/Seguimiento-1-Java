package com.tcv;
import java.util.Scanner;

public class VerificarParTernario {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            String resultado = (numero % 2 == 0) ? "par" : "impar";
            System.out.println("El número ingresado es " + resultado + ".");

            scanner.close();
        }
    }

