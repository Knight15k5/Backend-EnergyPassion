package pe.edu.upc.energypassion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.energypassion.entities.Suscripcion;
import pe.edu.upc.energypassion.serviceinterface.ISuscripcionService;

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
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){pService.delete(id);}
    @PutMapping
    public void modificar(@RequestBody Suscripcion p) { pService.insert(p);}
    @PostMapping("/buscar")
    public List<Suscripcion> buscar(@RequestBody Suscripcion t) {
        return pService.search(t.getDescripcion_plan());
    }
}
