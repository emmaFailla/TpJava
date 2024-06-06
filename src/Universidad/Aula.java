package Universidad;
import java.util.*;

public class Aula {
    private final int numero;
    private final int capMax;
    private int cantReservas;//Lo necesito para el inciso 5.
    private HashMap<Integer, Reserva> reservas;
    public Aula(int capMax, int num) {
        this.capMax = capMax;
        numero = num;
        reservas = new HashMap<>();
        cantReservas = 0;
    }
    //Metodos
    public int getPiso() {
        int piso = numero /100;
        return piso < 0 ? 1 : piso;
    };
    public HashMap<Integer,Reserva> getReservas(){return reservas;}
    public int getNum(){return numero;};
    public int getCapMax() {
        return capMax;
    };
    public int getResTot(){return cantReservas;};
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
