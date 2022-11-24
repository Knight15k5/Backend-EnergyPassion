package pe.edu.upc.energypassion.entities;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;

import  javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Reserva")
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idreserva;

    @Column(name = "Mensaje", length = 45, nullable = false)
    private String mensaje;

    @Column(name = "Fecha", length = 45, nullable = false)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date fecha;
    @Column(name = "Hora", length = 45, nullable = false)
    private String hora;
    @ManyToOne
    @JoinColumn(name = "CLiente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "Trainer", nullable = false)
    private Trainer trainer;

    @ManyToOne
    @JoinColumn(name = "Rutinas", nullable = false)
    private Rutinas rutinas;

    public Reserva(int idreserva, String mensaje, Date fecha, String hora, Cliente cliente, Trainer trainer, Rutinas rutinas) {
        this.idreserva = idreserva;
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.trainer = trainer;
        this.rutinas = rutinas;
    }

    public Reserva() {
        super();
    }

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Rutinas getRutinas() {
        return rutinas;
    }

    public void setRutinas(Rutinas rutinas) {
        this.rutinas = rutinas;
    }
}


