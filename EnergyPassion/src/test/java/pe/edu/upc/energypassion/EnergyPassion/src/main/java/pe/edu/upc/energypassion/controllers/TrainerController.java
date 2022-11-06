package pe.edu.upc.energypassion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.energypassion.entities.Trainer;
import pe.edu.upc.energypassion.serviceinterface.ITrainerService;

import java.util.List;

@RestController
@RequestMapping("/trainers")

public class TrainerController {
    @Autowired
    private ITrainerService tService;

    @PostMapping
    public void registrar(@RequestBody Trainer t){
        tService.insert(t);
    }
    @GetMapping
    public List<Trainer>list(){
        return tService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){tService.delete(id);}
    @PutMapping
    public void modificar(@RequestBody Trainer t) { tService.insert(t);}
    @PostMapping("/buscar")
    public List<Trainer> buscar(@RequestBody Trainer t) {
        return tService.search(t.getNombre());
    }
}
