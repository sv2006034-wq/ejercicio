
package ejerciciopog;


public class Arbusto extends Planta{
private double anchArbus;
private boolean Domestico;
private String VariArbus;
private String coHo;
private double sePodaNo;

    public Arbusto() {
    }

    public Arbusto(double anchArbus, boolean Domestico, String VariArbus, String coHo, double sePodaNo, String nom, double altTallo, boolean hojas, String CliIdeal) {
        super(nom, altTallo, hojas, CliIdeal);
        this.anchArbus = anchArbus;
        this.Domestico = Domestico;
        this.VariArbus = VariArbus;
        this.coHo = coHo;
        this.sePodaNo = sePodaNo;
    }

    public double getAnchArbus() {
        return anchArbus;
    }

    public void setAnchArbus(double anchArbus) {
        this.anchArbus = anchArbus;
    }

    public boolean isDomestico() {
        return Domestico;
    }

    public void setDomestico(boolean Domestico) {
        this.Domestico = Domestico;
    }

    public String getVariArbus() {
        return VariArbus;
    }

    public void setVariArbus(String VariArbus) {
        this.VariArbus = VariArbus;
    }

    public String getCoHo() {
        return coHo;
    }

    public void setCoHo(String coHo) {
        this.coHo = coHo;
    }

    public double getSePodaNo() {
        return sePodaNo;
    }

    public void setSePodaNo(double sePodaNo) {
        this.sePodaNo = sePodaNo;
    }
    

    @Override
    public void soyUn() {
        System.out.println("Hola we soy un arbusto we");
    }
    
}
