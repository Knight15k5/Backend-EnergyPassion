package pe.edu.upc.energypassion.controllers;

import java.text.ParseException;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.energypassion.entities.Cliente;
import pe.edu.upc.energypassion.serviceinterface.IClienteService;
import pe.edu.upc.energypassion.entities.Suscripcion;
import pe.edu.upc.energypassion.entities.Rutinas;


import java.util.List;

@RestController
@RequestMapping("/clientes")

public class ClienteController {
    @Autowired
    private IClienteService ClService;

    @PostMapping
    public void registrar(@RequestBody Cliente t){
        ClService.insert(t);
    }
    @GetMapping
    public List<Cliente>list(){
        return ClService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ClService.delete(id);}
    @PutMapping
    public void modificar(@RequestBody Cliente t) { ClService.insert(t);}
    @PostMapping("/buscar")
    public List<Cliente> buscar(@RequestBody Cliente t) throws ParseException {
        return ClService.search(t.getNombre());
    }
}
