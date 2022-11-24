package pe.edu.upc.energypassion.serviceinterface;
import pe.edu.upc.energypassion.entities.TipoSuscripcion;


import java.util.List;

public interface ITipoSuscripcionService {

    public void insert(TipoSuscripcion tiposuscripcion);
    List<TipoSuscripcion> list();
    public void delete(int idTipoSuscripcion);
    List<TipoSuscripcion> search(int idTipoSuscripcion);
}