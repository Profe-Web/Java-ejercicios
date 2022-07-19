package com.mycompany.evaluaciontiendadiscos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lito2
 */
public class EvaluacionTiendaDiscos {

    public static void main(String[] args) {

        ArrayList<Discos> titulos = new ArrayList<>();

        System.out.println("Hello World!");
        Discos buitres = new Discos("Buitres", "Buitres después de la una", 1990, " \n'La bruja', \n'Deliciosas criaturas perfumadas'");
        System.out.println(buitres);
        titulos.add(buitres);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        Discos onceTiros = new Discos("Once Tiros", "Fango", 2018, " \n'Hijos del fuego', \n'En este juego'");
        System.out.println(onceTiros);
        titulos.add(onceTiros);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        Discos laVela = new Discos("La vela puerca", "Erase", 2018, " \n'Chamán', \n'El soldado de plomo'");
        System.out.println(laVela);
        titulos.add(laVela);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        Discos ntvg = new Discos("NTVG", "Luz", 2021, " \n'La rama', \n'Mi ausencia'");
        System.out.println(ntvg);
        titulos.add(ntvg);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        Discos buitres2 = new Discos("Buitres", "Mientras", 1990, " \n'Soy del montón', \n'Bajo la luna'");
        System.out.println(buitres2);
        titulos.add(buitres2);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        Discos hereford = new Discos("Hereford", "Ruido", 1990, " \n'Tolerar', \n'Ruido'");
        System.out.println(hereford);
        titulos.add(hereford);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println(titulos + "\n" + "\n");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del disco que busca");

        String usuario = teclado.nextLine();
        
        boolean encontrado = false;
        boolean encontrado2 = false;
        int indice = 0;

//        for (Discos x : titulos) {
//            System.out.println(x.getTitulo());
//            encontrado = x.getTitulo().contains(usuario);
//            System.out.println("encontrado= " + encontrado);
//        }

        for(int i=0; i<titulos.size(); i++){
            //System.out.println("Bucle for normal: " + titulos.get(i).getTitulo());
            
            //compara cada titulo
            encontrado = titulos.get(i).getTitulo().contains(usuario);
            
            //lo guarda solo si lo encuentra en variable encontrado2
                if(encontrado){
                    encontrado2 = true;
                    indice = i;
                }
        }
        
        
        //boolean encontrado = titulos.contains(usuario);
        if (encontrado2) {
            System.out.println("disco " + usuario + " encontrado!!!");
            System.out.println(titulos.get(indice));
        } else {
            System.out.println("El disco que busca no está en nuestro catálogo");
        }
    }

    public static class Discos {

        private String artista = "";
        private String titulo = "";
        private int year = 0;
        private String canciones = "";

        public Discos(String artista, String titulo, int year, String canciones) {
            this.artista = artista;
            this.titulo = titulo;
            this.year = year;
            this.canciones = canciones;

        }

        public Discos() {

        }

        public String getTitulo() {
            return titulo;
        }

        @Override
        public String toString() {
            return "Artista: " + artista + "\nTitulo del disco = " + titulo + "\nAño: " + year + "\ncanciones = " + canciones;
        }

    }

}
