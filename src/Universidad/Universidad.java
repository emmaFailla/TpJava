package Universidad;
import java.util.*;
import Comparadores.ComparadorPorCantRes;

public class Universidad {
    ///Atributos->
    private final TreeMap<Integer, Aula> aulas = new TreeMap<>();
    private final HashSet<Reservador> reservadores = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    ///Metodos ->
    public void filtraxPiso(int piso, String cod){
        int pisoInicial = piso*100;
        int pisoFinal = pisoInicial+99;
        Map<Integer, Aula> subAulas = aulas.subMap(pisoInicial, pisoFinal);
        for (Aula aulaC : subAulas.values()) {
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
        //PUEDE IMPLEMENTAR TRY AND CATCH, POR OPERACION DE LECTURA
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
        //PUEDE IMPLEMENTAR TRY AND CATCH, POR OPERACION DE LECTURA
        System.out.println("\n__Creando Reserva__");
        System.out.println("Ingrese la fecha: ");
        String fecha = sc.nextLine();
        System.out.println("Ingrese el horario inicial: ");
        String hi = sc.next();
        System.out.println("Ingrese la hora de fin: ");
        String hf = sc.next();
        RangoHora rango = new RangoHora(hi, hf);

    }
        /*
        * Monto recaudado por aula, por piso y total de la institución. Tener en cuenta que las
    reservas de las asignaturas y eventos internos no generan ingresos.
        * */
        public  void reporteMonto(){
        float montoAula,montoPiso,montoTotal;
        int pisoAct,aulaAct;
        montoTotal = 0;
        //Itera sobre las aulas
        Iterator<Aula> itA = aulas.values().iterator();
        //Recorre
        Aula a = itA.next();
        while(itA.hasNext()){
            pisoAct = a.getPiso();
            montoPiso = 0;
            //Mientras se encuentre en el mismo piso, recorre.
            while(a.getPiso() == pisoAct && itA.hasNext()){
                //Itera sobre las reservas
                Iterator<Reserva> itR = a.getReservas().values().iterator();
                Reserva r = itR.next();
                montoAula = 0;
                //RecorreReservas
                while(itR.hasNext()){
                    montoAula+= r.getRs().getCosto();
                    r = itR.next();
                }
                montoPiso += montoAula;
                System.out.println("El Aula " + a.getNum() + "recaudo un total de $" + montoAula );
                a = itA.next();
            }
            montoTotal += montoPiso;
            System.out.println("El Piso " + pisoAct + "recaudo un total de $" + montoPiso );
        }
        //Reporte total
            System.out.println("El monto total recaudado de la universidad fue de  $ " + montoTotal);
    }

    /*
    * Listado completo de aulas ordenadas descendentemente por cantidad de reservas. Al
    final del listado, informar cantidad de reservas promedio por aula.
    * */
    //Se me ocurre una linkedlist
    public void reporteListado(){
        int resTot,cantAulas;
        resTot = cantAulas = 0;
        ComparadorPorCantRes comp = new ComparadorPorCantRes();
        TreeSet<Aula> aulasOrdenadas = new TreeSet<>(comp);
        //Inserto todas las aulas en el nuevo contenedor (Aprobado por el mismisimo Claudio Gea)
        for(Aula a : aulas.values()){
            cantAulas++;
            resTot+= a.getResTot();
            aulasOrdenadas.add(a);
        }
        System.out.println("Hay un promedio de " + (float)resTot/cantAulas + " reservas por aula");
        System.out.println("Listado : ");
        for(Aula a : aulasOrdenadas){
            System.out.println(a);
        }

    }

}