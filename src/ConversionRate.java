public record ConversionRate(String fromCurrency, String toCurrency, double rate) {
    // Constructor validado opcional, si deseas comprobar la validez del rate.
    public ConversionRate {
        if (rate <= 0) {
            throw new IllegalArgumentException("La tasa de conversión debe ser mayor que 0");
        }
    }
}

