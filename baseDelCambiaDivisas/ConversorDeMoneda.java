package aluracursos.com.challenge.baseDelCambiaDivisas;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorDeMoneda {

    public static void obtenerTasaDeCambio(String divisaOrigen, String divisaDestino, double cantidad) {
        try {
            HttpClient client = HttpClient.newHttpClient();

            String apiKey = "9d2753feb5d430bbe3a2cd69";
            String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/"
                    + divisaOrigen + "/" + divisaDestino + "/" + cantidad;

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Accept", "application/json")
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            procesarRespuesta(response.body(), divisaOrigen, divisaDestino, cantidad);

        } catch (Exception e) {
            System.out.println("Error al intentar obtener la tasa de cambio: " + e.getMessage());
        }
    }

    private static void procesarRespuesta(String responseBody, String divisaOrigen, String divisaDestino, double cantidad) {
        try {

            Gson gson = new Gson();
            JsonObject json = gson.fromJson(responseBody, JsonObject.class);

            if (json.get("result").getAsString().equals("success")) {
                double tasaDeCambio = json.get("conversion_rate").getAsDouble();
                double montoConvertido = tasaDeCambio * cantidad;
                System.out.println(cantidad + " " + divisaOrigen + " son equivalentes a " + montoConvertido + " " + divisaDestino);
            } else {
                System.out.println("Error en la respuesta de la API: " + json.get("error-type").getAsString());
            }

        } catch (Exception e) {
            System.out.println("Error al procesar la respuesta: " + e.getMessage());
        }
    }
    }
