package pe.edu.upc.energypassion.entities;

import javax.persistence.*;

@Entity
@Table(name = "Rutinas")
public class Rutinas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRutinas;

    @ManyToOne
    @JoinColumn(name = "idTrainer", nullable = false)
    private Trainer trainer;

    @Column(name = "Tren_superior", length = 45, nullable = false)
    private String Tren_superior;

    @Column(name = "Tren_inferior", length = 45, nullable = false)
    private String Tren_inferior;

    @Column(name = "Tiempo", length = 45, nullable = false)
    private int tiempo;

    public Rutinas() {
    }

    public Rutinas(int idRutinas, String tren_superior, String tren_inferior, int tiempo, Trainer trainer) {
        this.idRutinas = idRutinas;
        this.Tren_superior = tren_superior;
        this.Tren_inferior = tren_inferior;
        this.tiempo = tiempo;
        this.trainer =trainer;
    }

    public int getIdRutinas() {
        return idRutinas;
    }

    public void setIdRutinas(int idRutinas) {
        this.idRutinas = idRutinas;
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

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
}