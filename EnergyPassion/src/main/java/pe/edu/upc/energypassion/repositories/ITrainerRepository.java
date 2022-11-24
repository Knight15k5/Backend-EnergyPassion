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
    @Query("FROM Trainer t WHERE t.nombre LIKE %:nametrainer")
    List<Trainer> buscarNombre(@Param("nametrainer") String nametrainer);

}
