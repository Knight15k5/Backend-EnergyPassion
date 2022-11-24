package pe.edu.upc.energypassion.serviceinterface;

import pe.edu.upc.energypassion.entities.Calificaciones;
import java.util.List;

public interface ICalificacionService {
    public  void insert(Calificaciones calificacion);
    List<Calificaciones> list();
    public void  delete(int idcalificacion);
    List<Calificaciones>search(String calificado);
}
