package pe.edu.cibertec.dao;

import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dto.UsuarioDto;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioDAO {

    private List<UsuarioDto> listaUsuarios = null;

    public UsuarioDAO (){
        listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new UsuarioDto("jose","123456","Jose Perez"));
        listaUsuarios.add(new UsuarioDto("yaddif","54321","Yaddif Medina"));
        listaUsuarios.add(new UsuarioDto("carmen","c1rm3n","Carmen Rios"));
        listaUsuarios.add(new UsuarioDto("maria","m2ria","Maria Quispe"));
    }

    public void insertarUsuario(UsuarioDto usuario){
        listaUsuarios.add(usuario);
    }

    public List<UsuarioDto> getListaUsuarios() {
        return listaUsuarios;
    }

    public UsuarioDto getUsuario(String codigo) {
        UsuarioDto rpta = null;
        for (UsuarioDto usuario : listaUsuarios) {
            if (usuario.getUsuario().equalsIgnoreCase(codigo)) {
                rpta = usuario;
                break;
            }
        }
        return rpta;
    }

    public UsuarioDto validarLogin(UsuarioDto usuario){
        if("user".equalsIgnoreCase(usuario.getUsuario()) && "12345".equalsIgnoreCase(usuario.getClave()))
            usuario.setNombreCompleto("Nombre completo del usuario");
        else
            usuario = null;
        return usuario;
    }
}
