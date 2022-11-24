package pe.edu.upc.energypassion.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
@Entity
@Table(name = "calificacion")
public class Calificaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcalificacion;
    @Column(name = "calificadocliente", length = 45, nullable = false)
    private String calificado;//la calificacion que se le da al trainer
    @ManyToOne
    @JoinColumn(name = "idcliente", nullable = false)
    private  Cliente cliente;

    public Calificaciones(int idcalificacion, String calificado, Cliente cliente) {
        this.idcalificacion = idcalificacion;
        this.calificado = calificado;
        this.cliente = cliente;
    }

    public Calificaciones() {
        super();
    }


    public int getIdcalificacion() {
        return idcalificacion;
    }

    public void setIdcalificacion(int idcalificacion) {
        this.idcalificacion = idcalificacion;
    }

    public String getCalificado() {
        return calificado;
    }

    public void setCalificado(String calificado) {
        this.calificado = calificado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}