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

    @ManyToOne
    @JoinColumn(name = "idTrainer",nullable = false)
    private Trainer idTrainer;

    public Calificaciones(){
        super();
    }

    public Calificaciones(int idCalificacion, String calificado, Trainer idTrainer) {
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

    public Trainer getIdTrainer() {
        return idTrainer;
    }

    public void setIdTrainer(Trainer idTrainer) {
        this.idTrainer = idTrainer;
    }
}