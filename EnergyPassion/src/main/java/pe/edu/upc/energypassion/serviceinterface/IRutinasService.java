package pe.edu.upc.energypassion.serviceinterface;

import pe.edu.upc.energypassion.entities.Rutinas;

import java.util.List;

public interface IRutinasService {

    public void insert(Rutinas rutinas);
    List<Rutinas>list();
    public void delete(int idRutinas);

    List<Rutinas>search(int idRutinas);
}
