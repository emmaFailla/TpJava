package Universidad;

public class Asignatura extends Reservador {
    private String codAlfaUniv;
    private String nomAsignatura;
    private String rangoFech;
    private String diaSemana;
    private hora horario;
    private int cantAlumnoInsc;
    //Constructor
    public Asignatura(String codAlfaUniv, String nomAsignatura, String rangoFech, String diaSemana, int cantAlumnoInsc){
        this.codAlfaUniv = codAlfaUniv;
        this.nomAsignatura = nomAsignatura;
        this.rangoFech = rangoFech;
        this.diaSemana = diaSemana;
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
    public String getRangoFech() {
        return rangoFech;
    }
    public void setRangoFech(String rangoFech) {
        this.rangoFech = rangoFech;
    }
    public String getDiaSemana() {
        return diaSemana;
    }
    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }
    public hora getHorario() {
        return horario;
    }
    public void setHorario(hora horario) {
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
        return "";
    }
}
