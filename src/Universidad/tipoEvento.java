package Universidad;

public class tipoEvento {
    private String tipo;
    private float monto;

    public tipoEvento(String tipo, float monto) {
        this.tipo = tipo;
        this.monto = monto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    @Override
    public String toString() {
        return "\ntipo de evento: " + tipo + "\nCobro de alquiler: " + monto;
    }
}
