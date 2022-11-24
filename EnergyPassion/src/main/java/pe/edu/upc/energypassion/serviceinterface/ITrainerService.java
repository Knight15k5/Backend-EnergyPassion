package pe.edu.upc.energypassion.serviceinterface;

import pe.edu.upc.energypassion.entities.Trainer;

import java.util.List;

public interface ITrainerService {
    public void insert(Trainer trainer);
    List<Trainer>list();
    public void delete(int idtrainer);
    List<Trainer> search(String nameTrainer);


}
