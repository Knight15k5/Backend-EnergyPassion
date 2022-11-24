package pe.edu.upc.energypassion.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.energypassion.serviceinterface.ICalificacionService;
import pe.edu.upc.energypassion.entities.Calificaciones;

import java.text.ParseException;
import java.util.List;
@RestController
@RequestMapping("/calificacion")

public class CalificacionesController {
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
    @DeleteMapping("/{id}")
    public  void  eliminar(@PathVariable("/id")Integer id){pS.delete(id);}
    @PutMapping
    public void  modificar(@RequestBody Calificaciones c){
        pS.insert(c);}
    @PostMapping("/buscar")
    public List<Calificaciones> buscar(@RequestBody Calificaciones c)throws ParseException
    {return pS.search(c.getCalificado());}
}
