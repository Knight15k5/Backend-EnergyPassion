package upc.edu.pe.epcalificacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import upc.edu.pe.epcalificacion.entities.Calificaciones;

import java.util.List;

@Repository
public interface ICalificacionesRepository  extends JpaRepository<Calificaciones,Integer> {
@Query("from  Calificaciones  c " + "where  c.calificado like %:calificado ")
    List<Calificaciones> buscarCalificado(@Param("calificado")String calificado);
}
