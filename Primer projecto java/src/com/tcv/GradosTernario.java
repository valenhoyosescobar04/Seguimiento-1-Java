package com.tcv;
import java.util.Scanner;
public class GradosTernario {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese la temperatura en grados Celsius: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);

            scanner.close();
        }
    }

