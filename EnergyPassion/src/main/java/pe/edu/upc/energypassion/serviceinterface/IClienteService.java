package pe.edu.upc.energypassion.serviceinterface;
import pe.edu.upc.energypassion.entities.Cliente;

import java.util.List;
public interface IClienteService {
    public void insert(Cliente cliente);
    List<Cliente>list();
    public void delete(int idCli);

    List<Cliente>search(String nameCli);
}
