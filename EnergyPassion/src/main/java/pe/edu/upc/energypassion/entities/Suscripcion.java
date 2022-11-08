package pe.edu.upc.energypassion.entities;
import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name = "Suscripcion")
public class Suscripcion implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSuscripcion;
    @Column(name = "Precio_del_plan",length = 45,nullable = false)
    private int Precio_del_plan;
    @Column(name = "Descripcion_plan",length = 45,nullable = false)
    private String Descripcion_plan;

    @ManyToOne
    @JoinColumn(name = "idTipo_Suscripcion", nullable = false)
    private Tipo_Suscripcion Tipo_Suscripcion;



    public Suscripcion() {
    }

    public Suscripcion(int idSuscripcion, int precio_del_plan, String descripcion_plan, Tipo_Suscripcion tipo_suscripcion) {
        this.idSuscripcion = idSuscripcion;
        this.Precio_del_plan = precio_del_plan;
        this.Descripcion_plan = descripcion_plan;
        this.Tipo_Suscripcion = Tipo_Suscripcion;
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


    public Tipo_Suscripcion getTipo_suscripcion() {
        return Tipo_Suscripcion;
    }

    public void setTipo_suscripcion(Tipo_Suscripcion Tipo_suscripcion) {
        this.Tipo_Suscripcion = Tipo_Suscripcion;
    }
}