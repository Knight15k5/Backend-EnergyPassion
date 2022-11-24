package pe.edu.upc.energypassion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.energypassion.entities.Rutinas;


import java.util.List;

@Repository
public interface IRutinasRepository extends JpaRepository<Rutinas,Integer> {

    @Query("from Rutinas r " + " where cast(r.idrutinas as string) like %:idrutinas ")
    List<Rutinas> buscarIDrutinas(@Param("idrutinas") int idrutinas);
}