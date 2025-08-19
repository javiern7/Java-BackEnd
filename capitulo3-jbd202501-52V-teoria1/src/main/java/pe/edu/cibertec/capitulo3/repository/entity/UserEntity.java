package pe.edu.cibertec.capitulo3.repository.entity;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Base64;

@Entity
@Table(name = "user")
public class UserEntity {

    @Size(min = 3, max = 15)
    @Id
    private String user;
    @NotNull
    @NotBlank
    private String password;
    @Column(name = "fullname")
    private String fullName;

    private byte[] foto;

    private String foto64;

    String respuesta = null;


    public String getUser() {
        return user;
    }

    public UserEntity setUser(String user) {
        this.user = user;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public UserEntity setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public byte[] getFoto() {
        return foto;
    }

    public UserEntity setFoto(byte[] foto) {
        this.foto = foto;
        return this;
    }

    public String getFoto64() {
        if(foto!=null&&foto.length>0)
            respuesta = Base64.getEncoder().encodeToString(foto);
        return respuesta;
    }

    public UserEntity setFoto64(String foto64) {
        this.foto64 = foto64;
        return this;
    }
}
