package Universidad;

public class Reserva {
    //Atributos
    //Estatico, por que es propio de la clase
    private static int numRes = 0;
    private final int codRes;
    private final String fecha;
    private final RangoHora rangoHorario;
    //Realiza reserva apunta al tipo de reserva en una lista
    private final Reservador rs;
    //Constructor
    public Reserva(Reservador resvdor, String fecha, RangoHora rangoHorario){
        numRes++;
        codRes = numRes;
        rs=resvdor;
        this.fecha = fecha;
        this.rangoHorario = rangoHorario;
    }
    public Reservador getRs(){
        return rs;
    }
    @Override
    public String toString(){
        return "Codigo: "+codRes+" Fecha: "+fecha+" Rango: "+rangoHorario+rs.toString();
    }
    //Metodos

}
