package pe.edu.upc.energypassion.entities;
import  javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Resreva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReserva;

    @Column(name = "Mensaje", length = 45, nullable = false)
    private String Mensaje;
    @Column(name = "Fecha", length = 45, nullable = false)
    private Date Fecha;
    @Column(name = "Hora", length = 45, nullable = false)
    private Time Hora;
    @ManyToOne
    @JoinColumn(name = "CLiente", nullable = false)
    private Cliente Cliente;

    @ManyToOne
    @JoinColumn(name = "Trainer", nullable = false)
    private Trainer Trainer;


    public Reserva(int idReserva, String Mensaje,Date Fecha, Time Hora, pe.edu.upc.energypassion.entities.Cliente idCliente, pe.edu.upc.energypassion.entities.Trainer idTrainer, pe.edu.upc.energypassion.entities.Rutinas idRutinas) {
        this.idReserva = idReserva;
        Fecha = Fecha;
        Hora = Hora;
        Cliente = Cliente;
        Trainer = Trainer;
        Mensaje = Mensaje;


    }

    public Reserva() {
        super();
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public Time getHora() {
        return Hora;
    }

    public void setHora(Time hora) {
        Hora = hora;
    }

    public pe.edu.upc.energypassion.entities.Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(pe.edu.upc.energypassion.entities.Cliente cliente) {
        Cliente = cliente;
    }

    public pe.edu.upc.energypassion.entities.Trainer getTrainer() {
        return Trainer;
    }

    public void setTrainer(pe.edu.upc.energypassion.entities.Trainer trainer) {
        Trainer = trainer;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }
}


