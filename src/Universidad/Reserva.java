package Universidad;

public class Reserva {
    //Atributos
    private static int cantRes = 0;//Estatico, por que es propio de la clase
    private final String codRes;
    private final String fecha = "";
    private final String rangoHorario = "";
    //Realiza reserva apunta al tipo de reserva en una lista
    private Reservador rs;
    //Constructor
    public Reserva(String codRes, Reservador resvdor){
        cantRes++;
        this.codRes = codRes;
        rs=resvdor;
    }
    public Reservador getRs(){
        return rs;
    }
    //Metodos

}
