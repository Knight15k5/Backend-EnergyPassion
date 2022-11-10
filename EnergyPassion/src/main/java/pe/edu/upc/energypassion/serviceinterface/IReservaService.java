package pe.edu.upc.energypassion.serviceinterface;
import java.sql.Time;
import java.text.Format;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Timer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.Jsr310Converters;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upc.energypassion.entities.Calificaciones;
import pe.edu.upc.energypassion.entities.Reserva;

import javax.persistence.Convert;

public interface IReservaService {
    public void insertar(Reserva Reserva);

    public void eliminar(int idReserva);

    Optional<Reserva> listarId(int idReserva);

    List<Reserva> listar();

    List<Reserva> buscarDia (Date Fecha);

    List<Reserva> buscar(String mensaje);

    List<Reserva> buscarHora (Time Hora);
    List<Reserva> buscarCliente (String Nombre);
    List<Reserva> buscarTrainer (String Nombre);



}
