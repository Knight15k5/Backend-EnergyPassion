package pe.edu.upc.demo1.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo1.entities.Propietario;
import pe.edu.upc.demo1.repositories.IPropietarioRepository;
import pe.edu.upc.demo1.serviceinterfaces.IPropietarioService;

import java.util.List;
@Service
public class PropietarioServiceImpl implements IPropietarioService {
    @Autowired
    private IPropietarioRepository pR;
    @Override
    public void insert(Propietario propietario) {
        pR.save(propietario);
    }

    @Override
    public List<Propietario> list() {
        return pR.findAll();
    }
}
