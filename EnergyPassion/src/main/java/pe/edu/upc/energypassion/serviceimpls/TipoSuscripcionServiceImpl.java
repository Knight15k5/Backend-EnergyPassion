package pe.edu.upc.energypassion.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.energypassion.entities.TipoSuscripcion;
import pe.edu.upc.energypassion.repositories.ITipoSuscripcionRepository;
import pe.edu.upc.energypassion.serviceinterface.ISuscripcionService;
import pe.edu.upc.energypassion.serviceinterface.ITipoSuscripcionService;

import java.util.List;
import java.util.Optional;

@Service
public class TipoSuscripcionServiceImpl implements ITipoSuscripcionService{
    @Autowired
    private ITipoSuscripcionRepository sR;
    @Override
    @Transactional
    public void insert(TipoSuscripcion tiposuscripcion){sR.save(tiposuscripcion);}
    @Override
    public List<TipoSuscripcion>list(){return sR.findAll();}

    @Override
    @Transactional
    public void delete(int idTipoSuscripcion) { sR.deleteById(idTipoSuscripcion);}

    @Override
    public List<TipoSuscripcion> search(int idTipoSuscripcion) {return sR.buscarTipoSuscripcion(idTipoSuscripcion);}


}
