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
    private int idcliente;
    @Column(name = "Nombre", length = 45, nullable = false)
    private String nombre;

    @Column(name = "Apellido", length = 45, nullable = false)
    private String apellido;

    @Column(name = "fechanacimiento", length = 45, nullable = false)
    private String fechanacimiento;

    @Column(name = "edad", length = 45, nullable = false)
    private int edad;

    @Column(name = "peso", length = 45, nullable = false)
    private int peso;
    @Column(name = "sexo", length = 45, nullable = false)
    private String sexo;
    @Column(name = "email", length = 45, nullable = false)
    private String email;
    @Column(name = "talla", length = 45, nullable = false)
    private String talla;
    @Column(name = "password", length = 45, nullable = false)
    private String password;
    @Column(name = "username", length = 45, nullable = false)
    private String username;
    @Column(name = "CondicionFisica", length = 45, nullable = false)
    private String condfisica;
    @Column(name = "ObjetivoFisico", length = 45, nullable = false)
    private String objetivofisico;

    @ManyToOne
    @JoinColumn(name = "idSuscripcion", nullable = false)
    private Suscripcion suscripcion;

    @ManyToOne
    @JoinColumn(name = "idRutinas", nullable = false)
    private Rutinas rutinas;


    public Cliente() {
        super();
    }

    public Cliente(int idcliente, String nombre, String apellido, String fechanacimiento, int edad, int peso, String sexo, String email, String talla, String password, String username, String condfisica, String objetivofisico, Suscripcion suscripcion, Rutinas rutinas) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanacimiento = fechanacimiento;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
        this.email = email;
        this.talla = talla;
        this.password = password;
        this.username = username;
        this.condfisica = condfisica;
        this.objetivofisico = objetivofisico;
        this.suscripcion = suscripcion;
        this.rutinas = rutinas;
    }


    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCondfisica() {
        return condfisica;
    }

    public void setCondfisica(String condfisica) {
        this.condfisica = condfisica;
    }

    public String getObjetivofisico() {
        return objetivofisico;
    }

    public void setObjetivofisico(String objetivofisico) {
        this.objetivofisico = objetivofisico;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }

    public Rutinas getRutinas() {
        return rutinas;
    }

    public void setRutinas(Rutinas rutinas) {
        this.rutinas = rutinas;
    }
}