package pe.edu.upc.energypassion.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
@Entity
@Table(name = "Clientes")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    @Column(name = "Nombre", length = 45, nullable = false)
    private String Nombre;

    @Column(name = "Apellido", length = 45, nullable = false)
    private String apellido;

    @Column(name = "fechanacimiento", length = 45, nullable = false)
    private String fechanacimiento;

    @Column(name = "edad", length = 45, nullable = false)
    private int edad;

    @ManyToOne
    @JoinColumn(name = "idSuscripcion", nullable = false)
    private Suscripcion Suscripcion;

    @ManyToOne
    @JoinColumn(name = "idRutinas", nullable = false)
    private Rutinas Rutinas;
    //suscripcion id
    //rutinas id

public Cliente(){}

    public Cliente(int idCliente, String nombre, String apellido, String fechanacimiento, int edad, pe.edu.upc.energypassion.entities.Suscripcion suscripcion, pe.edu.upc.energypassion.entities.Rutinas rutinas) {
        this.idCliente = idCliente;
        this.Nombre = nombre;
        this.apellido = apellido;
        this.fechanacimiento = fechanacimiento;
        this.edad = edad;
        Suscripcion = suscripcion;
        Rutinas = rutinas;
    }


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public pe.edu.upc.energypassion.entities.Suscripcion getSuscripcion() {
        return Suscripcion;
    }

    public void setSuscripcion(pe.edu.upc.energypassion.entities.Suscripcion suscripcion) {
        Suscripcion = suscripcion;
    }

    public pe.edu.upc.energypassion.entities.Rutinas getRutinas() {
        return Rutinas;
    }

    public void setRutinas(pe.edu.upc.energypassion.entities.Rutinas rutinas) {
        Rutinas = rutinas;
    }
}