public abstract class Mobel implements Comparable<Mobel> {
    // Du skal lage et vareregister for en møbelbutikk som inneholder feltene navn, type, vekt, pris og nummer (et løpenummer):

    protected int nummer;
    protected String navn;
    protected String type;
    protected double vekt;
    protected double pris;

    public Mobel(int nummer, String navn, String type, double vekt, double pris) {
        this.nummer = nummer;
        this.navn = navn;
        this.type = type;
        this.vekt = vekt;
        this.pris = pris;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getVekt() {
        return vekt;
    }

    public void setVekt(double vekt) {
        this.vekt = vekt;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public abstract String toString();
}
