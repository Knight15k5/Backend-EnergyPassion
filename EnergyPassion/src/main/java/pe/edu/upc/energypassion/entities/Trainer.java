package pe.edu.upc.energypassion.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name = "Trainer")
public class Trainer implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTrainer;
    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;
    @Column(name = "apellido", length = 45, nullable = false)
    private String apellido;
    @Column(name = "horario", length = 45, nullable = false)
    private String horario;
    @Column(name = "edad", length = 45, nullable = false)
    private String edad;
    @Column(name = "sexo", length = 45, nullable = false)
    private String sexo;
    @Column(name = "nickname", length = 45, nullable = false)
    private String nickname;
    @Column(name = "password", length = 45, nullable = false)
    private String password;
    @Column(name = "email", length = 45, nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "idRutinas", nullable = false)
    private Rutinas rutinas;
    @ManyToOne
    @JoinColumn(name = "idCalificacion", nullable = false)
    private Calificaciones calificaciones;

    public Trainer() {
    }
    public Trainer(int idTrainer, String nombre, String apellido, String horario, String edad, String sexo, String nickname, String password, String email, Rutinas rutinas, Calificaciones calificaciones) {
        this.idTrainer = idTrainer;
        this.nombre = nombre;
        this.nickname = nickname;
        this.horario=horario;
        this.email=email;
        this.edad=edad;
        this.apellido=apellido;
        this.password=password;
        this.sexo=sexo;
        this.rutinas=rutinas;
        this.calificaciones=calificaciones;
    }

    public int getIdTrainer() {
        return idTrainer;
    }

    public void setIdTrainer(int idTrainer) {
        this.idTrainer = idTrainer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {return apellido;}

    public void setApellido(String apellido) {this.apellido = apellido;}

    public String getHorario() {return horario;}

    public void setHorario(String horario) {this.horario = horario;}

    public String getEdad() {return edad;}

    public void setEdad(String edad) {this.edad = edad;}

    public String getSexo() {return sexo;}

    public void setSexo(String sexo) {this.sexo = sexo;}

    public String getNickname() {return nickname;}

    public void setNickname(String nickname) {this.nickname = nickname;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public Rutinas getRutinas() {return rutinas;}

    public void setRutinas(Rutinas rutinas) {this.rutinas = rutinas;}

    public Calificaciones getCalificaciones() {return calificaciones;}

    public void setCalificaciones(Calificaciones calificaciones) {this.calificaciones = calificaciones;}
}
