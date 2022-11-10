package pe.edu.upc.energypassion.serviceimpls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  pe.edu.upc.energypassion.entities.Calificaciones;
import pe.edu.upc.energypassion.repositories.ICalificacionesRepository;
import pe.edu.upc.energypassion.serviceinterface.ICalificacionService;

import javax.transaction.Transactional;
import  java.util.List;
import java.util.Optional;

@Service
public class CalificacionesServiceelmp implements ICalificacionService {
    @Autowired
    private ICalificacionesRepository pR ;
    @Override
    @Transactional
    public void insert(Calificaciones calificacion){Calificaciones calificaciones=pR.save(calificacion);    }
    @Override
    public Optional<Calificaciones> listarId(int idCalificacion) {

        return pR.findById(idCalificacion);
    }
    @Override
    public List<Calificaciones> list(){return pR.findAll();}

    @Override
    @Transactional
    public void delete(int idCalificacion) {
    pR.deleteById(idCalificacion);
    }

    @Override
    public Optional<Calificaciones> listarid(int idCalificacion) {
        return Optional.empty();
    }

    @Override
    public List<Calificaciones> search(String nameCalificacion) {
        return pR.buscarCalificado(nameCalificacion);
    }
    @Override
    public List<Calificaciones> searchP(String nombre) {
        return pR.buscarTrainer(nombre);
    }

}
