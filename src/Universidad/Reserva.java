package Universidad;

public class Reserva {
    //Atributos
    private static int cantRes = 0;//Estatico, por que es propio de la clase
    private final int codRes;
    private final String fecha;
    private final String rangoHorario;
    //Realiza reserva apunta al tipo de reserva en una lista
    private final Reservador rs;
    //Constructor
    public Reserva(Reservador resvdor, String fecha, String rangoHorario){
        cantRes++;
        codRes = cantRes;
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
