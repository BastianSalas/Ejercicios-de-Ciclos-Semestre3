import java.util.Scanner;

public class ciclos {
    
///////////////////////////////////////////////////////////////////////////////////////

    public static void ciclo1() {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            System.out.print("Ingrese una medida en centímetros: ");
            int medidaEnCm = scanner.nextInt();

            int kilometros = medidaEnCm / 100000;
            int metros = (medidaEnCm % 100000) / 100;
            int centimetros = medidaEnCm % 100;

            System.out.println(medidaEnCm + " centímetros son " + kilometros + " kilómetros, " + metros + " metros y " + centimetros + " centímetros.");

            System.out.print("¿Desea calcular nuevamente para otras medidas? (si/no): ");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("¡Gracias por utilizar el programa!");
        scanner.close();
    }

///////////////////////////////////////////////////////////////////////////////////////

    public static void ciclo2() {
        int num = 1;
        
        while (num <= 10){
            System.out.println(num);
            num++;
        }
    }

///////////////////////////////////////////////////////////////////////////////////////

    public static void ciclo3() {
        int num = 1;
        int suma = 0;
        while (num <= 10){
            int resultado = suma += num;
            num++;
            System.out.println(resultado);
        }
    }

///////////////////////////////////////////////////////////////////////////////////////

    public static void ciclo7(int numero, int suma, int limite) {
        
        if (numero <= limite) {
            if (numero % 2 != 0) {
                suma += numero;
            }
            ciclo7(numero + 1, suma, limite);
        } else {
            System.out.println(suma);
        }
    }

    public static void mostrarciclo7() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero para sumar sus impares: ");
        int a = scanner.nextInt();
 
        ciclo7(1, 0, a);
    }

///////////////////////////////////////////////////////////////////////////////////////
}
