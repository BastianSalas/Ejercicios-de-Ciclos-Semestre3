import java.util.Scanner;

public class menu {
    static Scanner scanner = new Scanner(System.in);

    public static void menuPrincipal() {
        int goku;

        do {
            System.out.println("·········································································");
            System.out.println("                                  Menú                                   ");
            System.out.println("                                                                         ");
            System.out.println("Ciclo 1.................................................................1");
            System.out.println("Ciclo 2.................................................................2");
            System.out.println("Ciclo 3.................................................................3");
            System.out.println("Ciclo 4.................................................................4");
            System.out.println("Ciclo 5.................................................................5");
            System.out.println("Ciclo 6.................................................................6");
            System.out.println("Ciclo 7.................................................................7");
            System.out.println("Ciclo 8.................................................................8");
            System.out.println("Ciclo 9.................................................................9");
            System.out.println("Ciclo 10...............................................................10");
            System.out.println("Ciclo 11...............................................................11");
            System.out.println("Ciclo 12...............................................................12");
            System.out.println("Ciclo 13...............................................................13");
            System.out.println("Ciclo 14...............................................................14");
            System.out.println("Ciclo 15...............................................................15");
            System.out.println("Ciclo 16...............................................................16");
            System.out.println("Ciclo 17...............................................................17");
            System.out.println("Ciclo 18...............................................................18");
            System.out.println("Ciclo 19...............................................................19");
            System.out.println("Ciclo 20...............................................................20");
            System.out.println("Salir .................................................................21");
            System.out.println("                                                                         ");
            System.out.println("·········································································");
            System.out.print("Elija opción: ");

            goku = scanner.nextInt();

            switch (goku) {
                case 1:
                    ciclos.ciclo1();
                    break;

                case 2:
                    ciclos.ciclo2();
                    break;

                case 3:
                    ciclos.ciclo3();
                    break;
                
                case 4:
                    //ciclos.ciclo4();
                    break;

                case 5:
                    //funcion();
                    break;
                    
                case 6:
                    //funcion();
                    break;

                case 7:
                    ciclos.mostrarciclo7();
                    break;
                    
                case 8:
                    //funcion();
                    break;
                    
                case 9:
                    //funcion();
                    break;

                case 10:
                    //funcion();
                    break;

                case 11:
                    //funcion();
                    break;

                case 12:
                    //funcion();
                    break;

                case 13:
                    //funcion();
                    break;

                case 14:
                    //funcion();
                    break;

                case 15:
                    //funcion();
                    break;

                case 16:
                    //funcion();
                    break;

                case 17:
                    //funcion();
                    break;

                case 18:
                    //funcion();
                break;

                case 19:
                    //funcion();
                    break;

                case 20:
                    //funcion();
                    break;

                case 21:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida (1-5).");
            }
        } while (goku != 21);

        scanner.close();
    }
}
