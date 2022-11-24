package pe.edu.upc.energypassion.repositories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.energypassion.entities.Suscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.energypassion.entities.TipoSuscripcion;

import java.util.List;
@Repository
public interface ITipoSuscripcionRepository extends JpaRepository<TipoSuscripcion,Integer> {

    //JPQL
    @Query("FROM TipoSuscripcion p WHERE cast(p.idtiposuscripcion as string )  LIKE %:idtiposuscripcion")
    List<TipoSuscripcion> buscarTipoSuscripcion(@Param("idtiposuscripcion") int idtiposuscripcion);


}
