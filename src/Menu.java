import java.util.Scanner;
import Universidad.Universidad;
import Universidad.RangoHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.LocalTime;


public class Menu {
    public static void despliegaMenu(){
        Scanner sc = new Scanner(System.in);
        int res;
        Universidad caece = new Universidad();
        do {
            System.out.println("Universidad CAECE - Sede Mar del Plata");
            System.out.println("Bienvenido, que desea hacer?");
            System.out.println("* Consultar los datos de las aulas segun piso y codigo - 1");
            System.out.println("* Registrar la reserva de un Aula - 2");
            System.out.println("* Cancelar reserva - 3");
            System.out.println("* Generar reporte - 4");
            System.out.println("* Salir - 5");
            System.out.println("Ingrese una opcion: ");
            res = sc.nextInt();
            if (res != 5) {
                switch (res) {
                    case 1:
                        System.out.println("Ingrese el numero de piso:\n");
                        int piso = sc.nextInt();
                        System.out.println("Ingrese el codigo de la asignatura/Curso de extension/Evento:\n");
                        String cod = sc.next();
                        caece.filtraxPiso(piso, cod);
                        break;
                    case 2:
                        do{
                            System.out.println("Registrar asignatura - 1:\n");
                            System.out.println("Registrar Curso de extension - 2\n");
                            System.out.println("Registrar Evento - 3\n");
                            System.out.println("Ingrese una opcion: ");
                            res = sc.nextInt();
                            System.out.println("Ingrese el codigo de la asignatura/Curso de extension/Evento: \n");
                            String code = sc.next();
                            switch (res) {
                                case 1:
                                    caece.creaReserva(code);
                                    break;
                                    case 2:
                                        //CURSO DE EXTENSION
                                        //Ingresamos la fecha
                                        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                                        LocalDate fecha = null;
                                        boolean valid = false;
                                        while (!valid) {
                                            System.out.print("Introduce una fecha (yyyy-MM-dd): ");
                                            String entrada = sc.nextLine();
                                            try {
                                                fecha = LocalDate.parse(entrada, formateador);
                                                valid = true;
                                            } catch (DateTimeParseException e) {
                                                System.out.println("Formato de fecha inválido. Por favor, inténtalo de nuevo.");
                                            }
                                        }
                                        //Ingresamos la hora
                                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

                                        LocalTime inicio = null;
                                        LocalTime fin = null;
                                        boolean tiempoValido1 = false;
                                        boolean tiempoValido2 = false;
                                        String entrada;

                                        while (!tiempoValido1) {
                                            System.out.print("Introduce la primera hora (HH:mm): ");
                                            entrada = sc.nextLine();

                                            try {
                                                inicio = LocalTime.parse(entrada, formatter);
                                                tiempoValido1 = true;
                                            } catch (DateTimeParseException e) {
                                                System.out.println("Formato de hora inválido. Por favor, inténtalo de nuevo.");
                                            }
                                        }

                                        while (!tiempoValido2) {
                                            System.out.print("Introduce la segunda hora (HH:mm): ");
                                            entrada = sc.nextLine();

                                            try {
                                                fin = LocalTime.parse(entrada, formatter);
                                                tiempoValido2 = true;
                                            } catch (DateTimeParseException e) {
                                                System.out.println("Formato de hora inválido. Por favor, inténtalo de nuevo.");
                                            }
                                        }
                                        RangoHora rh = new RangoHora(inicio,fin);
                                        caece.creaReserva(code,fecha,rh);
                                         break;
                                         //Evento
                                         case 3:




                            }
                        }
                        System.out.println("Ingrese el codigo de la asignatura/Curso de extension/Evento: \n");
                        String code = sc.next();

                        break;
                        case 4:
                            sc = new Scanner(System.in);
                            do{
                                System.out.println("[1] Para generar un reporte del monto recaudado");
                                System.out.println("[2] Para generar un reporte de tipo Listado");
                                System.out.println("[3] Para finalizar con la operacion");
                                res = sc.nextInt();
                                switch(res){
                                    case 1:caece.reporteMonto();
                                        break;
                                    case 2:caece.reporteListado();
                                        break;
                                    case 3:
                                        break;
                                }
                            }while(res != 3);
                            break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + res);
                }

            }
        } while (res != 5);
    }
}
