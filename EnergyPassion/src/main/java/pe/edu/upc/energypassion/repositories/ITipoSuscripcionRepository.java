package pe.edu.upc.energypassion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.energypassion.entities.Tipo_Suscripcion;

import java.util.List;


@Repository
public interface ITipoSuscripcionRepository extends JpaRepository<Tipo_Suscripcion,Integer> {
    //JPQL
    @Query("FROM Tipo_Suscripcion p WHERE cast(p.idTipoSuscripcion as string )  LIKE %:idTipoSuscripcion")
    List<Tipo_Suscripcion> buscarTipoSuscripcion(@Param("idTipoSuscripcion") int idTipoSuscripcion);
}
