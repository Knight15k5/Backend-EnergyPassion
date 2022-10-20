package com.example.suscripcion.entities;
import javax.persistence.*;

@Entity
@Table(name = "Suscripcion")
public class Suscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSuscripcion;
    @Column(name = "Precio_del_plan",length = 45,nullable = false)
    private int Precio_del_plan;
    @Column(name = "Descripcion_plan",length = 45,nullable = false)
    private String Descripcion_plan;
    @Column(name = "Tipo_suscripcion_id",length = 45,nullable = false)
    private int Tipo_suscripcion_id;

    public Suscripcion() {
    }

    public Suscripcion(int idSuscripcion, int precio_del_plan, String descripcion_plan) {
        this.idSuscripcion = idSuscripcion;
        this.Precio_del_plan = precio_del_plan;
        this.Descripcion_plan = descripcion_plan;
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

    public int getTipo_suscripcion_id() {
        return Tipo_suscripcion_id;
    }

    public void setTipo_suscripcion_id(int tipo_suscripcion_id) {
        Tipo_suscripcion_id = tipo_suscripcion_id;
    }
}