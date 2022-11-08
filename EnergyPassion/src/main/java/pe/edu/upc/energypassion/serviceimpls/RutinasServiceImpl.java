package pe.edu.upc.energypassion.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.energypassion.entities.Rutinas;
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
    @Transactional
    public boolean insert(Rutinas rutinas){
        Rutinas objrutinas = r.save(rutinas);
        if(objrutinas == null){
           return false;
        }else {
            return true;
        }

    }
    @Override
    public List<Rutinas> list(){return r.findAll();}

    @Override
    @Transactional
    public void delete(int idRutinas){
        r.deleteById(idRutinas);
    }

    @Override
    public  List<Rutinas>search(String Tren_superior){return r.buscarIDrutinas(Tren_superior);}


}