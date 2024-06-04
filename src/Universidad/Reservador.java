package Universidad;

import java.time.DayOfWeek;
import java.time.LocalDate;

abstract public class Reservador{
    public abstract String getCod();
    @Override
    public abstract String toString();
    public abstract int getCap();
    public abstract RangoFechas getRangoF();
    public abstract RangoHora getHora();
    public abstract DayOfWeek getDia();
    public abstract int getCantidadDeClases();
    //public abstract boolean consultaDisponibilidad(Universidad.Reservador reservador, Universidad.Aula aulaConsultada);
}