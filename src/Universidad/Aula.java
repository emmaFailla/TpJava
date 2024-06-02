package Universidad;
import java.util.*;

public class Aula {
    private final int numero;
    private final int capMax;
    private HashMap<Integer, Reserva> reservas;
    public Aula(int capMax, int num) {
        this.capMax = capMax;
        this.numero = num;
        this.reservas = new HashMap<>();
    }
    //Metodos
    public int getPiso() {
        return numero /100;
    };
    public HashMap<Integer,Reserva> getReservas(){
        return reservas;
    }
    public int getNum(){return numero;};
    public int getCapMax() {
        return capMax;
    };
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
