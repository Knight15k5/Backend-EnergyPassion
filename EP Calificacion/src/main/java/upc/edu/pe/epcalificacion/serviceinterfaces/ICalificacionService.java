package upc.edu.pe.epcalificacion.serviceinterfaces;

import upc.edu.pe.epcalificacion.entities.Calificaciones;

import java.util.List;

public interface ICalificacionService {
    public  void     insert(Calificaciones calificacion);
    List<Calificaciones> list();
}
