package pe.edu.upc.energypassion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.energypassion.entities.Cliente;
import pe.edu.upc.energypassion.entities.RespuestaCliente;

import java.util.List;

public interface IClienteRepository extends JpaRepository<Cliente,Integer> {

    @Query("from Cliente cli " + " where cli.Nombre like %:Nombre")
    List<Cliente> buscarnombreCliente(@Param("Nombre") String Nombre);

   @Query(value = "SELECT clientes.nombre,rutinas.id_rutinas,suscripcion.descripcion_plan\n" +
            "from clientes INNER join rutinas ON clientes.id_rutinas = rutinas.id_rutinas\n" +
            "INNER join suscripcion ON clientes.id_suscripcion = suscripcion.id_suscripcion",nativeQuery = true)
    List<String[]> buscarComplejo();

}
