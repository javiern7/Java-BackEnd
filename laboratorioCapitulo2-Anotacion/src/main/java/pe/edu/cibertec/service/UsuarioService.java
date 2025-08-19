package pe.edu.cibertec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dto.UsuarioDto;
import pe.edu.cibertec.dao.UsuarioDAO;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioDAO usuarioDAO;

    public UsuarioDto validarLogin(UsuarioDto usuario) {
        return usuarioDAO.validarLogin(usuario);
    }

    public void insertarUsuario(UsuarioDto usuario) {
        usuarioDAO.insertarUsuario(usuario);
    }

    public List<UsuarioDto> getListaUsuarios() {
        return usuarioDAO.getListaUsuarios();
    }

    public UsuarioDto getUsuario(String codigo) {
        return usuarioDAO.getUsuario(codigo);
    }
}
