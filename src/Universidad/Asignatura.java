package Universidad;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Asignatura extends Reservador {
    private String codAlfaUniv;
    private String nomAsignatura;
    private RangoFechas rangoFechCurs;
    private DayOfWeek diaDicta;
    private RangoHora horario;
    private int cantAlumnoInsc;
    //Constructor
    public Asignatura(String codAlfaUniv, String nomAsignatura, RangoFechas rangoFech, int diaSemana, int cantAlumnoInsc){
        this.codAlfaUniv = codAlfaUniv;
        this.nomAsignatura = nomAsignatura;
        this.rangoFechCurs = rangoFech;
        this.diaDicta = DayOfWeek.of(diaSemana);
        this.cantAlumnoInsc = cantAlumnoInsc;
    }
    public String getCod() {
        return codAlfaUniv;
    }
    public void setCod(String cod) {
        codAlfaUniv = cod;
    }
    public String getNom() {
        return nomAsignatura;
    }
    public void setNom(String nom) {
        nomAsignatura = nom;
    }
    public RangoFechas getRangoFechCurs() {
        return rangoFechCurs;
    }
    public void setRangoFechCurs(RangoFechas rangoFechCurs) {
        this.rangoFechCurs = rangoFechCurs;
    }
    public DayOfWeek getDiasDicta() {
        return diaDicta;
    }
    public void setDiasDicta(int diasDicta) {this.diaDicta = DayOfWeek.of(diasDicta);
    }
    public RangoHora getHorario() {
        return horario;
    }
    public void setHorario(RangoHora horario) {
        this.horario = horario;
    }
    public int getCantAlumnoInsc() {
        return cantAlumnoInsc;
    }
    public void setCantAlumnoInsc(int cantAlumnoInsc) {
        this.cantAlumnoInsc = cantAlumnoInsc;
    }

    @Override
    public String toString() {
        return "\nCodigo alfanumerico univoco: "+codAlfaUniv+"\nNombre: "+nomAsignatura+"\nRango de fechas de la cursada"+rangoFechCurs+"\nDias de la semana que se dicta: "+diaDicta+"\nHorario: "+horario.toString()+"\nCantidad de alumnos inscriptos: "+cantAlumnoInsc+"\n";
    }
    public boolean puedoReservar(LocalDate fecha, RangoHora rangoh, char tipo, String nombre, float monto){
        boolean band = false;
        if(rangoFechCurs.contains(fecha)){
            if(fecha.getDayOfWeek()==diaDicta){
                if(rangoh.equals(horario)){
                    band = true;
                }
            }
        }
        return band;
    }
}
