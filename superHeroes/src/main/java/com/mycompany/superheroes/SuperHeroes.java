package com.mycompany.superheroes;

import java.util.Scanner;

public class SuperHeroes {

    public static void main(String[] args) {  
        Heroe h1 = new Heroe ("Super Lopez", "España", "volar mal", 0);
        Heroe h2 = new Heroe ("Capitan America", "USA", "darte un escudazo", 0);
        Heroe h3 = new Heroe ("los pitufos", "Belgica", "ser pequeñitos", 0);
        Heroe h4 = new Heroe ("Batman", "USA", "manejar money", 0);
        Heroe h5 = new Heroe ("Sherlock Holmes", "Inglaterra", "ser muy listo", 0);
        
        Heroe elegido1 = new Heroe ("", "", "", 0);
        Heroe elegido2 = new Heroe ("", "", "", 0);
        
        int randomPoints1 = (int) Math.ceil(Math.random()*100);
        int randomPoints2 = (int) Math.ceil(Math.random()*100);
        int pointsDifference = Math.abs(randomPoints1-randomPoints2);
        
        int heroe1Seleccionado = 0;
        int heroe2Seleccionado = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Selecciona primer superhéroe (del 1 al 5)");
        heroe1Seleccionado = sc.nextInt();
        
        System.out.println("Selecciona segundo superhéroe (del 1 al 5)");
        heroe2Seleccionado = sc.nextInt();
        
        //seleccion 1
        if(heroe1Seleccionado == 1){
            h1.points = randomPoints1;
            //System.out.println(h1);
            elegido1 = h1;
            System.out.println("Elegido 1: " + elegido1);
        } else if(heroe1Seleccionado == 2){
            h2.points = randomPoints1;
            //System.out.println(h2);
            elegido1 = h2;
            System.out.println("Elegido 1: " +elegido1);
        }else if(heroe1Seleccionado == 3){
            h3.points = randomPoints1;
            //System.out.println(h3);
            elegido1 = h3;
            System.out.println("Elegido 1: " +elegido1);
        }else if(heroe1Seleccionado == 4){
            h4.points = randomPoints1;
            //System.out.println(h4);
            elegido1 = h4;
            System.out.println("Elegido 1: " +elegido1);
        }else if(heroe1Seleccionado == 5){
            h5.points = randomPoints1;
            //System.out.println(h5);
            elegido1 = h5;
            System.out.println("Elegido 1: " +elegido1);
        } else System.out.println("Debes elegir un numero del 1 al 5");
         
        //seleccion 2
        if(heroe2Seleccionado == 1){
            h1.points = randomPoints2;
            //System.out.println(h1);
            elegido2 = h1;
            System.out.println("Elegido 2: " + elegido2);
        } else if(heroe2Seleccionado == 2){
            h2.points = randomPoints2;
            //System.out.println(h2);
            elegido2 = h2;
            System.out.println("Elegido 2: " + elegido2);
        }else if(heroe2Seleccionado == 3){
            h3.points = randomPoints2;
            //System.out.println(h3);
            elegido2 = h3;
            System.out.println("Elegido 2: " + elegido2);
        }else if(heroe2Seleccionado == 4){
            h4.points = randomPoints2;
            //System.out.println(h4);
            elegido2 = h4;
            System.out.println("Elegido 2: " + elegido2);
        }else if(heroe2Seleccionado == 5){
            h5.points = randomPoints2;
            //System.out.println(h5);
            elegido2 = h5;
            System.out.println("Elegido 2: " + elegido2);
        } else System.out.println("Debes elegir un numero del 1 al 5");
        

        //Comparacion quien gana
        if(elegido1.points>elegido2.points){
            System.out.println(elegido1 + " gana a " + elegido2.name + " por " + pointsDifference + " puntos");
        } else System.out.println(elegido2 + " gana a " + elegido1.name + " por " + pointsDifference + " puntos");
        
    }
}
