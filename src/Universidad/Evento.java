package Universidad;
import java.time.LocalDate;

public class Evento extends Reservador {
    private String fecha;
    private RangoHora horario;
    private String codigo;
    private String descripcion;
    private int cantMaxPart;
    private tipoEvento e;
    public  Evento(String fecha, RangoHora horario, String codigo, String descripcion, int cantMaxPart, String tipo, float monto){
        this.fecha = fecha;
        this.horario = horario;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantMaxPart = cantMaxPart;
        this.e = new tipoEvento(tipo,monto);
    }
    public float getCosto(){return e.getCobroAlquiler();};
    public String getCod(){
        return codigo;
    }
    public void setCod(String cod){
        codigo = cod;
    }
    public String getDesc(){
        return descripcion;
    }
    public void setDesc(String desc){
        descripcion = desc;
    }
    public int getCantMaxPart(){
        return cantMaxPart;
    }
    public void setCantMaxPart(int cantMaxPart){
        this.cantMaxPart = cantMaxPart;
    }
    public tipoEvento getEvento(){
        return e;
    }
    public void setEvento(tipoEvento evento){
        e = evento;
    }
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
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
}