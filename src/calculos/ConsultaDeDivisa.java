package calculos;

import com.google.gson.Gson;
import modelos.Conversion;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDeDivisa {

    public Conversion busquedaDivisa(String divisaBase, String divisaObjetivo, double cantidad){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/be6082e5a825098b5f6aed35/pair/" +
                divisaBase + "/" + divisaObjetivo + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion).build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (Exception e) {
            return null;
        }
    }
}