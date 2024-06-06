package Universidad;
import java.time.LocalTime;

public class RangoHora implements Comparable<RangoHora>{
    private LocalTime horaInicial;
    private LocalTime horaFinal;
    public RangoHora(LocalTime inicio, LocalTime fin) {
        this.horaInicial = inicio;
        this.horaFinal = fin;
    }
    public LocalTime getInicio() {
        return horaInicial;
    }
    public void setInicio(LocalTime inicio) {
        this.horaInicial = inicio;
    }
    public LocalTime getFin() {
        return horaFinal;
    }
    public void setFin(LocalTime fin) {
        this.horaFinal = fin;
    }
    @Override
    public String toString() {
        return "\nHora inicio: " + horaInicial + "\nHora fin: " + horaFinal + "\n";
    }
    @Override
    public int compareTo(RangoHora o) {
        boolean compara = this.horaInicial.isAfter(o.getInicio())||this.horaInicial.equals(o.getInicio())&&this.horaFinal.isBefore(o.getFin())||this.horaFinal.equals(o.getFin());
        return compara?0:this.horaFinal.compareTo(o.getFin());
    }
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof RangoHora rh)) return false;
        return this.horaInicial.isAfter(rh.getInicio())||this.horaInicial.equals(rh.getInicio())&&this.horaFinal.isBefore(rh.getFin())||this.horaFinal.equals(rh.getFin());
    }
}
