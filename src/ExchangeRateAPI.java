import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Scanner;
import com.google.gson.Gson;

public class ExchangeRateAPI {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/702ad3efd2a40d8dc6eba075/latest/";

    // Método para obtener las tasas de cambio basadas en la moneda
    public static Map<String, Double> getConversionRates(String baseCurrency) {
        try {
            // Conectar a la URL completa con la moneda base
            URL url = new URL(API_URL + baseCurrency);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("HTTP Response Code: " + responseCode);
            }

            // Leer la respuesta
            Scanner scanner = new Scanner(url.openStream());
            StringBuilder jsonResponse = new StringBuilder();
            while (scanner.hasNext()) {
                jsonResponse.append(scanner.nextLine());
            }
            scanner.close();

            // Parsear JSON a un mapa de tasas de conversión
            Gson gson = new Gson();
            ApiResponse response = gson.fromJson(jsonResponse.toString(), ApiResponse.class);
            return response.getConversionRates();
        } catch (IOException e) {
            System.out.println("Error al conectar con la API: " + e.getMessage());
            return null;
        }
    }

    // Clase interna para deserializar JSON con Gson
    private static class ApiResponse {
        private Map<String, Double> conversion_rates;

        public Map<String, Double> getConversionRates() {
            return conversion_rates;
        }
    }
}
