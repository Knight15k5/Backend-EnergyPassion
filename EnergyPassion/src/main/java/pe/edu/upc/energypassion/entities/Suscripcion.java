package pe.edu.upc.energypassion.entities;
import javax.persistence.*;
import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name = "suscripcion")
public class Suscripcion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idsuscripcion;
    @Column(name = "precio_plan", length = 45, nullable = false)
    private int precio_plan;
    @Column(name = "descripcion_plan", length = 45, nullable = false)
    private String descripcion_plan;

    @ManyToOne
    @JoinColumn(name = "idtiposuscripcion", nullable = false)//revisar las columnas y filas
    private TipoSuscripcion tiposuscripcion;

    public Suscripcion(int idsuscripcion, int precio_plan, String descripcion_plan, TipoSuscripcion tiposuscripcion) {
        this.idsuscripcion = idsuscripcion;
        this.precio_plan = precio_plan;
        this.descripcion_plan = descripcion_plan;
        this.tiposuscripcion = tiposuscripcion;
    }

    public Suscripcion() {
        super();
    }


    public int getIdsuscripcion() {
        return idsuscripcion;
    }

    public void setIdsuscripcion(int idsuscripcion) {
        this.idsuscripcion = idsuscripcion;
    }

    public int getPrecio_plan() {
        return precio_plan;
    }

    public void setPrecio_plan(int precio_plan) {
        this.precio_plan = precio_plan;
    }

    public String getDescripcion_plan() {
        return descripcion_plan;
    }

    public void setDescripcion_plan(String descripcion_plan) {
        this.descripcion_plan = descripcion_plan;
    }

    public TipoSuscripcion getTiposuscripcion() {
        return tiposuscripcion;
    }

    public void setTiposuscripcion(TipoSuscripcion tiposuscripcion) {
        this.tiposuscripcion = tiposuscripcion;
    }
}