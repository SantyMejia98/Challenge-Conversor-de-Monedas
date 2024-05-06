package calculos;

import modelos.CodigosDivisas;
import modelos.Conversion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoDeSwitch {

    public void manejoCasos(String divisaBase, String divisaObjetivo){
        Scanner teclado = new Scanner(System.in);
        ConsultaDeDivisa consultaDivisa = new ConsultaDeDivisa();
        ExistenciaDeDivisa existe = new ExistenciaDeDivisa();
        try{
            System.out.println("Ingrese la cantidad de " + divisaBase.toUpperCase() +
                    " que desea convertir a " + divisaObjetivo.toUpperCase() + ": ");
            double cantidad = teclado.nextDouble();
            Conversion conversion = consultaDivisa.busquedaDivisa(divisaBase, divisaObjetivo, cantidad);
            MensajeSalida mensajeSalida = new MensajeSalida();
            mensajeSalida.mostrarResultados(conversion, cantidad);
        }catch(NullPointerException e){
            System.out.println(existe.determinarCualNoExiste(divisaBase, divisaObjetivo));
        }catch(InputMismatchException e){
            System.out.println("Sólo se admiten valores numéricos");
        }
    }
}
