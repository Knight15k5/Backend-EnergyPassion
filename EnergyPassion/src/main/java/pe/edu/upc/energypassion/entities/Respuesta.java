package pe.edu.upc.energypassion.entities;

import java.time.format.SignStyle;

public class Respuesta {
    private String trainer;
    private String calificaiones;
    private String rutinas;
    private String clientes;
    private String suscripcion;

    public Respuesta(String trainer, String calificaiones, String rutinas, String clientes, String suscripcion) {
        this.trainer = trainer;
        this.calificaiones = calificaiones;
        this.rutinas = rutinas;
        this.clientes = clientes;
        this.suscripcion = suscripcion;
    }

    public Respuesta() {

    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getCalificaiones() {
        return calificaiones;
    }

    public void setCalificaiones(String calificaiones) {
        this.calificaiones = calificaiones;
    }

    public String getRutinas() {
        return rutinas;
    }

    public void setRutinas(String rutinas) {
        this.rutinas = rutinas;
    }

    public String getClientes() {
        return clientes;
    }

    public void setClientes(String clientes) {
        this.clientes = clientes;
    }

    public String getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }
}
