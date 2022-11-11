package pe.edu.upc.energypassion.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Calificaiones")
public class Calificaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCalificacion;
    @Column(name = "calificadotrainer",length = 45,nullable = false)
    private String calificado;
    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false)
    private Cliente cliente;

    public Calificaciones(){
    }

    public Calificaciones(int idCalificacion, String calificado, Cliente cliente) {
        this.idCalificacion = idCalificacion;
        this.calificado = calificado;
        this.cliente=cliente;
    }

    public int getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public String getCalificado() {
        return calificado;
    }

    public void setCalificado(String calificado) {
        this.calificado = calificado;
    }

    public Cliente getCliente() {return cliente;}

    public void setCliente(Cliente cliente) {this.cliente = cliente;}
}