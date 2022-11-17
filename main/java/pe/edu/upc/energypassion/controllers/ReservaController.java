package pe.edu.upc.energypassion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.energypassion.entities.Rutinas;
import pe.edu.upc.energypassion.entities.Trainer;
import pe.edu.upc.energypassion.entities.Cliente;
import pe.edu.upc.energypassion.entities.Reserva;
import pe.edu.upc.energypassion.serviceinterface.IReservaService;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/reserva")
public class ReservaController {
    @Autowired
    private IReservaService ps;

    @PostMapping
    public  void registrar(@RequestBody Reserva r){
        ps.insertar(r);
    }
    @GetMapping
    public List<Reserva> listar(){return ps.listar();}
    @DeleteMapping("/id")
    public  void  eliminar(@PathVariable("id") Integer id){ps.eliminar(id);}
    @PutMapping
    public void modificar(@RequestBody Reserva r){ps.insertar(r);}
    @PostMapping("/buscar")
    public  List<Reserva> buscar(@RequestBody Reserva r) throws ParseException {
        List<Reserva> listaR;
        listaR = ps.buscar(r.getMensaje());
        if (listaR.isEmpty()) {

            listaR = ps.buscarCliente(r.getCliente().getNombre());
        }
        if (listaR.isEmpty()) {

            listaR = ps.buscarTrainer(r.getTrainer().getNombre());
        }

        return listaR;
    }

}
