import java.util.Scanner;
import Universidad.*;
public class Funciones_Menu {
    Scanner sc = new Scanner(System.in);
    public void consultaAulas(Universidad uni){
        System.out.println("Ingrese el numero de piso:\n");
        int piso = sc.nextInt();
        System.out.println("Ingrese el codigo de la asignatura/Curso de extension/Evento:\n");
        String cod = sc.next();
        uni.filtraxPiso(piso, cod);
    }
    public void registraAulas(Universidad uni){
        int res;
        char resc;
        System.out.println("Para que desea reservar un aula?\n");
        System.out.println("* Asignatura - 1");
        System.out.println("* Curso de extension - 2");
        System.out.println("* Evento - 3");
        System.out.println("Ingresa una opcion pa: ");
        res = sc.nextInt();
        System.out.println("Ingrese el codigo de la asignatura/Curso de extension/Evento: \n");
        String cod = sc.next();
        Reservador resvdor;
        resvdor = uni.buscaReservador(cod);
        if(resvdor!=null){
            switch (res) {
                case 1, 2:
                    uni.creaReserva();
                    break;
                case 3:
                    System.out.println("Es externo? (S/N): ");
                    resc = sc.next().charAt(0);
                    if(resc=='S') {
                        System.out.println("Ingrese el nombre de la organizacion: ");
                        String nom = sc.next();
                        System.out.println("Ingrese el costo del alquiler: ");
                        float costo = sc.nextFloat();
                        uni.creaReserva('E', nom, costo);
                    }
                    uni.creaReserva('I',"", 0 );
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + res);
            }
        }
    }
}

