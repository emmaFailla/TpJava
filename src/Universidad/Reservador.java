package Universidad;

abstract public class Reservador{
    public abstract String getCod();
    @Override
    public abstract String toString();
    public abstract int getCap();
    public abstract RangoFechas getRangoFech();
    public abstract RangoHora getRangoHora();
    public abstract String getNom();
    public abstract float getCostoAlquiler();
}