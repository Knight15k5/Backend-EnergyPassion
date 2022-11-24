package pe.edu.upc.energypassion.controllers;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;

import pe.edu.upc.energypassion.entities.TipoSuscripcion;
import pe.edu.upc.energypassion.serviceinterface.ITipoSuscripcionService;


@RestController
@RequestMapping("/tiposuscripcion")//conectar front con back
public class TipoSuscripcionController {

    @Autowired
    private ITipoSuscripcionService pService;

    @PostMapping
    public void registrar(@RequestBody TipoSuscripcion p) {
        pService.insert(p);
    }
    @GetMapping
    public List<TipoSuscripcion> listar() {
        return pService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){pService.delete(id);}
    @PutMapping
    public void modificar(@RequestBody TipoSuscripcion p) { pService.insert(p);}
    @PostMapping("/buscar")
    public List<TipoSuscripcion> buscar(@RequestBody TipoSuscripcion t) throws ParseException{

        return pService.search(t.getIdtiposuscripcion());
    }
}
