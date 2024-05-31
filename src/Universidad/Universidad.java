package Universidad;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.*;

public class Universidad {
    TreeMap<Integer, Aula> aulas = new TreeMap<>();
    TreeSet<Reservador> reservadores = new TreeSet<Reservador>();
    void cargaArchivo(TreeMap<Integer, Aula> aulas, TreeSet<Reservador> reservadores){}
    public void recorreAulas(){
        Iterator<Aula> itA = aulas.values().iterator();
        Iterator<Reservador> itR = reservadores.iterator();
        while(itR.hasNext()){
            Reservador r = itR.next();
            while (itA.hasNext()) {
                Aula a = itA.next();
                int pisoAct = a.getPiso();
                System.out.println(pisoAct);
                System.out.println(r);
                while (itA.hasNext() && a.getPiso() == pisoAct) {
                    System.out.println(r);
                    a.recorreReservas(r);
                }
            }
        }
    }
    //Lista de todos los  tipos de reserva que cargamos desde el archivo xml y que utilizamos
    //posteriormente para cargar reservas
}