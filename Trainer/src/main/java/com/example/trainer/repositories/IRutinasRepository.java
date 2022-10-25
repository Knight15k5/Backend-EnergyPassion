package com.example.trainer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.trainer.entities.Rutinas;


import java.util.List;

@Repository
public interface IRutinasRepository extends JpaRepository<Rutinas,Integer> {

    @Query("from Rutinas r " + " where r.Tren_superior like %:Tren_superior ")
    List<Rutinas> buscarIDrutinas(@Param("Tren_superior") String Tren_superior);
}