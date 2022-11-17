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
 @Query("FROM Suscripcion p WHERE p.Descripcion_plan LIKE %:Descripcion_plan")
 List<Suscripcion> buscarSuscripcions(@Param("Descripcion_plan") String Descripcion_plan);

 @Query(value = "SELECT suscripcion.descripcion_plan, tipo_suscripcion.id_tipo_suscripcion\n" +
         "FROM suscripcion INNER join tipo_suscripcion ON suscripcion.id_tipo_suscripcion = tipo_suscripcion.id_tipo_suscripcion",nativeQuery = true)
 List<Suscripcion> buscarComplejo();
}
