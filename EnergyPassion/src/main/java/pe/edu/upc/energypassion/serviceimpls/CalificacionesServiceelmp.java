package pe.edu.upc.energypassion.serviceimpls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  pe.edu.upc.energypassion.entities.Calificaciones;
import pe.edu.upc.energypassion.repositories.ICalificacionesRepository;
import pe.edu.upc.energypassion.serviceinterface.ICalificacionService;

import  java.util.List;
@Service
public class CalificacionesServiceelmp implements ICalificacionService {
    @Autowired
    private ICalificacionesRepository pR ;
    @Override
    public void insert(Calificaciones calificacion){pR.save(calificacion);}
    @Override
    public List<Calificaciones> list(){return pR.findAll();}

    @Override
    public void delete(int idcalificacion) {
        pR.deleteById(idcalificacion);
    }
    @Override
    public List<Calificaciones> search(String calificado) {
        return pR.buscarCalificado(calificado);
    }
}
