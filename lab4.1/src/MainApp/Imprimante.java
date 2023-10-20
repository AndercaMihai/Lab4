package MainApp;

public class Imprimante extends Echipamente{
    private int ppm;
    private int rezolutie;
    private int p_car;
    private String modTiparire;

    public Imprimante(String denumire,int nr_inv,float pret,String zona,Stare stare,int ppm,int rezolutie, int p_car, String modTiparire){
        this.ppm=ppm;
        this.rezolutie=rezolutie;
        this.p_car=p_car;
        this.modTiparire=modTiparire;

    }
    public int getPpm(){
        return ppm;
    }
    public int getRezolutie(){
        return rezolutie;
    }
    public int getP_car(){
        return p_car;
    }
    public String getModTiparire(){
        return modTiparire;
    }

    public void afisareimprimante() {
        System.out.println("Imprimanta:");
        System.out.println("Pagini pe minut : " + ppm);
        System.out.println("Rezoluție : " + rezolutie);
        System.out.println("Pagini per cartus: " + p_car);
        System.out.println("Mod de tiparire: " + modTiparire);
    }
}
