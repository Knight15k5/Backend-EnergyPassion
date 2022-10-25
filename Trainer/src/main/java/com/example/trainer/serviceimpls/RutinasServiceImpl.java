package com.example.trainer.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.trainer.entities.Rutinas;
import com.example.trainer.repositories.IRutinasRepository;
import com.example.trainer.serviceinterfaces.IRutinasService;

import java.util.List;

@Service
public class RutinasServiceImpl implements IRutinasService {
    @Autowired
    private IRutinasRepository r;
    @Override
    public void insert(Rutinas rutinas){r.save(rutinas);}
    @Override
    public List<Rutinas> list(){return r.findAll();}

    @Override
    public void delete(int idRutinas){
        r.deleteById(idRutinas);
    }

    @Override
    public  List<Rutinas>search(String Tren_superior){return r.buscarIDrutinas(Tren_superior);}


}