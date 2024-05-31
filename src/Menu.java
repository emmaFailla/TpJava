import java.util.Scanner;
import Universidad.Universidad;

public class Menu {
    public static void despliegaMenu(){
        Scanner sc = new Scanner(System.in);
        int res;
        Universidad universidad = new Universidad();
        do {
            System.out.println("Universidad CAECE - Sede Mar del Plata");
            System.out.println("Bienvenido, que desea hacer?");
            System.out.println("* Consultar datos de un Aula - 1");
            System.out.println("* Registrar la reserva de un Aula - 2");
            System.out.println("* Cancelar reserva - 3");
            System.out.println("* Generar reporte - 4");
            System.out.println("* Salir - 5");
            System.out.println("Ingrese una opcion: ");
            res = sc.nextInt();
            if (res != 5) {
                switch (res) {
                    case 1:
                        universidad.recorreAulas();
                }
            }
        } while (res != 5);
    }
}
