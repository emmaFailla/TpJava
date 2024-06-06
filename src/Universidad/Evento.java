package Universidad;
import java.time.LocalDate;
import java.util.Scanner;

public class Evento extends Reservador {
    private LocalDate fecha;
    private RangoHora horario;
    private String codigo;
    private String descripcion;
    private int cantMaxPart;
    private tipoEvento evento;
    public  Evento(LocalDate fecha, RangoHora horario, String codigo, String descripcion, int cantMaxPart, String tipo, float monto){
        this.fecha = fecha;
        this.horario = horario;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantMaxPart = cantMaxPart;
        this.evento = new tipoEvento(tipo,monto);
    }
    public String getCod(){
        return codigo;
    }
    public void setCod(String cod){
        this.codigo = cod;
    }
    public String getDesc(){
        return descripcion;
    }
    public void setDesc(String desc){
        this.descripcion = desc;
    }
    public int getCantMaxPart(){
        return cantMaxPart;
    }
    public void setCantMaxPart(int cantMaxPart){
        this.cantMaxPart = cantMaxPart;
    }
    public tipoEvento getEvento(){
        return evento;
    }
    public void setEvento(tipoEvento evento){
        this.evento = evento;
    }
    public LocalDate getFecha(){
        return fecha;
    }
    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }
    public RangoHora getHorario(){
        return horario;
    }
    public void setHorario(RangoHora horario){
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha + "\nHorario: " + horario + "\nCodigo: " + codigo + "\nDescripcion: " + descripcion + "\nCantidad Maxima de Participantes: " + cantMaxPart + "\nEvento: " + evento;
    }

    public int getCap(){return cantMaxPart;}

    public RangoFechas getRangoFech(){
        //Convierto el atributo fecha en un rango de fechas
        RangoFechas rangoFechas = null;
        rangoFechas.setFechaInicial(fecha);
        rangoFechas.setFechaFinal(null);
        return rangoFechas;
    }

    public RangoHora getRangoHora(){
        return horario;
    }

    public String getNom(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la organizacion: ");
        return sc.next();
    }

    public float getCostoAlquiler(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el costo del alquiler: ");
        return sc.nextFloat();
    }
}