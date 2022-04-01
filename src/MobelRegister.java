import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MobelRegister <T extends Mobel> {

    private List<T> list;

    public MobelRegister() {
        this.list = new ArrayList<>();
    }

    //Det skal være mulig å legge til (ved å angi navn, type, vekt, pris), hente ut og slette Mobel-objekter ved bruk av nummer

    public void leggTil(T mobel) {
        list.add(mobel);
    }

    public Mobel hentMobel(int nummer) {
        for (Mobel m: list) {
            if (m.getNummer() == nummer) {
                return m;
            }
        }

        return null;
    }

    public Mobel slettMobel(int nummer) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNummer() == nummer) {
                Mobel m = list.get(i);
                list.remove(i);
                return m;
            }
        }

        return null;
    }

    public void sort() {
        Collections.sort(list);
    }

    public void sortAntallBen() {

        if (list.stream().allMatch(Bord.class::isInstance)) {
            list.sort(new BordComparator());
        } else {
            System.err.println("Not type bord");
        }

        /*
        try {
            list.sort(new BordComparator());
        } catch (Exception ignored) {

        }
         */

    }

    public void skrivUtAlle() {
        Main.skrivUt(list);
    }
}

class Bord extends Mobel {

    private int antallBen;

    private static int counter = 0;

    public Bord( String navn, double vekt, double pris, int antallBen) {
        super(counter++, navn, "Bord", vekt, pris);
        this.antallBen = antallBen;

    }

    public int getAntallBen() {
        return antallBen;
    }

    public void setAntallBen(int antallBen) {
        this.antallBen = antallBen;
    }

    @Override
    public String toString() {
        return String.format("%s_%s_%s", this.nummer, this.navn, this.antallBen);
    }

    @Override
    public int compareTo(Mobel o) {
        return this.nummer - o.getNummer();
    }
}

class Stol extends Mobel {

    private static int counter = 0;

    public Stol(String navn, double vekt, double pris) {
        super(counter++, navn, "Stol", vekt, pris);
    }

    @Override
    public String toString() {
        return String.format("%s_%s_%s", this.nummer, this.navn, this.pris);
    }

    @Override
    public int compareTo(Mobel o) {
        return this.pris > o.getPris() ? 1 : -1;
    }
}
