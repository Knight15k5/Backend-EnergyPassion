package pe.edu.upc.energypassion.serviceinterface;

import pe.edu.upc.energypassion.entities.Calificaciones;
import java.util.List;
import java.util.Optional;

public interface ICalificacionService {
    public  void     insert(Calificaciones calificacion);

    Optional<Calificaciones> listarId(int idCalificacion);

    List<Calificaciones> list();
    public void  delete(int idCalificacion);
    Optional<Calificaciones> listarid(int idCalificacion);
    List<Calificaciones>search(String nameCalificacion);
    List<Calificaciones>searchP(String nombre);
}
