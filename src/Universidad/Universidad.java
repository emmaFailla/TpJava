package Universidad;
import java.util.*;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;

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
                    Reservador tipoRes = r.getRs();//Con el fin de facilitar el casteo del objeto
                    if(tipoRes.getClass().getName().equals("Evento") || r.getRs().getClass().getName() .equals("CursoExtension") ){
                        //Se verifica si es un evento interno o externo
                       if(tipoRes.getClass().getName().equals("Evento")){
                           if((((Evento)tipoRes).getEvento().getTipo().equals("Externo") )) montoAula += ((Evento)tipoRes).getEvento().getCobroAlquiler(); //Consultar
                       }
                       else montoAula+= ((CursoExtension)tipoRes).getCostoCurso();
                    }
                    r = itR.next();
                }
                montoPiso += montoAula;
                System.out.println("El Aula " + a.getNum() + "recaudo un total de $" + montoAula );
                a = itA.next();
            }
            System.out.println("El Piso " + pisoAct + "recaudo un total de $" + montoPiso );
        }
    }

    public void reporteListado(){

    }

}