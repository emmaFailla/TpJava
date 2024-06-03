package Universidad;
import java.time.LocalTime;

public class RangoHora implements Comparable<RangoHora>{
    private LocalTime inicio;
    private LocalTime fin;
    public RangoHora(LocalTime inicio, LocalTime fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
    public LocalTime getInicio() {
        return inicio;
    }
    public void setInicio(LocalTime inicio) {
        this.inicio = inicio;
    }
    public LocalTime getFin() {
        return fin;
    }
    public void setFin(LocalTime fin) {
        this.fin = fin;
    }
    @Override
    public String toString() {
        return "\nHora inicio: " + inicio + "\nHora fin: " + fin + "\n";
    }
    @Override
    public int compareTo(RangoHora o) {
        boolean compara = this.inicio.isAfter(o.getInicio())||this.inicio.equals(o.getInicio())&&this.fin.isBefore(o.getFin())||this.fin.equals(o.getFin());
        return compara?0:this.fin.compareTo(o.getFin());
    }
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof RangoHora rh)) return false;
        return this.inicio.isAfter(rh.getInicio())||this.inicio.equals(rh.getInicio())&&this.fin.isBefore(rh.getFin())||this.fin.equals(rh.getFin());
    }
}
