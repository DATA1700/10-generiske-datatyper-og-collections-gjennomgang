import java.util.*;

public class Main {
    public static void main(String[] args) {
        //bord();
        stol();
    }

    static void mobelImpl() {
        MobelRegister<MobelImpl> register = new MobelRegister<>();

        register.leggTil(new MobelImpl("Billy", "Hylle", 10, 300));
        register.leggTil(new MobelImpl("Malm", "Seng", 50, 2000));

        //System.out.println(register.hentMobel(0));
        //System.out.println(register.hentMobel(1));

        register.skrivUtAlle();
    }

    static void bord() {
        MobelRegister<Bord> listBord = new MobelRegister<>();

        listBord.leggTil(new Bord("Bord1", 10, 500, 4));
        listBord.leggTil(new Bord("Bord2", 20, 1000, 2 ));

        listBord.skrivUtAlle();

        listBord.sortAntallBen();

        listBord.skrivUtAlle();

        listBord.sort();

        listBord.skrivUtAlle();
    }

    static void stol() {
        MobelRegister<Stol> register = new MobelRegister<>();

        register.leggTil(new Stol("Stol1", 10, 200));
        register.leggTil(new Stol("Stol2", 5, 100));

        register.skrivUtAlle();

        register.sort();

        register.skrivUtAlle();

        register.sortAntallBen();

        register.skrivUtAlle();
    }

    public static <T extends Mobel> void skrivUt (List<T> list) {
        for (Mobel m: list) {
            System.out.println(m);
        }
    }

    static void listTest() {
        ArrayList<Integer> arrayListInt = new ArrayList<>();
        long startArrayList = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            arrayListInt.add(i);
        }

        for (int i = 0; i < 10000; i++) {
            arrayListInt.get(i);
        }

        System.out.println(System.currentTimeMillis() - startArrayList);

        LinkedList<Integer> linkedListInt = new LinkedList<>();
        long startLinkedList = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            linkedListInt.add(i);
        }

        Iterator<Integer> iter = linkedListInt.iterator();
        while (iter.hasNext()) {
            iter.next();
        }


        /*
        for (int i = 0; i < 10000; i++) {
            linkedListInt.get(i);
        }

         */

        System.out.println(System.currentTimeMillis() - startLinkedList);

        Vector<Integer> vectorInt = new Vector<>();
        long startVector = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            vectorInt.add(i);
        }

        for (int i = 0; i < 10000; i++) {
            vectorInt.get(i);
        }

        System.out.println(System.currentTimeMillis() - startVector);

    }
}
