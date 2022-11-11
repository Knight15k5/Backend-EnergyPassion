package pe.edu.upc.energypassion.entities;

import javax.persistence.*;

@Entity
@Table(name = "Calificaiones")
public class Calificaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCalificacion;
    @Column(name = "calificadotrainer",length = 45,nullable = false)
    private String calificado;
    @Column(name = "idTrainer",nullable = false)
    private int idTrainer;

    public Calificaciones(){
    }

    public Calificaciones(int idCalificacion, String calificado, int idTrainer) {
        this.idCalificacion = idCalificacion;
        this.calificado = calificado;
        this.idTrainer = idTrainer;
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

    public int getIdTrainer() {
        return idTrainer;
    }

    public void setIdTrainer(int idTrainer) {
        this.idTrainer = idTrainer;
    }
}