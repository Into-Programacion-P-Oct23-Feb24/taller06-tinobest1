/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class EJER03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String name_empleado;
        int tipo_empleado;
        double sueldo;
        double incremento_sueldo;
        double sueldototal;

        System.out.println("Ingrese el nombre de empleado:");
        name_empleado = entrada.nextLine();
        System.out.println("Ingresar segun el tipo de empleado"
                + "Empleado tipo 1 ingrese:1\n"
                + "Empleado tipo 2 ingrese:2\n"
                + "Empleado tipo 3 ingrese:3\n"
                + "Empleado tipo 4 ingrese:4\n"
                + "Empleado tipo 4 ingrese:5");
        tipo_empleado = entrada.nextInt();
        System.out.println("Ingrese el sueldo del empleado");
        sueldo = entrada.nextDouble();
        
                incremento_sueldo = 0;
                sueldototal = sueldo;

        switch (tipo_empleado) {

            case 1:
                incremento_sueldo = (sueldo * 5) / 100;
                sueldototal = sueldo + incremento_sueldo;
                break;

            case 2:
                incremento_sueldo = (sueldo * 7) / 100;
                sueldototal = sueldo + incremento_sueldo;
                break;

            case 3:
                incremento_sueldo = (sueldo * 9) / 100;
                sueldototal = sueldo + incremento_sueldo;
                break;

            case 4:
                incremento_sueldo = (sueldo * 12) / 100;
                sueldototal = sueldo + incremento_sueldo;
                break;

            case 5:
                incremento_sueldo = (sueldo * 15) / 100;
                sueldototal = sueldo + incremento_sueldo;
                break;

            default:
                System.out.println("Respuesta fallida");
                break;
        }

        System.out.printf("nombre de empleado: %s\n"
                + "Incremento del sueldo: %.2f\n"
                + "Sueldo Total:%.2f\n",
                name_empleado,
                incremento_sueldo,
                sueldototal);

    }

}
