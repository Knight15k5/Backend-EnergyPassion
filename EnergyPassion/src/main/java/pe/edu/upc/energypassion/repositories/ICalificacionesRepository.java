package pe.edu.upc.energypassion.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.energypassion.entities.Calificaciones;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICalificacionesRepository  extends JpaRepository<Calificaciones,Integer> {
    @Query("from  Calificaciones  c " + "where  c.calificado like %:calificado ")
    List<Calificaciones> buscarCalificado(@Param("calificado")String calificado);
}
