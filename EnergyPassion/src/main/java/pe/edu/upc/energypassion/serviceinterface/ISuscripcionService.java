package pe.edu.upc.energypassion.serviceinterface;

import pe.edu.upc.energypassion.entities.Suscripcion;

import java.util.List;

public interface ISuscripcionService {

    public void insert(Suscripcion suscripcion);
    List<Suscripcion> list();

/*    Optional<Suscripcion> listarId(int idSuscripcion);*/
    public void delete(int idSuscripcion);
    List<Suscripcion> search(String  nameSuscripcion);
}
