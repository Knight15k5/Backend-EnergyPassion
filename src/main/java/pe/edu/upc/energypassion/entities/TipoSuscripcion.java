package pe.edu.upc.energypassion.entities;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TipoSuscripcion")
public class TipoSuscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoSuscripcion;


    @Column(name = "Descripcion_tipo", length = 45, nullable = false)
    private int Descripcion_tipo;


    public TipoSuscripcion() {
        super();
        // TODO Auto-generated constructor stub
    }

    public TipoSuscripcion(int idTipoSuscripcion, int descripcion_tipo) {
        this.idTipoSuscripcion = idTipoSuscripcion;
        this.Descripcion_tipo = descripcion_tipo;
    }

    public int getIdTipoSuscripcion() {
        return idTipoSuscripcion;
    }

    public void setIdTipoSuscripcion(int idTipoSuscripcion) {
        this.idTipoSuscripcion = idTipoSuscripcion;
    }

    public int getDescripcion_tipo() {
        return Descripcion_tipo;
    }

    public void setDescripcion_tipo(int descripcion_tipo) {
        Descripcion_tipo = descripcion_tipo;
    }

}
