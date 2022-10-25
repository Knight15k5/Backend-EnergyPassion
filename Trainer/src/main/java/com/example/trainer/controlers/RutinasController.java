package com.example.trainer.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.trainer.entities.Rutinas;
import com.example.trainer.serviceinterfaces.IRutinasService;

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
    @DeleteMapping("/{id]")
    public void eliminar(@PathVariable("id")Integer id){
        pService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Rutinas r) {pService.insert(r);}

    @PostMapping("/buscar")
    public  List<Rutinas> buscar(@RequestBody Rutinas r){
        return  pService.search(r.getTren_superior());
    }

}
