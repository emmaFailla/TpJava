package Universidad;

public class Asignatura extends Reservador {
    private String codAlfaUniv;
    private String nomAsignatura;
    private RangoFechas rangoFechCurs;
    private String diasDicta;
    private RangoHora horario;
    private int cantAlumnoInsc;
    //Constructor
    public Asignatura(String codAlfaUniv, String nomAsignatura, RangoFechas rangoFech, String diaSemana, int cantAlumnoInsc){
        this.codAlfaUniv = codAlfaUniv;
        this.nomAsignatura = nomAsignatura;
        this.rangoFechCurs = rangoFech;
        this.diasDicta = diaSemana;
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
    public String getDiasDicta() {
        return diasDicta;
    }
    public void setDiasDicta(String diasDicta) {
        this.diasDicta = diasDicta;
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
        return "\nCodigo alfanumerico univoco: "+codAlfaUniv+"\nNombre: "+nomAsignatura+"\nRango de fechas de la cursada"+rangoFechCurs+"\nDias de la semana que se dicta: "+diasDicta+"\nHorario: "+horario.toString()+"\nCantidad de alumnos inscriptos: "+cantAlumnoInsc+"\n";
    }
}
