package calculos;

import modelos.CodigosDivisas;

public class ExistenciaDeDivisa {

    public boolean existeDivisa(String codigoDivisa) {
        for (CodigosDivisas codigo : CodigosDivisas.values()) {
            if (codigo.name().equalsIgnoreCase(codigoDivisa)) {
                return true;
            }
        }
        return false;
    }

    public  String determinarCualNoExiste(String monedaOrigen, String monedaDestino){
        if(!existeDivisa(monedaOrigen) && !existeDivisa(monedaDestino)){
            return monedaOrigen + " y " + monedaDestino + " no corresponden a ninguna divisa disponible";
        }
        if(!existeDivisa(monedaDestino)){
            return monedaDestino + " no corresponde a ninguna divisa disponible";
        }
        return monedaOrigen + " no corresponde a ninguna divisa disponible";
    }
}