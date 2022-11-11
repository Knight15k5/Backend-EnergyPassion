package pe.edu.upc.energypassion.entities;

import javax.persistence.*;

@Entity
@Table(name = "Clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    @Column(name = "Nombre", length = 45, nullable = false)
    private String Nombre;

    @Column(name = "Apellido", length = 45, nullable = false)
    private String Apellido;

    @Column(name = "fechanacimiento", length = 45, nullable = false)
    private String fechanacimiento;

    @Column(name = "edad", length = 45, nullable = false)
    private int edad;

public Cliente(){}

    public Cliente(int idCliente, String nombre, String Apellido, String fechanacimiento, int edad) {
        this.idCliente = idCliente;
        this.Nombre = nombre;
        this.Apellido = Apellido;
        this.fechanacimiento = fechanacimiento;
        this.edad = edad;
    }

    public int getId() {
        return idCliente;
    }

    public void setId(int id) {
        this.idCliente = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}