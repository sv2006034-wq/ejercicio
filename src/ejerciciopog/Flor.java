
package ejerciciopog;


public class Flor extends Planta{
private String coPeta;
private int cantPeta;
private String coNose;
private String variedad;
private String estFlore;

    public Flor() {
    }

    public Flor(String coPeta, int cantPeta, String coNose, String variedad, String estFlore, String nom, double altTallo, boolean hojas, String CliIdeal) {
        super(nom, altTallo, hojas, CliIdeal);
        this.coPeta = coPeta;
        this.cantPeta = cantPeta;
        this.coNose = coNose;
        this.variedad = variedad;
        this.estFlore = estFlore;
    }

    public String getCoPeta() {
        return coPeta;
    }

    public void setCoPeta(String coPeta) {
        this.coPeta = coPeta;
    }

    public int getCantPeta() {
        return cantPeta;
    }

    public void setCantPeta(int cantPeta) {
        this.cantPeta = cantPeta;
    }

    public String getCoNose() {
        return coNose;
    }

    public void setCoNose(String coNose) {
        this.coNose = coNose;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getEstFlore() {
        return estFlore;
    }

    public void setEstFlore(String estFlore) {
        this.estFlore = estFlore;
    }
    


    @Override
    public void soyUn() {
        System.out.println("Hola we soy una flor we"); 
    }
    
}
