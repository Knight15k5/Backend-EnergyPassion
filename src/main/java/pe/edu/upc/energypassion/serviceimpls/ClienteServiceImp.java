package pe.edu.upc.energypassion.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.energypassion.entities.Cliente;
import pe.edu.upc.energypassion.repositories.IClienteRepository;
import pe.edu.upc.energypassion.serviceinterface.IClienteService;

import java.util.List;

@Service
public class ClienteServiceImp implements IClienteService {
    @Autowired
    private IClienteRepository cli;
    @Override
    public void insert(Cliente clie ){cli.save(clie);}
    @Override
    public List<Cliente> list(){return cli.findAll();}

    @Override
    public void delete(int idCli){
        cli.deleteById(idCli);
    }

    @Override
    public  List<Cliente>search(String nameCliente){return cli.buscarnombreCliente(nameCliente);}

}
