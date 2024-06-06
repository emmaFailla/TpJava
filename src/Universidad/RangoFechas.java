package Universidad;
import java.time.LocalDate;

public class RangoFechas implements Comparable<RangoFechas>{
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    public RangoFechas(LocalDate fechaInicial, LocalDate fechaFinal) {
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
    }
    public LocalDate getFechaInicial() {
        return fechaInicial;
    }
    public LocalDate getFechaFinal() {
        return fechaFinal;
    }
    public void setFechaInicial(LocalDate fechaI) {
        fechaInicial = fechaI;
    }
    public void setFechaFinal(LocalDate fechaF) {
        fechaFinal = fechaF;
    }
    @Override
    public String toString() {
        return "\nFecha inicial"+fechaInicial.toString()+"\nFecha final: "+fechaFinal.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RangoFechas rangoh = (RangoFechas) obj;
        return fechaInicial.equals(rangoh.getFechaInicial()) && fechaFinal.equals(rangoh.getFechaFinal());
    }

    @Override
    public int hashCode() {
        int result = fechaInicial.hashCode();
        result = 31 * result + fechaFinal.hashCode();
        return result;
    }

    public boolean contains(LocalDate fecha) {
        return (fecha.equals(fechaInicial) || fecha.isAfter(fechaInicial)) &&
                (fecha.equals(fechaFinal) || fecha.isBefore(fechaFinal));
    }

    @Override
    public int compareTo(RangoFechas rangoh) {
        int compareStart = this.getFechaInicial().compareTo(rangoh.getFechaInicial());
        if (compareStart != 0) {
            return compareStart;
        }
        return this.getFechaFinal().compareTo(rangoh.getFechaFinal());
    }
}
