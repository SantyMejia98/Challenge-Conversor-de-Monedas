package principal;

import calculos.ManejoDeSwitch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        ManejoDeSwitch manejoDeSwitch = new ManejoDeSwitch();
        String divisaBase, divisaObjetivo;

        String menu = """
                **************************************************************
                Bienvenido al sistema de conversor de divisas
                Sugerencias de conversiones
                
                1) Dólar a Peso Colombiano
                2) Peso Colombiano a Dólar
                3) Dólar a Peso Mexicano
                4) Peso Mexicano a Dólar
                5) Dólar a Euro
                6) Euro a Dólar
                7) Dólar a Peso Argentino
                8) Peso Argentino a Dólar
                9) Buscar por código de divisa
                10) Salir
                
                Ingrese la opción del cambio de divisa deseada: 
                **************************************************************
                """;

        while (opcion != 10) {
            System.out.println(menu);

            try {
                opcion = teclado.nextInt();
            } catch (InputMismatchException e) {
                teclado.nextLine();
                System.out.println("Por favor, ingresa un número entero válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    manejoDeSwitch.manejoCasos("USD", "COP");
                    break;
                case 2:
                    manejoDeSwitch.manejoCasos("COP", "USD");
                    break;
                case 3:
                    manejoDeSwitch.manejoCasos("USD", "MXN");
                    break;
                case 4:
                    manejoDeSwitch.manejoCasos("MXN", "USD");
                    break;
                case 5:
                    manejoDeSwitch.manejoCasos("USD", "EUR");
                    break;
                case 6:
                    manejoDeSwitch.manejoCasos("EUR", "USD");
                    break;
                case 7:
                    manejoDeSwitch.manejoCasos("USD", "ARS");
                    break;
                case 8:
                    manejoDeSwitch.manejoCasos("ARS", "USD");
                    break;
                case 9:
                    teclado.nextLine();
                    System.out.println("Ingrese el código de la divisa que desea convertir: ");
                    divisaBase = teclado.nextLine();
                    System.out.println("Ingrese el código de la divisa a la cual desea convertir: ");
                    divisaObjetivo = teclado.nextLine();
                    manejoDeSwitch.manejoCasos(divisaBase, divisaObjetivo);
                    break;
                case 10:
                    System.out.println("Gracias por utilizar nuestro servicio de conversión de divisa.");
                    break;
                default:
                    System.out.println("Ingresa una opción válida.");
                    break;
            }
        }
    }
}
