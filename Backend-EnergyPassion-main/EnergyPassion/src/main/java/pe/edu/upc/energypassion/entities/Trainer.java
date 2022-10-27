package pe.edu.upc.energypassion.entities;

import javax.persistence.*;

@Entity
@Table(name = "Trainer")
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTrainer;
    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;
    public Trainer() {
    }
    public Trainer(int idTrainer, String nombre) {
        this.idTrainer = idTrainer;
        this.nombre = nombre;
    }

    public int getIdTrainer() {
        return idTrainer;
    }

    public void setIdTrainer(int idTrainer) {
        this.idTrainer = idTrainer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
