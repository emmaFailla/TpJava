package Universidad;
import java.time.LocalDate;
import java.util.*;
import java.util.Map;
import java.util.Scanner;

public class Universidad {
    ///Atributos->
    private final TreeMap<Integer, Aula> aulas = new TreeMap<>();//Mapa o set
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

    public void creaReservas(Reservador rs){
    }

    public void creaReservas(Reservador rs, LocalDate fechaInicial, RangoHora rangoh){

    }

    public void creaReservas(Reservador rs, char tipo, String nombre, float monto){

    }

    public void reporteMonto(){
        int montoAula,montoPiso,montoTotal,pisoAct,aulaAct;
        montoTotal = 0;
        //Recorro las aulas con ciclo for each ya que solo hay lectura, no hay modificaciones
        for(Aula a : aulas.values()){
            aulaAct = a.getNum();
        }

    }

    public void reporteListado(){

    }

}