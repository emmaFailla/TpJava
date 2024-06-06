package Universidad;

import java.time.LocalDate;

abstract public class Reservador{
    public abstract String getCod();
    public float getCosto(){return 0;};
    @Override
    public abstract String toString();
}