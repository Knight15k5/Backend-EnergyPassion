package pe.edu.upc.demo1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demo1.entities.Rutinas;
import pe.edu.upc.demo1.serviceinterfaces.IRutinasService;

import java.util.List;
@RestController
@RequestMapping("/rutinas")
public class RutinasController {
    @Autowired
    private IRutinasService pService;

    @PostMapping
    public void registrar(@RequestBody Rutinas r) {
        pService.insert(r);
    }
    @GetMapping
    public List<Rutinas> listar() {
        return pService.list();
    }
}
