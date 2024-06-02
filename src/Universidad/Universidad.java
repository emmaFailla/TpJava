package Universidad;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.util.Map;
import java.util.ArrayList;

public class Universidad {
    private final TreeMap<Integer, Aula> aulas = new TreeMap<>();
    private final HashSet<Reservador> reservadores = new HashSet<>();
    public void consultaAulas(int piso, String cod){
        int pisoInicial = piso*100;
        int pisoFinal = pisoInicial+99;
        Map<Integer, Aula> subAulas = aulas.subMap(pisoInicial, pisoFinal);
        ArrayList<Aula> aulasConsultadas = new ArrayList<>(subAulas.values());
        Iterator<Aula> iterator = aulasConsultadas.iterator();
        while(iterator.hasNext()){
            Aula aulaC = iterator.next();
            aulaC.muestraxCodigo(cod);
        }
    }
    //Lista de todos los  tipos de reserva que cargamos desde el archivo xml y que utilizamos
    //posteriormente para cargar reservas
}