package com.example.suscripcion.repositories;

import com.example.suscripcion.entities.Suscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ISuscripcionRepository extends JpaRepository<Suscripcion,Integer> {

}
