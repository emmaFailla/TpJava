package Universidad;

public class tipoEvento {
    private String tipo;
    private float cobroAlquiler;

    public tipoEvento(String tipo, float monto) {
        this.tipo = tipo;
        this.cobroAlquiler = monto;
    }

    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getCobroAlquiler() {
        return cobroAlquiler;
    }

    public void setCobroAlquiler(float cobroAlquiler) {
        this.cobroAlquiler = cobroAlquiler;
    }
    @Override
    public String toString() {
        return "\ntipo de evento: " + tipo + "\nCobro de alquiler: " + cobroAlquiler;
    }
}
