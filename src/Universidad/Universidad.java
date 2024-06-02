package Universidad;
import java.util.*;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;

public class Universidad {
    private final TreeMap<Integer, Aula> aulas = new TreeMap<>();
    private final HashSet<Reservador> reservadores = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    public void filtraxPiso(int piso, String cod){
        int pisoInicial = piso*100;
        int pisoFinal = pisoInicial+99;
        Map<Integer, Aula> subAulas = aulas.subMap(pisoInicial, pisoFinal);
        ArrayList<Aula> aulasConsultadas = new ArrayList<>(subAulas.values());
        for (Aula aulaC : aulasConsultadas) {
            aulaC.muestraxCodigo(cod);
        }
    }
    public Reservador buscaReservador(String cod){
        for(Reservador reservador : reservadores){
            if(reservador.getCod().equals(cod)){
                return reservador;
            }
        }
        return null;
    }

    public void obtieneDatos(String fecha, RangoHora rangoh){
        System.out.println("\n__Creando Reserva__");
        System.out.println("Ingrese la fecha: ");
        fecha = sc.nextLine();
        System.out.println("Ingrese el horario inicial: ");
        String horai = sc.next();
        System.out.println("Ingrese la hora de fin: ");
        String horaf = sc.next();
        rangoh = new RangoHora(horai, horaf);
    }

    public void creaReserva(){
        String fecha = "";
        RangoHora rangoH = null;
        obtieneDatos(fecha, rangoH);
        System.out.println("Fecha: " + fecha);
    }

    public void creaReserva(char tipo, String nombre, float monto){
        System.out.println("\n__Creando Reserva__");
        System.out.println("Ingrese la fecha: ");
        String fecha = sc.nextLine();
        System.out.println("Ingrese el horario inicial: ");
        String hi = sc.next();
        System.out.println("Ingrese la hora de fin: ");
        String hf = sc.next();
        RangoHora rango = new RangoHora(hi, hf);

    }
    //Lista de todos los  tipos de reserva que cargamos desde el archivo xml y que utilizamos
    //posteriormente para cargar reservas
}