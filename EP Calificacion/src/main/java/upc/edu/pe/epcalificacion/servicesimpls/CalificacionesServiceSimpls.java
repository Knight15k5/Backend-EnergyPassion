package upc.edu.pe.epcalificacion.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.epcalificacion.entities.Calificaciones;
import upc.edu.pe.epcalificacion.repositories.ICalificacionesRepository;
import upc.edu.pe.epcalificacion.serviceinterfaces.ICalificacionService;

import java.util.List;

@Service
public class CalificacionesServiceSimpls implements ICalificacionService {
    @Autowired
    private ICalificacionesRepository pR ;
    @Override
    public void insert(Calificaciones calificacion){pR.save(calificacion);}
    @Override
    public List<Calificaciones> list(){return pR.findAll();}
}
