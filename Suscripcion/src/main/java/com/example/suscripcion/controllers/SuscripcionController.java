package com.example.suscripcion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.suscripcion.entities.Suscripcion;
import com.example.suscripcion.serviceinterfaces.ISuscripcionService;

import java.util.List;
@RestController
@RequestMapping("/suscripcion")

public class SuscripcionController {
    @Autowired
    private ISuscripcionService pService;

    @PostMapping
    public void registrar(@RequestBody Suscripcion p) {
        pService.insert(p);
    }
    @GetMapping
    public List<Suscripcion> listar() {
        return pService.list();
    }

}
