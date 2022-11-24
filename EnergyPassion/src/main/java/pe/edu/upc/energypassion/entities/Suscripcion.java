package pe.edu.upc.energypassion.entities;
import javax.persistence.*;
import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name = "Suscripcion")
public class Suscripcion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSuscripcion;
    @Column(name = "Precio_del_plan", length = 45, nullable = false)
    private int Precio_del_plan;
    @Column(name = "Descripcion_plan", length = 45, nullable = false)
    private String Descripcion_plan;

    @ManyToOne
    @JoinColumn(name = "idTipoSuscripcion", nullable = false)//revisar las columnas y filas
    private TipoSuscripcion TipoSuscripcion;

    public Suscripcion() {
        super();

    }

    public Suscripcion(int idSuscripcion, int precio_del_plan, String descripcion_plan, pe.edu.upc.energypassion.entities.TipoSuscripcion tipoSuscripcion) {
        this.idSuscripcion = idSuscripcion;
        Precio_del_plan = precio_del_plan;
        Descripcion_plan = descripcion_plan;
        TipoSuscripcion = tipoSuscripcion;
    }

    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public int getPrecio_del_plan() {
        return Precio_del_plan;
    }

    public void setPrecio_del_plan(int precio_del_plan) {
        Precio_del_plan = precio_del_plan;
    }

    public String getDescripcion_plan() {
        return Descripcion_plan;
    }

    public void setDescripcion_plan(String descripcion_plan) {
        Descripcion_plan = descripcion_plan;
    }

    public pe.edu.upc.energypassion.entities.TipoSuscripcion getTipoSuscripcion() {
        return TipoSuscripcion;
    }

    public void setTipoSuscripcion(pe.edu.upc.energypassion.entities.TipoSuscripcion tipoSuscripcion) {
        TipoSuscripcion = tipoSuscripcion;
    }
}