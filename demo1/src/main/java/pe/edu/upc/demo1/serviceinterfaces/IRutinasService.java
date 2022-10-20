package pe.edu.upc.demo1.serviceinterfaces;

import pe.edu.upc.demo1.entities.Rutinas;

import java.util.List;

public interface IRutinasService {

    public void insert(Rutinas rutinas);
    List<Rutinas>list();
}
