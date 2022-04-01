public class MobelImpl extends Mobel{

    private static int counter = 0;

    public MobelImpl(String navn, String type, double vekt, double pris) {
        super(counter, navn, type, vekt, pris);
        counter++;
    }

    @Override
    public String toString() {
        return String.format("%s_%s", this.nummer, this.navn);
    }

    @Override
    public int compareTo(Mobel o) {
        return this.nummer - o.getNummer();
    }
}
