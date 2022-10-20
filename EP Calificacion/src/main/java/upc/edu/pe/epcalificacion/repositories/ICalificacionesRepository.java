package upc.edu.pe.epcalificacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.epcalificacion.entities.Calificaciones;
@Repository
public interface ICalificacionesRepository  extends JpaRepository<Calificaciones,Integer> {

}
