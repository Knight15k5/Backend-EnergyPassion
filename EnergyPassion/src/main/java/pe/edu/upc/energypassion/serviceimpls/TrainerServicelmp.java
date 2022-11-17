package pe.edu.upc.energypassion.serviceimpls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.energypassion.entities.Trainer;
import pe.edu.upc.energypassion.repositories.ITrainerRepository;
import pe.edu.upc.energypassion.serviceinterface.ITrainerService;

import java.util.Date;
import java.util.Optional;
import java.util.List;
@Service
public class TrainerServicelmp implements ITrainerService {
    @Autowired
    private ITrainerRepository tR;
    @Override
    public void insert(Trainer trainer){tR.save(trainer);}
    @Override
    public List<Trainer>list(){return tR.findAll();}

    @Override
    public void delete(int idTRainer) { tR.deleteById(idTRainer);}

    @Override
    public List<Trainer> search(String nameTrainer) {return tR.buscarNombre(nameTrainer);}

    @Override
    public List<Trainer> buscarApellido(String apellido) {
        return tR.findByApellido(apellido);
    }

    @Override
    public List<Trainer> buscarComplejo() {
        return tR.buscarComplejo();
    }


}
