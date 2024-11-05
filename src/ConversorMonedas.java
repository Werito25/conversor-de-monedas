import java.util.Map;

public class ConversorMonedas {

    // Método de conversión que obtiene la tasa de cambio desde la API
    public double convertir(String from, String to, double amount) {
        Map<String, Double> rates = ExchangeRateAPI.getConversionRates(from); // Llama a la API para obtener tasas

        if (rates != null && rates.containsKey(to)) {
            double rate = rates.get(to); // Extrae la tasa específica para la conversión
            return amount * rate;
        } else {
            throw new IllegalArgumentException("Conversión no soportada o error en la API: " + from + " a " + to);
        }
    }

    // Método auxiliar para obtener la tasa de conversión entre dos monedas
    public double obtenerTasa(String from, String to) {
        Map<String, Double> rates = ExchangeRateAPI.getConversionRates(from);
        if (rates != null && rates.containsKey(to)) {
            return rates.get(to);
        } else {
            throw new IllegalArgumentException("Conversión no soportada o error en la API: " + from + " a " + to);
        }
    }
}
