package com.example.trainer.repositories;

import com.example.trainer.entities.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.trainer.entities.Trainer;

@Repository
public interface ITrainerRepository extends JpaRepository<Trainer,Integer>{
}
