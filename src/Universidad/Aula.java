package Universidad;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class Aula {
    private final int numero;
    private final int capMax;
    private TreeMap<Integer, Reserva> reservas;
    public Aula(int capMax, int id) {
        this.capMax = capMax;
        this.numero = id;
        this.reservas = new TreeMap<>();
    }
    public int getPiso() {
        return numero/100;
    }
    public int getCapMax() {
        return capMax;
    }
    @Override
    public String toString() {
        return "Aula " + numero + "\ncapMax = " + capMax;
    }
    public void recorreReservas(Reservador resvdor) {
        Iterator<Reserva> it = reservas.values().iterator();
        boolean bandera = false;
        while (it.hasNext()&&!bandera) {
            Reserva reserva = it.next();
            if(reserva.getRs()==resvdor){
                bandera = true;
                Reservador rsAct= reserva.getRs();
                System.out.println(toString());
                System.out.println(reserva);
                while(it.hasNext()&&rsAct==resvdor){
                   Reserva reservaAct= it.next();
                   System.out.println(reserva);
                }
            }
        }
    }
}
