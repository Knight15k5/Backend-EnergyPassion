package com.example.trainer.serviceinterfaces;

import com.example.trainer.entities.Rutinas;

import java.util.List;

public interface IRutinasService {

    public void insert(Rutinas rutinas);
    List<Rutinas>list();
    public void delete(int idRutinas);

    List<Rutinas>search(String Tren_superior);
}
