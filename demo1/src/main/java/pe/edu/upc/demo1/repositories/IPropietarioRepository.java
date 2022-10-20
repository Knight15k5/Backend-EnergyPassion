package pe.edu.upc.demo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demo1.entities.Propietario;

@Repository
public interface IPropietarioRepository extends JpaRepository<Propietario,Integer> {



}
