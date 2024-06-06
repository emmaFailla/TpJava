package Comparadores;
import Universidad.Aula;
import java.util.Comparator;

public class ComparadorPorCantRes implements Comparator<Aula> {
        @Override
        public int compare(Aula a1, Aula a2){
            return Integer.compare(a1.getResTot(),a2.getResTot());
    }
}
