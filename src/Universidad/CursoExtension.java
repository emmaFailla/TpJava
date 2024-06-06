package Universidad;
import java.time.LocalDate;

public class CursoExtension extends Reservador {
    private String codAlfa;
    private String descripcion;
    private int cantInscMax;
    private int cantClases;
    private float costoCurso;

    public CursoExtension(String codAlfa, String descripcion, int cantInscMax, int cantClases, float costoCurso){
        this.codAlfa = codAlfa;
        this.descripcion = descripcion;
        this.cantInscMax = cantInscMax;
        this.cantClases = cantClases;
        this.costoCurso = costoCurso;
    }
    public String getCod(){
        return codAlfa;
    }
    public float getCosto(){return costoCurso;};
    public void setCod(String cod){
        codAlfa = cod;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public int getCantInscMax(){
        return cantInscMax;
    }
    public void setCantInscMax(int cantInscMax){
        this.cantInscMax = cantInscMax;
    }
    public int getCantClases(){
        return cantClases;
    }
    public void setCantClases(int cantClases){
        this.cantClases = cantClases;
    }
    public float getCostoCurso(){
        return costoCurso;
    }
    public void setCostoCurso(float costoCurso){
        this.costoCurso = costoCurso;
    }

    @Override
    public String toString(){
        return "Codigo Alfanumerico: "+codAlfa+"\nDescripcion:"+descripcion+"\nCantidad de inscripciones maxima:"+cantInscMax+"\nCantidad de clases: "+cantClases+"\nCosto por curso: "+costoCurso;
    }
}
