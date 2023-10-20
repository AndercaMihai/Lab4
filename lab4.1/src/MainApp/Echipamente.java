package MainApp;

public class Echipamente {

    private String denumire;
    private int nr_inv;
    private float pret;
    private String zona;
    private Stare stare;

    public Echipamente(String denumire,int nr_inv,float pret,String zona,Stare stare)

    public String getDenumire() {
        return denumire;
    }

    public Stare getStare() {
        return stare;

    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    @Override
    public String toString() {
        return "Echipamente{" + "denumire='" + denumire + '\'' + ", stare=" + stare + '}';
    }
}
