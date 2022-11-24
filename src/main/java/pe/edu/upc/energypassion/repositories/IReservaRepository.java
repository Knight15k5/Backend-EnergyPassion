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
    @Query("from Reserva r where r.mensaje like %:Mensaje%")
    List<Reserva> buscar(@Param("Mensaje") String Mensaje);
    @Query("from Reserva r where r.trainer.nombre like %:nombre%")
    List<Reserva> buscarTrainer(@Param("nombre") String nombre);
    @Query("from Reserva r where r.cliente.nombre like %:nombre%")
    List<Reserva> buscarCliente(@Param("nombre") String nombre);

   /* @Query("from Reserva r where r.Hora like %:Hora%")
    List<Reserva> buscarHora(@Param("nombre") String nombre);*/

    @Query(value = "SELECT reserva.fecha, clientes.nombre, trainer.nombre, rutinas.idrutinas\n" +
            "FROM reserva INNER join clientes on reserva.cliente = clientes.idcliente\n" +
            "INNER join trainer ON reserva.trainer = trainer.idtrainer\n" +
            "INNER join rutinas ON reserva.rutinas = rutinas.idrutinas", nativeQuery = true)
    List<String[]> buscarComplejo();

}
