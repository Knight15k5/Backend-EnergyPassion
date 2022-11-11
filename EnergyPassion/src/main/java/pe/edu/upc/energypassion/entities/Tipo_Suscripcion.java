package pe.edu.upc.energypassion.entities;
import javax.persistence.*;

@Entity
@Table(name = "Tipo_Suscripcion")
public class Tipo_Suscripcion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoSuscripcion;


    @Column(name = "Descripcion_tipo", length = 45, nullable = false)
    private int Descripcion_tipo;


    public Tipo_Suscripcion() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Tipo_Suscripcion(int idTipoSuscripcion, int descripcion_tipo) {
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
