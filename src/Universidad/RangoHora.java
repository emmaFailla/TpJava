package Universidad;

public class RangoHora {
    private String inicio;
    private String fin;
    public RangoHora(String inicio, String fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
    public String getInicio() {
        return inicio;
    }
    public void setInicio(String inicio) {
        this.inicio = inicio;
    }
    public String getFin() {
        return fin;
    }
    public void setFin(String fin) {
        this.fin = fin;
    }
    @Override
    public String toString() {
        return "\nHora inicio: " + inicio + "\nHora fin: " + fin + "\n";
    }
}
