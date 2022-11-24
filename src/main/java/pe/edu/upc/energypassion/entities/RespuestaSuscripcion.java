package pe.edu.upc.energypassion.entities;

import java.time.format.SignStyle;

public class RespuestaSuscripcion {
    private String suscripcion;
    private String tiposuscripcion;

    public RespuestaSuscripcion(String suscripcion, String tiposuscripcion) {
        this.suscripcion = suscripcion;
        this.tiposuscripcion = tiposuscripcion;
    }

    public RespuestaSuscripcion() {
    }

    public String getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }

    public String getTiposuscripcion() {
        return tiposuscripcion;
    }

    public void setTiposuscripcion(String tiposuscripcion) {
        this.tiposuscripcion = tiposuscripcion;
    }


}