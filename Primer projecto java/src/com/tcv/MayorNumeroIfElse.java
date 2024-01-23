package com.tcv;

public class MayorNumeroIfElse {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 18;

        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }
}

