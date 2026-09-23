
package ejerciciopog;

public class Arbol extends Planta{
private String variedad;
private String tipoTronco;
private double radopTronco;
private String color;
private String tipoHojas;

    public Arbol() {
    }

    public Arbol(String variedad, 
            String tipoTronco, 
            double radopTronco, String color, 
            String tipoHojas, String nom, double altTallo, boolean hojas, String CliIdeal) {
        super(nom, 
                altTallo, 
                hojas, 
                CliIdeal);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.radopTronco = radopTronco;
        this.color = color;
        this.tipoHojas = tipoHojas;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public double getRadopTronco() {
        return radopTronco;
    }

    public void setRadopTronco(double radopTronco) {
        this.radopTronco = radopTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoHojas() {
        return tipoHojas;
    }

    public void setTipoHojas(String tipoHojas) {
        this.tipoHojas = tipoHojas;
    }

    

@Override
    public void soyUn() {
        System.out.println("Hola we soy un árbol we");
    }
    
}
