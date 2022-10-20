package com.example.suscripcion.serviceinterfaces;

import com.example.suscripcion.entities.Suscripcion;

import java.util.List;

public interface ISuscripcionService {

    public void insert(Suscripcion suscripcion);
    List<Suscripcion> list();
}
