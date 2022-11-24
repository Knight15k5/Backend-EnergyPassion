package pe.edu.upc.energypassion.repositories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.energypassion.entities.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Date;

@Repository
public interface ITrainerRepository extends JpaRepository<Trainer,Integer> {
    //JPQL
    @Query("FROM Trainer t WHERE t.nombret LIKE %:nameTrainer")
    List<Trainer> buscarNombre(@Param("nameTrainer") String nameTrainer);

    List<Trainer> findByApellido(String valor);

    @Query(value = "SELECT trainer.nombret,calificaiones.id_calificacion,rutinas.id_rutinas from trainer INNER join calificaiones ON trainer.id_calificacion=calificaiones.id_calificacion INNER join rutinas ON trainer.id_rutinas = rutinas.id_rutinas", nativeQuery = true)
    List<String[]> buscarComplejo();

}
