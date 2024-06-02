package Universidad;

public class Evento extends Reservador {
    private String fecha;
    private RangoHora horario;
    private String codigo;
    private String descripcion;
    private int cantMaxPart;
    private tipoEvento evento;
    public  Evento(String fecha, RangoHora horario, String codigo, String descripcion, int cantMaxPart, String tipo, float monto){
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