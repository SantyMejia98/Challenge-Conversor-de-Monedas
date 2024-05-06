package calculos;

import modelos.CodigosDivisas;
import modelos.Conversion;

import java.util.Scanner;

public class MensajeSalida {

    public void mostrarResultados(Conversion conversion, double cantidad){
        Scanner teclado = new Scanner(System.in);
        String nombreBase = CodigosDivisas.obtenerPorCodigo(conversion.base_code()).getNombre();
        String nombreObjetivo = CodigosDivisas.obtenerPorCodigo(conversion.target_code()).getNombre();

        System.out.println("**************************************************************");
        System.out.println(cantidad + " " + nombreBase + " [" + conversion.base_code() +
                "] equivale a " + conversion.conversion_result() + " " + nombreObjetivo +
                " [" + conversion.target_code() + "]");
        System.out.println("**************************************************************");
        System.out.println("Presiona Enter para continuar...");
        teclado.nextLine();
    }
}