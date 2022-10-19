package com.example.trainer.serviceinterfaces;

import com.example.trainer.entities.Trainer;

import java.util.List;

public interface ITrainerService {
    public void insert(Trainer trainer);
    List<Trainer>list();
}
