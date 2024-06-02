package Universidad;
import java.util.*;

public class Aula {
    private final String numero;
    private final int capMax;
    private final HashMap<String, Reserva> reservas;
    public Aula(int capMax, String num) {
        this.capMax = capMax;
        this.numero = num;
        this.reservas = new HashMap<>();
    }
    public int getPiso() {
        return numero.charAt(0);
    }
    public int getCapMax() {
        return capMax;
    }
    @Override
    public String toString() {
        return "Aula " + numero + "\ncapMax = " + capMax;
    }
    public void muestraxCodigo(String cod){
        for(Reserva reserva : reservas.values()){
            Reservador rsAct =reserva.getRs();
            if(rsAct.getCod().equals(cod)){
                System.out.println(this);
                System.out.println(reserva);
            }
        }
    }
}
