package pe.edu.upc.energypassion.serviceimpls;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.energypassion.entities.Tipo_Suscripcion;
import pe.edu.upc.energypassion.repositories.ITipoSuscripcionRepository;
import pe.edu.upc.energypassion.serviceinterface.ITipoSuscripcionService;

import java.util.List;

@Service
public class TipoSuscripcionServiceImpl implements ITipoSuscripcionService {
    @Autowired
    private ITipoSuscripcionRepository sR;
    @Override
    @Transactional
    public void insert(Tipo_Suscripcion tipo_suscripcion){sR.save(tipo_suscripcion);}
    @Override
    public List<Tipo_Suscripcion>list(){return sR.findAll();}

    @Override
    @Transactional
    public void delete(int idTipoSuscripcion) { sR.deleteById(idTipoSuscripcion);}

    @Override
    public List<Tipo_Suscripcion> search(int idTipoSuscripcion) {return sR.buscarTipoSuscripcion(idTipoSuscripcion);}

}
