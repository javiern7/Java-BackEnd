package pe.edu.cibertec.dto;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class UsuarioDto {

    @Size(min=3, max=20)
    private String usuario;
    @NotEmpty
    @NotBlank
    private String clave;
    private String nombreCompleto;
    private byte[] foto;

    public UsuarioDto() {
    }

    public UsuarioDto(String usuario, String clave, String nombreCompleto) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombreCompleto = nombreCompleto;
    }

    public String getUsuario() {
        return usuario;
    }

    public UsuarioDto setUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public String getClave() {
        return clave;
    }

    public UsuarioDto setClave(String clave) {
        this.clave = clave;
        return this;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public UsuarioDto setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
        return this;
    }

    public byte[] getFoto() {
        return foto;
    }

    public UsuarioDto setFoto(byte[] foto) {
        this.foto = foto;
        return this;
    }
}
