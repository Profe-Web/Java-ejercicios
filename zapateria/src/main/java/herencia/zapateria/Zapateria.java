package herencia.zapateria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author Albertazo
 */
public class Zapateria {

    public static void main(String[] args) {

        ArrayList<Elegante> listaElegantes = new ArrayList<>(Arrays.asList(new Elegante("Fluchos", "confort", "cuero", 42, 99.99), new Elegante("Pikolen", "menorca", "esparta", 43, 59.70)));
        
        ArrayList<Casual> listaCasuales = new ArrayList<>(Arrays.asList(new Casual("Padevi", "fresh", "polyester", 40, 79.99),new Casual("Teckin", "noir", "polyester", 43, 49.70)));
        
        ArrayList<Deporte> listaDeportes = new ArrayList<>(Arrays.asList(new Deporte("Adidas", "go", "gore-tex", 39, 99.99),new Deporte("Nike", "jump", "acrilico", 37, 89.50)));

        //(String marca, String modelo, String material, double talla, double precio)
        Elegante e1 = new Elegante("Fluchos", "confort", "cuero", 42, 99.99);
        Elegante e2 = new Elegante("Pikolen", "menorca", "esparta", 43, 59.70);

        Casual c1 = new Casual("Padevi", "fresh", "polyester", 40, 79.99);
        Casual c2 = new Casual("Teckin", "noir", "polyester", 43, 49.70);

        Deporte d1 = new Deporte("Adidas", "go", "gore-tex", 39, 99.99);
        Deporte d2 = new Deporte("Nike", "jump", "acrilico", 37, 89.50);

        ArrayList<ArrayList> todos = new ArrayList(Arrays.asList(listaElegantes,listaCasuales, listaDeportes));
        System.out.println("prueba array de arrays: "+ todos);
        
        Scanner teclado = new Scanner(System.in);
        String opcion;
        boolean salida = false;
        double total = 0;
        while (!salida) {
            System.out.println("Gasto total realizado: " + total);
            System.out.println("");
            System.out.println("¿Cual deseas comprar? (escribe el modelo)");
            System.out.println("(para salir, escribe SALIR)");
            System.out.println(e1);
            System.out.println(e2);
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(d1);
            System.out.println(d2);
            opcion = teclado.nextLine();
            System.out.println("");

            switch (opcion) {
                case "SALIR":
                case "salir":
                    salida = true;
                    break;

                case "confort":
                    System.out.println("Has escogido" + e1);
                    total = total + e1.getPrecio();
                    break;

                case "menorca":
                    System.out.println("Has escogido" + e2);
                    total = total + e2.getPrecio();
                    break;

                case "fresh":
                    System.out.println("Has escogido" + c1);
                    total = total + c1.getPrecio();
                    break;

                case "noir":
                    System.out.println("Has escogido" + c2);
                    total = total + c2.getPrecio();
                    break;

                case "go":
                    System.out.println("Has escogido" + d1);
                    total = total + d1.getPrecio();
                    break;

                case "jump":
                    System.out.println("Has escogido" + d2);
                    total = total + d2.getPrecio();
                    break;

                default:
                    System.out.println("Este modelo no existe!");
            }

        }
        
        System.out.println("");
        System.out.println("Bye-bye, hasta la próximaaa!!");
    }

}
