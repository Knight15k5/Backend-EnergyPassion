package upc.edu.pe.epcalificacion.controllers;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import upc.edu.pe.epcalificacion.entities.Calificaciones;
import upc.edu.pe.epcalificacion.serviceinterfaces.ICalificacionService;

import java.util.List;
@RestController
@RequestMapping("/calificaciones")

public class CalificacionController {
    @Autowired
    private ICalificacionService pS;
    @PostMapping
    public void registrar (@RequestBody Calificaciones c){
        pS.insert(c);
    }
    @GetMapping
    public List<Calificaciones> list(){
        return pS.list();
    }
}
