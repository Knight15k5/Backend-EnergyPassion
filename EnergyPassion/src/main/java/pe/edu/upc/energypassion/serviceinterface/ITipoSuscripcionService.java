package pe.edu.upc.energypassion.serviceinterface;
import pe.edu.upc.energypassion.entities.Tipo_Suscripcion;


import java.util.List;
public interface ITipoSuscripcionService {

    public void insert(Tipo_Suscripcion tipo_suscripcion);
    List<Tipo_Suscripcion>list();
    public void delete(int idTipoSuscripcion);
    List<Tipo_Suscripcion> search(int idTipoSuscripcion);
}
