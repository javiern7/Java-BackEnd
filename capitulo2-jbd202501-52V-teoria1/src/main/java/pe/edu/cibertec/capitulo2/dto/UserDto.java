package pe.edu.cibertec.capitulo2.dto;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDto {

    @Size(min=3,max=15)
    private String user;
    @NotNull
    @NotBlank
    private String password;
    private String fullName;

    private byte[] foto;

    public UserDto() {
    }

    public UserDto(String user, String password, String fullName) {
        this.user = user;
        this.password = password;
        this.fullName = fullName;
    }

    public String getUser() {
        return user;
    }

    public UserDto setUser(String user) {
        this.user = user;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDto setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public UserDto setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public byte[] getFoto() {
        return foto;
    }

    public UserDto setFoto(byte[] foto) {
        this.foto = foto;
        return this;
    }
}
