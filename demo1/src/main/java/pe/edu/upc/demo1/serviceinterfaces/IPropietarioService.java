package pe.edu.upc.demo1.serviceinterfaces;


import pe.edu.upc.demo1.entities.Propietario;

import java.util.List;

public interface IPropietarioService {

    public void insert(Propietario propietario);
    List<Propietario>list();
}
