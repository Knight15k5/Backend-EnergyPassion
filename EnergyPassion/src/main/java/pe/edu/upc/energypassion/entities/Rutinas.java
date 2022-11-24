package pe.edu.upc.energypassion.entities;

import javax.persistence.*;

@Entity
@Table(name = "Rutinas")
public class Rutinas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idrutinas;
    @Column(name = "Tren_superior", length = 45, nullable = false)
    private String tren_superior;

    public Rutinas(int idrutinas, String tren_superior, String tren_inferior, int tiempo) {
        this.idrutinas = idrutinas;
        this.tren_superior = tren_superior;
        this.tren_inferior = tren_inferior;
        this.tiempo = tiempo;
    }

    @Column(name = "Tren_inferior", length = 45, nullable = false)
    private String tren_inferior;

    @Column(name = "Tiempo", length = 45, nullable = false)
    private int tiempo;

    public Rutinas() {
        super();
    }


    public int getIdrutinas() {
        return idrutinas;
    }

    public void setIdrutinas(int idrutinas) {
        this.idrutinas = idrutinas;
    }

    public String getTren_superior() {
        return tren_superior;
    }

    public void setTren_superior(String tren_superior) {
        this.tren_superior = tren_superior;
    }

    public String getTren_inferior() {
        return tren_inferior;
    }

    public void setTren_inferior(String tren_inferior) {
        this.tren_inferior = tren_inferior;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
}