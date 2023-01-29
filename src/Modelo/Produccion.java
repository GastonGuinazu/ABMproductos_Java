
package Modelo;


public class Produccion {
    
    private int idProduccion;
    private Componente componente;
    private Responsable responsable;
    private String fecha;
    private int cantidadProduccion;

    public Produccion(int idProduccion, Componente componente, Responsable responsable, String fecha, int cantidadProduccion) {
        this.idProduccion = idProduccion;
        this.componente = componente;
        this.responsable = responsable;
        this.fecha = fecha;
        this.cantidadProduccion = cantidadProduccion;
    }

    public Produccion(Componente componente, Responsable responsable, String fecha, int cantidadProduccion) {
        this.componente = componente;
        this.responsable = responsable;
        this.fecha = fecha;
        this.cantidadProduccion = cantidadProduccion;
    }

    public int getIdProduccion() {
        return idProduccion;
    }

    public void setIdProduccion(int idProduccion) {
        this.idProduccion = idProduccion;
    }

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidadProduccion() {
        return cantidadProduccion;
    }

    public void setCantidadProduccion(int cantidadProduccion) {
        this.cantidadProduccion = cantidadProduccion;
    }

    @Override
    public String toString() {
        return  idProduccion + ", " + componente + ", " + responsable + ", " + fecha + ", " + cantidadProduccion;
    }
    
    
    
}
