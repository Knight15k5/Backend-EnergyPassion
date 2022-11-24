package pe.edu.upc.energypassion.repositories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.energypassion.entities.Suscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ISuscripcionRepository extends JpaRepository<Suscripcion,Integer> {
 //JPQL
 @Query("FROM Suscripcion p WHERE p.descripcion_plan LIKE %:descripcion_plan")
 List<Suscripcion> buscarSuscripcions(@Param("descripcion_plan") String descripcion_plan);
}
