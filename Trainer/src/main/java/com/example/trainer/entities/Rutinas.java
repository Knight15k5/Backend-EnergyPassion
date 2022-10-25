package com.example.trainer.entities;

import javax.persistence.*;

@Entity
@Table(name = "Rutinas")
public class Rutinas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRutinas;

    @Column(name = "Trainer_id", length = 45, nullable = false)
    private int Trainer_id;

    @Column(name = "Tren_superior", length = 45, nullable = false)
    private String Tren_superior;

    @Column(name = "Tren_inferior", length = 45, nullable = false)
    private String Tren_inferior;

    @Column(name = "Tiempo", length = 45, nullable = false)
    private int tiempo;

    public Rutinas() {
    }

    public Rutinas(int idRutinas, int trainer_id, String tren_superior, String tren_inferior, int tiempo) {
        this.idRutinas = idRutinas;
        this.Trainer_id = trainer_id;
        this.Tren_superior = tren_superior;
        this.Tren_inferior = tren_inferior;
        this.tiempo = tiempo;
    }

    public int getIdRutinas() {
        return idRutinas;
    }

    public void setIdRutinas(int idRutinas) {
        this.idRutinas = idRutinas;
    }

    public int getTrainer_id() {
        return Trainer_id;
    }

    public void setTrainer_id(int trainer_id) {
        Trainer_id = trainer_id;
    }

    public String getTren_superior() {
        return Tren_superior;
    }

    public void setTren_superior(String tren_superior) {
        Tren_superior = tren_superior;
    }

    public String getTren_inferior() {
        return Tren_inferior;
    }

    public void setTren_inferior(String tren_inferior) {
        Tren_inferior = tren_inferior;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

}