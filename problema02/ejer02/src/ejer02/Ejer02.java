/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String name_prop;
        String tipov;
        int tipon;
        double valor;
        double peaje;

        System.out.println("Ingrese el nombre del propietario:");
        name_prop = entrada.nextLine();
        System.out.println("Ingresar el dìgito segùn su tipo de vehiculo"
                + "Vehículo liviano particular ingrese:1\n"
                + "Vehículo grande particular ingrese:2\n"
                + "Taxi ingrese:3\n"
                + "Bus urbano:4");
        tipon = entrada.nextInt();
        System.out.println("Ingrese el valor del vehiculo");
        valor = entrada.nextDouble();

        peaje = 0;
        tipov = "No existe";

        switch (tipon) {

            case 1:
                peaje = ((valor * 0.01) / 100) + 2;
                tipov = "Vehículo liviano particular";
                break;

            case 2:
                peaje = ((valor * 0.02) / 100) + 2.5;
                tipov = "Vehículo grande particular";
                break;

            case 3:
                peaje = ((valor * 0.04) / 100) + 1.5;
                tipov = "Taxi";
                break;

            case 4:
                peaje = ((valor * 0.05) / 100) + 2.2;
                tipov = "Bus Urbano";
                break;

            default:
                System.out.println("Respuesta fallida");
                break;
        }

        System.out.printf("Peaje: Buena vía\n "
                + "Propietario :%s\n"
                + "Tipo :%s\n"
                + "Valor: %.2f\n"
                + "Peaje:%.2f ",
                 name_prop,
                 tipov,
                 valor,
                peaje);

    }

}
