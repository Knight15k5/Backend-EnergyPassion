package pe.edu.upc.energypassion.entities;

import java.time.format.SignStyle;

public class RespuestaCliente {

    private String clientes;

    private String rutinas;

    private String suscripcion;

    public RespuestaCliente(String clientes, String rutinas, String suscripcion) {
        this.clientes = clientes;
        this.rutinas = rutinas;
        this.suscripcion = suscripcion;
    }

    public RespuestaCliente() {

    }

    public String getClientes() {
        return clientes;
    }

    public void setClientes(String clientes) {
        this.clientes = clientes;
    }

    public String getRutinas() {
        return rutinas;
    }

    public void setRutinas(String rutinas) {
        this.rutinas = rutinas;
    }

    public String getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }
}
