
package Modelo;


public class Responsable {
    
    private int idResponsable;
    private String nomResponsable;

    public Responsable(int idResponsable, String nomResponsable) {
        this.idResponsable = idResponsable;
        this.nomResponsable = nomResponsable;
    }

    public int getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    public String getNomResponsable() {
        return nomResponsable;
    }

    public void setNomResponsable(String nomResponsable) {
        this.nomResponsable = nomResponsable;
    }

    @Override
    public String toString() {
        return idResponsable + ", " + nomResponsable;
    }
    
    
    
}
