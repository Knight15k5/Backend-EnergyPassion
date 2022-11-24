package pe.edu.upc.energypassion.entities;

import java.time.format.SignStyle;

public class Respuesta {
    private String trainer;
    private String calificaiones;
    private String rutinas;

    public Respuesta(String trainer, String calificaiones, String rutinas) {
        this.trainer = trainer;
        this.calificaiones = calificaiones;
        this.rutinas = rutinas;
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

}
