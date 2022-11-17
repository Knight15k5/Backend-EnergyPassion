package pe.edu.upc.energypassion.serviceinterface;
import pe.edu.upc.energypassion.entities.Cliente;
import pe.edu.upc.energypassion.entities.Trainer;

import java.util.List;
public interface IClienteService {
    public void insert(Cliente cliente);
    List<Cliente>list();
    public void delete(int idCli);
    List<Cliente>search(String nameCli);
    List<Cliente>buscarApellidoC(String apellido);
    List<Cliente> buscarComplejo();
}
