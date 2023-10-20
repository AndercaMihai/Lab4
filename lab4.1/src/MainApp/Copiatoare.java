package MainApp;

public class Copiatoare {
    private int p_ton;
    private String format;

    public Copiatoare(int p_ton, String format){
        this.p_ton=p_ton;
        this.format=format;
    }

    public int getp_ton(){
        return p_ton;
    }
    public String getFormat(){
        return  format;
    }
    public void afisareCopiatoare() {
        System.out.println("Copiator:");
        System.out.println("Pagini pe toner : " + p_ton);
        System.out.println("Format : " + format);

    }
}
