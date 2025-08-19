package pe.edu.cibertec.dao.entity;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuario")
public class UsuarioEntity {
    @Size(min=3, max=10)
    @Id
    private String usuario;
    @NotNull
    @NotBlank
    @Column(nullable = false)
    private String clave;
    @Column(name = "nomCompleto")
    private String nombreCompleto;
    @Transient
    private byte[] foto;

    public UsuarioEntity() {
    }

    public UsuarioEntity(String usuario, String clave, String nombreCompleto, byte[] foto) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombreCompleto = nombreCompleto;
        this.foto = foto;
    }

    public String getUsuario() {
        return usuario;
    }

    public UsuarioEntity setUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public String getClave() {
        return clave;
    }

    public UsuarioEntity setClave(String clave) {
        this.clave = clave;
        return this;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public UsuarioEntity setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
        return this;
    }

    public byte[] getFoto() {
        return foto;
    }

    public UsuarioEntity setFoto(byte[] foto) {
        this.foto = foto;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UsuarioEntity{usuario=").append(usuario);
        sb.append(", clave=").append(clave);
        sb.append(", nombreCompleto=").append(nombreCompleto);
        sb.append('}');
        return sb.toString();
    }
}
