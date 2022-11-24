package pe.edu.upc.energypassion.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.energypassion.entities.Rutinas;
import pe.edu.upc.energypassion.entities.Trainer;
import pe.edu.upc.energypassion.repositories.IRutinasRepository;
import pe.edu.upc.energypassion.serviceinterface.IRutinasService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RestController
public class RutinasServiceImpl implements IRutinasService {
    @Autowired
    private IRutinasRepository r;

    @Override
    public void insert(Rutinas rutinas){r.save(rutinas);}
    @Override
    public List<Rutinas> list(){return r.findAll();}

    @Override
    public void delete(int idRutinas) { r.deleteById(idRutinas);}

    @Override
    public  List<Rutinas>search(int idRutinas){return r.buscarIDrutinas(idRutinas);}

}