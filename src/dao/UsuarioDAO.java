package dao;

import model.Usuario;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import exception.ExceptionAutenticacaoInvalida;

public class UsuarioDAO extends GenericDAOImpl<Usuario, UUID>{

    public UsuarioDAO(Class<UUID> tipoIdClass) {
        super(tipoIdClass);
    }

    public List<Usuario> buscarOrdenadosPorNome(){
        return buscarTodos().stream().sorted(Comparator.comparing(Usuario::getNome)).collect(Collectors.toList());
    }

    public String autenticar(UUID id, String senha) throws ExceptionAutenticacaoInvalida{
        Usuario usuario = bancoDeUsuarios.get(senha);

        if(usuario == null && !usuario.getSenha().equals(senha)){
            throw new ExceptionAutenticacaoInvalida("Usuário inexistente ou senha incorreta!");
        }
        return "Usuário autenticado";
    }
}