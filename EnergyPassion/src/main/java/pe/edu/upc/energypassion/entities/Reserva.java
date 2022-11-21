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
    private int idReserva;

    @Column(name = "Mensaje", length = 45, nullable = false)
    private String Mensaje;

    @Column(name = "Fecha", length = 45, nullable = false)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date Fecha;
    @Column(name = "Hora", length = 45, nullable = false)
    private String Hora;
    @ManyToOne
    @JoinColumn(name = "CLiente", nullable = false)
    private Cliente Cliente;

    @ManyToOne
    @JoinColumn(name = "Trainer", nullable = false)
    private Trainer Trainer;

    @ManyToOne
    @JoinColumn(name = "Rutinas", nullable = false)
    private Rutinas Rutinas;

    public Reserva(int idReserva, String mensaje, Date fecha, String hora, pe.edu.upc.energypassion.entities.Cliente cliente, pe.edu.upc.energypassion.entities.Trainer trainer, pe.edu.upc.energypassion.entities.Rutinas rutinas) {
        this.idReserva = idReserva;
        Mensaje = mensaje;
        Fecha = fecha;
        Hora = hora;
        Cliente = cliente;
        Trainer = trainer;
        Rutinas = rutinas;
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

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
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

    public pe.edu.upc.energypassion.entities.Rutinas getRutinas() {
        return Rutinas;
    }

    public void setRutinas(pe.edu.upc.energypassion.entities.Rutinas rutinas) {
        Rutinas = rutinas;
    }
}


