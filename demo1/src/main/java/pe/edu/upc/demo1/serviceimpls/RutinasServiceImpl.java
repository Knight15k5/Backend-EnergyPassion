package pe.edu.upc.demo1.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo1.entities.Rutinas;
import pe.edu.upc.demo1.repositories.IRutinasRepository;
import pe.edu.upc.demo1.serviceinterfaces.IRutinasService;

import java.util.List;

@Service
public class RutinasServiceImpl implements IRutinasService {
    @Autowired
    private IRutinasRepository rR;
    @Override
    public void insert(Rutinas rutinas){rR.save(rutinas);}
    @Override
    public List<Rutinas> list(){return rR.findAll();}


}
