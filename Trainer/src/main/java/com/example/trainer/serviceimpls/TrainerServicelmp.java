package com.example.trainer.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.trainer.entities.Trainer;
import com.example.trainer.repositories.ITrainerRepository;
import com.example.trainer.serviceinterfaces.ITrainerService;

import java.util.List;

@Service
public class TrainerServicelmp implements ITrainerService {

    @Autowired
    private ITrainerRepository tR;
@Override
public void insert(Trainer trainer){tR.save(trainer);}
@Override
public List<Trainer>list(){return tR.findAll();}

}
