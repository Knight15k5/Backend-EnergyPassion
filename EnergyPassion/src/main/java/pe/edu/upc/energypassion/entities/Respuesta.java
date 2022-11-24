package pe.edu.upc.energypassion.entities;

import java.time.format.SignStyle;

public class Respuesta {
    private String trainer;
    private String calificaciones;
    private String rutinas;

    public Respuesta(String trainer, String calificaciones, String rutinas) {
        this.trainer = trainer;
        this.calificaciones = calificaciones;
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

    public String getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(String calificaciones) {
        this.calificaciones = calificaciones;
    }

    public String getRutinas() {
        return rutinas;
    }

    public void setRutinas(String rutinas) {
        this.rutinas = rutinas;
    }
}
