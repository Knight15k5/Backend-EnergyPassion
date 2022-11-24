package pe.edu.upc.energypassion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.energypassion.entities.Cliente;
import pe.edu.upc.energypassion.entities.RespuestaCliente;

import java.util.List;

public interface IClienteRepository extends JpaRepository<Cliente,Integer> {

    @Query("from Cliente cli " + " where cli.nombre like %:nombre")
    List<Cliente> buscarnombreCliente(@Param("nombre") String nombre);

   @Query(value = "SELECT clientes.nombre,rutinas.idrutinas,suscripcion.descripcion_plan\n" +
            "from clientes INNER join rutinas ON clientes.idrutinas = rutinas.idrutinas\n" +
            "INNER join suscripcion ON clientes.idsuscripcion = suscripcion.idsuscripcion",nativeQuery = true)
    List<String[]> buscarComplejo();

}
