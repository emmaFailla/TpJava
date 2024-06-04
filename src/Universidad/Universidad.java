package Universidad;
import com.sun.source.tree.NewArrayTree;

import javax.swing.*;
import java.time.LocalDate;
import java.util.*;
import java.util.Map;
import java.util.Scanner;

public class Universidad {
    ///Atributos->
    private final TreeMap<Integer, Aula> aulas = new TreeMap<>();
    private final HashSet<Reservador> reservadores = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    ///Metodos ->
    public void filtraxPiso(int piso, String cod){
        int aulaInicial = piso*100;
        int aulaFinal = aulaInicial+99;
        Map<Integer, Aula> subAulas = aulas.subMap(aulaInicial, aulaFinal);
        for (Aula aulaC : subAulas.values()) {
            aulaC.muestraxCodigo(cod);
        }
    }
    public Reservador creaReserva(String cod){
        for(Reservador reservador : reservadores){
            if(reservador.getCod().equals(cod)){
                Aula aulaConsultada = consultaCapacidad(reservador);
                aulaConsultada.consultaDisponibilidad(reservador);
            }
        }
    }

    public Aula consultaCapacidad(Reservador rs){
        //controla capacidad
        Iterator<Aula> it = aulas.values().iterator();
        boolean band=false;
        while(it.hasNext()&&!band){
            Aula aula = it.next();
            if(aula.getCapMax() >= rs.getCap()){
                return aula;
            }
        }
    }

    public void creaReservas(Reservador rs, LocalDate fechaInicial, RangoHora rangoh){

    }

    public void creaReservas(Reservador rs, char tipo, String nombre, float monto){

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