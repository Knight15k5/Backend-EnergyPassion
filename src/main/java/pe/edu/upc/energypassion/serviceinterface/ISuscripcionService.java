package pe.edu.upc.energypassion.serviceinterface;

import pe.edu.upc.energypassion.entities.RespuestaSuscripcion;
import pe.edu.upc.energypassion.entities.Suscripcion;
import java.util.List;
import java.util.Optional;
public interface ISuscripcionService {

    public void insert(Suscripcion suscripcion);

    /*  Optional<Suscripcion> listarId(int idSuscripcion);*/
    List<Suscripcion> list();
    public void delete(int idSuscripcion);
    List<Suscripcion> search(String  nameSuscripcion);

    List<RespuestaSuscripcion> buscarComplejo();
}
