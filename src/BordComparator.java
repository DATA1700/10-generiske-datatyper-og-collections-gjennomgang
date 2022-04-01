import java.util.Comparator;

public class BordComparator implements Comparator<Mobel> {

    @Override
    public int compare(Mobel o1, Mobel o2) {
        return ((Bord) o1).getAntallBen() - ((Bord) o2).getAntallBen();
    }
}
