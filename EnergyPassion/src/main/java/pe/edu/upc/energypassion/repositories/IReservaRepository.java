package pe.edu.upc.energypassion.repositories;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.energypassion.entities.Reserva;
@Repository
public interface IReservaRepository extends JpaRepository<Reserva, Integer> {
    @Query("from Reserva r where r.Mensaje like %:Mensaje%")
    List<Reserva> buscar(@Param("Mensaje") String Mensaje);
    @Query("from Reserva r where r.Trainer.nombre like %:nombre%")
    List<Reserva> buscarTrainer(@Param("nombre") String nombre);
    @Query("from Reserva r where r.Cliente.Nombre like %:Nombre%")
    List<Reserva> buscarCliente(@Param("Nombre") String Nombre);

   /* @Query("from Reserva r where r.Hora like %:Hora%")
    List<Reserva> buscarHora(@Param("nombre") String nombre);*/


}
