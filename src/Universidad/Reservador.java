package Universidad;
import java.io.Serializable;
import java.time.LocalDate;

abstract public class Reservador implements Serializable/*Para poder almacenar en archivos los objetos derivados de reservador*/ {
    public abstract String getCod();
    public float getCosto(){return 0;};
    @Override
    public abstract String toString();
}