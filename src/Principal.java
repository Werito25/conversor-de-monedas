//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorMonedas conversor = new ConversorMonedas();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Bienvenido al Conversor de Monedas");
            System.out.println("1. Convertir Dólares a Pesos Argentinos");
            System.out.println("2. Convertir Pesos Argentinos a Dólares");
            System.out.println("3. Convertir Reales a Dólares");
            System.out.println("4. Convertir Dólares a Reales");
            System.out.println("5. Convertir Euros a Pesos Argentinos");
            System.out.println("6. Convertir Pesos Uruguayos a Dólares");
            System.out.println("7. Convertir Pesos Mexicanos a Dólares");
            System.out.println("8. Convertir Pesos Colombianos a Dólares");
            System.out.println("9. Salir");
            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor en Dólares:");
                    double dolares = scanner.nextDouble();
                    double tasaDolarAPesos = conversor.obtenerTasa("USD", "ARS");
                    double pesos = conversor.convertir("USD", "ARS", dolares);
                    System.out.println("Has convertido " + dolares + " USD a Pesos Argentinos (ARS) usando una tasa de cambio de " + tasaDolarAPesos + ". El monto equivalente es: " + pesos + " ARS.");
                    break;

                case 2:
                    System.out.println("Ingrese el valor en Pesos Argentinos:");
                    double pesosArg = scanner.nextDouble();
                    double tasaPesosADolar = conversor.obtenerTasa("ARS", "USD");
                    double dolaresConvertidos = conversor.convertir("ARS", "USD", pesosArg);
                    System.out.println("Has convertido " + pesosArg + " ARS a Dólares (USD) usando una tasa de cambio de " + tasaPesosADolar + ". El monto equivalente es: " + dolaresConvertidos + " USD.");
                    break;

                // Otros casos del 3 al 4 (mantienen su estructura actual)

                case 5:
                    System.out.println("Ingrese el valor en Euros:");
                    double euros = scanner.nextDouble();
                    double tasaEuroAPesos = conversor.obtenerTasa("EUR", "ARS");
                    double pesosArgDesdeEuros = conversor.convertir("EUR", "ARS", euros);
                    System.out.println("Has convertido " + euros + " EUR a Pesos Argentinos (ARS) usando una tasa de cambio de " + tasaEuroAPesos + ". El monto equivalente es: " + pesosArgDesdeEuros + " ARS.");
                    break;

                case 6:
                    System.out.println("Ingrese el valor en Pesos Uruguayos:");
                    double pesosUru = scanner.nextDouble();
                    double tasaUruADolar = conversor.obtenerTasa("UYU", "USD");
                    double dolaresDesdePesosUru = conversor.convertir("UYU", "USD", pesosUru);
                    System.out.println("Has convertido " + pesosUru + " UYU a Dólares (USD) usando una tasa de cambio de " + tasaUruADolar + ". El monto equivalente es: " + dolaresDesdePesosUru + " USD.");
                    break;

                case 7:
                    System.out.println("Ingrese el valor en Pesos Mexicanos:");
                    double pesosMex = scanner.nextDouble();
                    double tasaMexADolar = conversor.obtenerTasa("MXN", "USD");
                    double dolaresDesdePesosMex = conversor.convertir("MXN", "USD", pesosMex);
                    System.out.println("Has convertido " + pesosMex + " MXN a Dólares (USD) usando una tasa de cambio de " + tasaMexADolar + ". El monto equivalente es: " + dolaresDesdePesosMex + " USD.");
                    break;

                case 8:
                    System.out.println("Ingrese el valor en Pesos Colombianos:");
                    double pesosCol = scanner.nextDouble();
                    double tasaColADolar = conversor.obtenerTasa("COP", "USD");
                    double dolaresDesdePesosCol = conversor.convertir("COP", "USD", pesosCol);
                    System.out.println("Has convertido " + pesosCol + " COP a Dólares (USD) usando una tasa de cambio de " + tasaColADolar + ". El monto equivalente es: " + dolaresDesdePesosCol + " USD.");
                    break;

                case 9:
                    continuar = false;
                    System.out.println("Saliendo del programa... ¡Gracias por utilizar el conversor!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente seleccionando una opción del 1 al 9.");
            }



        }
        scanner.close();
    }
}
