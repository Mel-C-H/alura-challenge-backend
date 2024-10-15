package aluracursos.com.challenge.baseDelCambiaDivisas;

import java.util.Scanner;

public class Principal extends ConversorDeMoneda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bienvenido al conversor de moneda.");
            System.out.println("Seleccione las divisas para convertir:");
            System.out.println("1. Dólar (USD)");
            System.out.println("2. Euro (EUR)");
            System.out.println("3. Peso Colombiano (COP)");
            System.out.println("4. Libra Esterlina (GBP)");
            System.out.println("5. Salir");

            System.out.print("Seleccione el número de la divisa origen (o 5 para salir): ");
            int opcionOrigen = scanner.nextInt();

            if (opcionOrigen == 5) {
                continuar = false;
                break;
            }
            String divisaOrigen = seleccionarDivisa(opcionOrigen);

            System.out.print("Seleccione el número de la divisa destino: ");
            int opcionDestino = scanner.nextInt();
            String divisaDestino = seleccionarDivisa(opcionDestino);

            System.out.print("Ingrese la cantidad que desea convertir: ");
            double cantidad = scanner.nextDouble();

            obtenerTasaDeCambio(divisaOrigen, divisaDestino, cantidad);
            System.out.println();
            System.out.print("¿Desea realizar otra conversión? (s/n): ");
            String respuesta = scanner.next();
            continuar = respuesta.equalsIgnoreCase("s");
        }
        scanner.close();
        System.out.println("Gracias por utilizar el conversor de monedas.");
    }
    public static String seleccionarDivisa(int opcion) {
        return switch (opcion) {
            case 1 -> "USD";
            case 2 -> "EUR";
            case 3 -> "COP";
            case 4 -> "GBP";
            default -> {
                System.out.println("Opción no válida, por defecto se seleccionará USD.");
                yield "USD";
            }
        };
    }
}