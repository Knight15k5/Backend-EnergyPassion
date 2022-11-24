package pe.edu.upc.energypassion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.energypassion.entities.Rutinas;
import pe.edu.upc.energypassion.serviceinterface.IRutinasService;

import java.util.List;
@RestController
@RequestMapping("/rutinas")
public class RutinasController {
    @Autowired
    private IRutinasService rService;

    @PostMapping
    public void registrar(@RequestBody Rutinas r) {
        rService.insert(r);
    }
    @GetMapping
    public List<Rutinas> listar() {
        return rService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        rService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Rutinas r) {rService.insert(r);}

    @PostMapping("/buscar")
    public  List<Rutinas> buscar(@RequestBody Rutinas r){
        return  rService.search(r.getIdrutinas());
    }

}