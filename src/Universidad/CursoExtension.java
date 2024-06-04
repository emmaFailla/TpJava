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

    public int getCap(){return cantInscMax;};

    public void creaReserva(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        boolean valid=false;
        LocalDate fechaI=null;
        while(!valid){
            System.out.println("\nIngrese la fecha de inicio (dd/MM/yyyy): ");
            String input = sc.next();
            try{
                fechaI=LocalDate.parse(input, dtf);
                valid=true;
            }catch (DateTimeParseException e){
                System.out.println("\nFormato de fecha inválido. Por favor, inténtalo de nuevo.");
            }
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaI = null;
        LocalTime horaF = null;
        valid=false;
        while (!valid) {
            System.out.print("\nIntroduce la hora inicial (HH:mm): ");
            String input1 = sc.nextLine();

            try {
                horaI = LocalTime.parse(input1, formatter);
                valid = true;
            } catch (DateTimeParseException e) {
                System.out.println("\nFormato de hora inválido. Por favor, inténtalo de nuevo.");
            }
        }
        valid=false;
        while (!valid) {
            System.out.print("\nntroduce la hora final (HH:mm): ");
            String input2 = sc.nextLine();

            try {
                horaF = LocalTime.parse(input2, formatter);
                valid = true;
            } catch (DateTimeParseException e) {
                System.out.println("\nFormato de hora inválido. Por favor, inténtalo de nuevo.");
            }
        }
        RangoHora rangohora = new RangoHora(horaI, horaF);

        public int getCantidadDeClases(){
            return cantClases;
        };
    }
}
