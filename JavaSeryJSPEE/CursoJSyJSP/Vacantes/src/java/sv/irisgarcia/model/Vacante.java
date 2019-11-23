
package sv.irisgarcia.model;

import java.util.Date;

public class Vacante {
    private int id;
    private Date fechapublicacion;
    private String nombre;
    private String descripcion;
    private String detalle;

    public Vacante(int id) {
        //asignamos la fecha del servidor
        this.fechapublicacion=new Date();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(Date fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Vacante{" + "id=" + id + ", fechapublicacion=" + fechapublicacion + ", nombre=" + nombre + ", descripcion=" + descripcion + ", detalle=" + detalle + '}';
    }
    
    
    
}
