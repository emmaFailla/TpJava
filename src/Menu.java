import java.util.Scanner;
import Universidad.Universidad;
import Universidad.Reservador;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import Universidad.RangoHora;

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
                        char resc;
                        System.out.println("Para que desea reservar un aula?\n");
                        System.out.println("* Asignatura - 1");
                        System.out.println("* Curso de extension - 2");
                        System.out.println("* Evento - 3");
                        System.out.println("Ingresa una opcion pa: ");
                        res = sc.nextInt();
                        System.out.println("Ingrese el codigo de la asignatura/Curso de extension/Evento: \n");
                        String code = sc.next();
                        Reservador rs;
                        rs = caece.buscaReservador(code);
                        if(rs!=null){
                            caece.creaReserva();
                            switch (res) {
                                case 1:
                                    caece.creaReservas(rs);
                                    break;
                                case 2:

                                case 3:
                                    System.out.println("Es externo? (S/N): ");
                                    resc = sc.next().charAt(0);
                                    if(resc=='S') {
                                        System.out.println("Ingrese el nombre de la organizacion: ");
                                        String nom = sc.next();
                                        System.out.println("Ingrese el costo del alquiler: ");
                                        float costo = sc.nextFloat();
                                        caece.creaReservas(rs, 'E', nom, costo);
                                    }
                                    caece.creaReserva(rs,'I',"", 0 );
                                    break;
                                default:
                                    throw new IllegalStateException("Valor inesperado: " + res);
                            }
                        }
                        break;
                        case 4:
                            sc = new Scanner(System.in);
                            do{
                                System.out.println("[1] Para generar un reporte del monto recaudado");
                                System.out.println("[2] Para generar un reporte de tipo Listado");
                                System.out.println("[3] Para finalizar con la operacion");
                                res = sc.nextInt();
                                switch(res){
                                    case 1:universidad.reporteMonto();
                                        break;
                                    case 2:universidad.reporteListado();
                                        break;
                                    case 3:
                                        break;
                                    default: throw new IllegalStateException("Valor inesperado : " + res);
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
