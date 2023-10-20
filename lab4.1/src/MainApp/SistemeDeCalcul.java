package MainApp;

public class SistemeDeCalcul {
    private String tip_mon;
    private String viteza;
    private int c_HDD;
    private String sistemOperare;

    public SistemeDeCalcul(String tip_mon, String viteza, int c_HDD, String sistemOperare){
        this.tip_mon=tip_mon;
        this.viteza=viteza;
        this.c_HDD=c_HDD;
        this.sistemOperare=sistemOperare;
    }
    public String getTip_mon(){
        return tip_mon;
    }
    public String getViteza(){
        return viteza;
    }
    public int getC_HDD(){
        return c_HDD;
    }
    public String getSistemOperare(){
        return sistemOperare;
    }
    public void afisareSistemeDeCalcul() {
        System.out.println("Sistem de calcul:");
        System.out.println("Tip : " + tip_mon);
        System.out.println("Viteza : " + viteza);
        System.out.println("Capacitate: " + c_HDD);
        System.out.println("Sistem de operare: " + sistemOperare);
    }

}
