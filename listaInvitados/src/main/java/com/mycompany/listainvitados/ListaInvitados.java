package com.mycompany.listainvitados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListaInvitados {

    public static void main(String[] args) {

        boolean encontrado = false;
        int i = 0;
        String buscar = "";

        ArrayList<String> listaInvitados
                = new ArrayList<>(Arrays.asList("Pepe", "Alex", "Carlos", "Eva", "Marta", "Alex", "Edu", "Monica"));

        System.out.println(listaInvitados);
        Scanner teclado = new Scanner(System.in);
        

        // Solo dice el resultado al final //
        while (!buscar.equals("S") && !buscar.equals("s")) { //ojo &&
            
            System.out.println("Qué quieres buscar? (para salir, pulsa 'S')");
            buscar = teclado.nextLine();

            for (i = 0; i < listaInvitados.size(); i++) {

                if (buscar.equals(listaInvitados.get(i))) {
                    System.out.println("Encontrado!!!");
                    System.out.println("");
                    encontrado = true;
                    i = listaInvitados.size(); //i mayor que condición

                } else {
                    encontrado = false;
                }
            }
            
            if((!encontrado) && (i == listaInvitados.size())){
                System.out.println("No está, sigue probando!");
                System.out.println("");
            }
            
        }




        
        //Sigue preguntando hasta que encuentra uno
        
//        while (!encontrado) {
//            System.out.println("Qué quieres buscar?");
//            buscar = teclado.nextLine();
//            
//            for (i = 0; i < listaInvitados.size(); i++) {
//
//            if (buscar.equals(listaInvitados.get(i))) {
//                System.out.println("encontrado en la posición " + i + ", felicidades!");
//                encontrado = true;
//                
//            } else {
//                System.out.println("sigue probando!");
//            }
//            
//            }
//        }
        
        
        
        //Pasa por todos los elementos e imprime resultado
        //Deja de preguntar si encontrado = true
        
//        while (!encontrado) {
//            System.out.println("Qué quieres buscar?");
//            buscar = teclado.nextLine();
//            
//            for (i = 0; i < listaInvitados.size(); i++) {
//
//            if (buscar.equals(listaInvitados.get(i) )) {
//                System.out.println("encontrado en la posición " + i + ", felicidades!");
//                encontrado = true;
//                
//            } else {
//                System.out.println("sigue probando!");
//            }
//            
//            }
//        }
        
        System.out.println("ya he salido del bucle");
        System.out.println("Buscar= " + buscar);
        System.out.println("Encontrado= " + encontrado);
    }
}

