package pe.edu.upc.energypassion.serviceimpls;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.energypassion.entities.Reserva;
import pe.edu.upc.energypassion.repositories.IReservaRepository;
import pe.edu.upc.energypassion.serviceinterface.IReservaService;

@RestController
public class ReservaServiceImpl implements IReservaService {

    @Autowired
    private IReservaRepository sR;
//    @Override
//    @Transactional
//    public boolean insertar(Reserva reserva) {
//        sR.save(reserva);
//    }

    @Override
    @Transactional
    public boolean insertar(Reserva reserva) {
        Reserva objReserva = sR.save(reserva);
        if (objReserva == null) {
            return false;
        } else {
            return true;
        }
    }


    @Override
    @Transactional
    public void eliminar(int idReserva) {
        sR.deleteById(idReserva);
    }

    @Override
    public Optional<Reserva> listarId(int idReserva) {
        return Optional.empty();
    }

    @Override
    public List<Reserva> listar() {
        return sR.findAll();
    }

    @Override
    public List<Reserva> buscar(String mensaje) {
        return sR.buscar(mensaje);
    }


    @Override
    public List<Reserva> buscarCliente(String Nombre) {
        return sR.buscarCliente(Nombre);
    }

    @Override
    public List<Reserva> buscarTrainer(String Nombre) {
        return sR.buscarTrainer(Nombre);
    }
}
