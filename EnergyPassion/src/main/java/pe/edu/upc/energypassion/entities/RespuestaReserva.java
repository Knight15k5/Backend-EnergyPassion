package pe.edu.upc.energypassion.entities;

import java.util.Date;

public class RespuestaReserva {

    private String reserva;

    private String clientes;

    private String trainer;

    private String rutinas;

    public RespuestaReserva(String reserva, String clientes, String trainer, String rutinas) {
        this.reserva = reserva;
        this.clientes = clientes;
        this.trainer = trainer;
        this.rutinas = rutinas;
    }

    public RespuestaReserva() {

    }

    public String getReserva() {
        return reserva;
    }

    public void setReserva(String reserva) {
        this.reserva = reserva;
    }

    public String getClientes() {
        return clientes;
    }

    public void setClientes(String clientes) {
        this.clientes = clientes;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getRutinas() {
        return rutinas;
    }

    public void setRutinas(String rutinas) {
        this.rutinas = rutinas;
    }
}
