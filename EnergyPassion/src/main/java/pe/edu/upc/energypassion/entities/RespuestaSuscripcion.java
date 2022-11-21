package pe.edu.upc.energypassion.entities;

import java.time.format.SignStyle;

public class RespuestaSuscripcion {
    private String suscripcion;
    private String tipoSuscripcion;

    public RespuestaSuscripcion(String suscripcion, String tipoSuscripcion) {
        this.suscripcion = suscripcion;
        this.tipoSuscripcion = tipoSuscripcion;
    }

    public RespuestaSuscripcion() {
    }

    public String getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }

    public String getTipoSuscripcion() {
        return tipoSuscripcion;
    }

    public void setTipoSuscripcion(String tipoSuscripcion) {
        this.tipoSuscripcion = tipoSuscripcion;
    }
}
