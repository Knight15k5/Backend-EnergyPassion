package pe.edu.upc.energypassion.entities;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tiposuscripcion")
public class TipoSuscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtiposuscripcion;


    @Column(name = "Descripcion_tipo", length = 45, nullable = false)
    private int descripcion_tipo;

    public TipoSuscripcion(int idtiposuscripcion, int descripcion_tipo) {
        this.idtiposuscripcion = idtiposuscripcion;
        this.descripcion_tipo = descripcion_tipo;
    }

    public TipoSuscripcion() {
        super();
    }


    public int getIdtiposuscripcion() {
        return idtiposuscripcion;
    }

    public void setIdtiposuscripcion(int idtiposuscripcion) {
        this.idtiposuscripcion = idtiposuscripcion;
    }

    public int getDescripcion_tipo() {
        return descripcion_tipo;
    }

    public void setDescripcion_tipo(int descripcion_tipo) {
        this.descripcion_tipo = descripcion_tipo;
    }
}
