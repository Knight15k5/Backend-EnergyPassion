package pe.edu.upc.energypassion.serviceimpls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.energypassion.entities.Suscripcion;
import pe.edu.upc.energypassion.repositories.ISuscripcionRepository;
import pe.edu.upc.energypassion.serviceinterface.ISuscripcionService;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service

public class SuscripcionServiceImpl implements ISuscripcionService{
    @Autowired
    private ISuscripcionRepository sR;
    @Override
    @Transactional
    public void insert(Suscripcion suscripcion) {
        sR.save(suscripcion);
    }

    @Override
    public List<Suscripcion> list() {
        return sR.findAll();
    }

    @Override
    @Transactional
    public void delete(int idsuscripcion) { sR.deleteById(idsuscripcion);}

    @Override
    public List<Suscripcion> search(String Descripcion_plan) {return sR.buscarSuscripcions(Descripcion_plan);}


}
