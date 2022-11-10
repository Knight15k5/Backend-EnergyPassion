package pe.edu.upc.energypassion.serviceimpls;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.energypassion.entities.Reserva;
import pe.edu.upc.energypassion.repositories.IReservaRepository;
import pe.edu.upc.energypassion.serviceinterface.IReservaService;

public class ReservaServicelpm implements IReservaService {

    @Autowired
    private IReservaRepository sR;
    @Override
    @Transactional
    public void insertar(Reserva reserva) {
        sR.save(reserva);
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
    public List<Reserva> buscarDia(Date Fecha) {
        return null;
    }

    @Override
    public List<Reserva> buscar(String mensaje) {
        return sR.buscar(mensaje);
    }

    @Override
    public List<Reserva> buscarHora(Time Hora) {
        return null;
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
