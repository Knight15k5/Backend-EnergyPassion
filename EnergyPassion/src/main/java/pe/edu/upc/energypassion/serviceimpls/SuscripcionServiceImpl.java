package pe.edu.upc.energypassion.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.energypassion.entities.Suscripcion;
import pe.edu.upc.energypassion.repositories.ISuscripcionRepository;
import pe.edu.upc.energypassion.serviceinterface.ISuscripcionService;

import java.util.List;


@Service

public class SuscripcionServiceImpl implements ISuscripcionService{
    @Autowired
    private ISuscripcionRepository sR;
    @Override
    @Transactional
    public void insert(Suscripcion suscripcion) {
        sR.save(suscripcion);

    }

//    @Override
//    public Optional<Vehiculo> listarId(int idVehiculo) {
//
//        return dVehiculo.findById(idVehiculo);
//    }
//

    @Override
    public List<Suscripcion> list() {
        return sR.findAll();
    }

    @Override
    @Transactional
    public void delete(int idSuscripcion) { sR.deleteById(idSuscripcion);}

    @Override
    public List<Suscripcion> search(String Descripcion_plan) {return sR.buscarSuscripcions(Descripcion_plan);}


}
