package pe.edu.upc.energypassion.serviceinterface;

import pe.edu.upc.energypassion.entities.Reserva;
import java.util.Date;
import java.util.List;
import java.util.Optional;


public interface IReservaService {
    public boolean insertar(Reserva Reserva);

    public void eliminar(int idReserva);

    Optional<Reserva> listarId(int idReserva);

    List<Reserva> listar();

    List<Reserva> buscar(String mensaje);

    List<Reserva> buscarCliente (String Nombre);
    List<Reserva> buscarTrainer (String Nombre);



}
