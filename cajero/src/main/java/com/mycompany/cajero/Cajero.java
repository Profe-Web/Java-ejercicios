package com.mycompany.cajero;

import java.util.Scanner;

/**
 *
 * @author Profe
 */
public class Cajero {

    public static void main(String[] args) {
        System.out.println("Cuanto deseas sacar? (max 900€, multiplos de 10)");
        Scanner teclado = new Scanner(System.in);
        int dinero = teclado.nextInt();

        int billetes50 = dinero / 50;
        int restoBilletes50 = dinero % 50;

        int billetes20 = restoBilletes50 / 20;
        int restoBilletes20 = restoBilletes50 % 20;

        int billetes10 = restoBilletes20 / 10;
        
        System.out.println("");
        System.out.println("Billetes de 50 = " + billetes50);
        System.out.println("Billetes de 20 = " + billetes20);
        System.out.println("Billetes de 10 = " + billetes10);
        
    }
}

