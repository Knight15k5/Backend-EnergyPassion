package com.example.suscripcion.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.suscripcion.entities.Suscripcion;
import com.example.suscripcion.repositories.ISuscripcionRepository;
import com.example.suscripcion.serviceinterfaces.ISuscripcionService;


import java.util.List;

@Service

public class SuscripcionServiceImpl implements ISuscripcionService{
    @Autowired
    private ISuscripcionRepository sR;
    @Override
    public void insert(Suscripcion suscripcion) {
        sR.save(suscripcion);
    }

    @Override
    public List<Suscripcion> list() {
        return sR.findAll();
    }




}
