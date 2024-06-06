package Universidad;
import java.util.*;

public class Aula {
    private final int numero;
    private final int capMax;
    private final LinkedHashMap<Integer, Reserva> reservas;
    public Aula(int capMax, int num) {
        this.capMax = capMax;
        this.numero = num;
        this.reservas= new LinkedHashMap<>();
    }
    //Metodos
    public int getPiso() {
        int piso = numero /100;
        return piso < 0 ? 1 : piso;
    };
    public int getNum(){return numero;};
    public int getCapMax() {
        return capMax;
    };
    @Override
    public String toString() {
        return "Aula " + numero + "\ncapMax = " + capMax;
    }

    public void muestraxCodigo(String cod){
        Iterator<Reserva> it = reservas.values().iterator();
        Reserva r = it.next();
        while(it.hasNext()&&!(r.getRs().getCod().equals(cod))){
            r = it.next();
        }
        if(it.hasNext()&&r.getRs().getCod().equals(cod)) {
            System.out.println(this);
            System.out.println(r);
        }
    }

    public boolean consultaDisponibilidad(Reservador rs){
        //Estos son los datos que me interesan del reservador
        float costo=rs.getCostoAlquiler();
        String nom=rs.getNom();
        RangoFechas rangoFechas = rs.getRangoFech();
        RangoHora rangoHora = rs.getRangoHora();
        //Aca deberia de hacer un if para saber que entidad es (en base a si el costo es != 0, el nombre es != "")
        //En base al if, Itero sobre las reservas y comparo los datos de las reservas con los del reservador
        Iterator<Reserva> it = reservas.values().iterator();
        boolean band=true;
        while(it.hasNext()&&band){
            Reserva r = it.next();
            if(){

            }
        }
    }

}
