package com.example.trainer.entities;

import javax.persistence.*;

@Entity
@Table(name="Trainer")

public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTrainer;
    @Column(name = "horario", length = 45, nullable = false)
    private String horario;

    public Trainer() {
    }

    public Trainer(int idTrainer, String horario) {
        this.idTrainer = idTrainer;
        this.horario = horario;
    }

    public int getIdTrainer() {
        return idTrainer;
    }

    public void setIdTrainer(int idTrainer) {
        this.idTrainer = idTrainer;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
