package pe.edu.upc.energypassion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.energypassion.entities.Tipo_Suscripcion;
import pe.edu.upc.energypassion.serviceinterface.ITipoSuscripcionService;

import java.text.ParseException;
import java.util.List;


@RestController
@RequestMapping("/tiposuscripcion")//conectar front con back
public class Tipo_SuscripcionController {

    @Autowired
    private ITipoSuscripcionService pService;

    @PostMapping
    public void registrar(@RequestBody Tipo_Suscripcion p) {
        pService.insert(p);
    }
    @GetMapping
    public List<Tipo_Suscripcion> listar() {
        return pService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){pService.delete(id);}
    @PutMapping
    public void modificar(@RequestBody Tipo_Suscripcion p) { pService.insert(p);}
    @PostMapping("/buscar")
    public List<Tipo_Suscripcion> buscar(@RequestBody Tipo_Suscripcion t) throws ParseException{

        return pService.search(t.getIdTipoSuscripcion());
    }


}
