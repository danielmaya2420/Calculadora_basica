import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("=========================================================================");
            System.out.println("**** Aplicación Calculadora ****");
            // Mostramos el menú
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                // Revisar que esté dentro de las opciones mencionadas
                if (operacion >= 1 && operacion <= 4) {
                    // Ejecutamos la operación deseada
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) { // salir
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Opción erronea: " + operacion);
                }
                // Imprimimos un salto antes de repetir el ciclo
                System.out.println();
            } // Fin try
            catch (Exception e){
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        } // fin while
    } // fin main
    private static void mostrarMenu(){
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    """);
        System.out.println("=========================================================================");
        System.out.println("Operación a realizar?: ");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.print("Proporciona valor operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona valor operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        Double resultado;
        switch (operacion) {
            case 1 -> { // suma
                resultado = operando1 + operando2;
                System.out.println("Resultado suma: " + resultado);
            }
            case 2 -> { // resta
                resultado = operando1 - operando2;
                System.out.println("Resultado resta: " + resultado);
            }
            case 3 -> { // multiplicación
                resultado = operando1 * operando2;
                System.out.println("Resultado multiplicación: " + resultado);
            }
            case 4 -> { // división
                resultado = operando1 / operando2;
                System.out.println("Resultado division: " + resultado);
            }
            default -> System.out.println("Opción erronea:" + operacion);
        }
    }
} // fin clase
