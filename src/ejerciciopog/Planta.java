
package ejerciciopog;


public abstract class Planta {
    private String nom;
    private double altTallo;
    private boolean hojas;
    private String CliIdeal;

    public Planta() {
    }

    public Planta(String nom, double altTallo, boolean hojas, String CliIdeal) {
        this.nom = nom;
        this.altTallo = altTallo;
        this.hojas = hojas;
        this.CliIdeal = CliIdeal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getAltTallo() {
        return altTallo;
    }

    public void setAltTallo(double altTallo) {
        this.altTallo = altTallo;
    }

    public boolean isHojas() {
        return hojas;
    }

    public void setHojas(boolean hojas) {
        this.hojas = hojas;
    }

    public String getCliIdeal() {
        return CliIdeal;
    }

    public void setCliIdeal(String CliIdeal) {
        this.CliIdeal = CliIdeal;
    }
    public abstract void soyUn();
}
