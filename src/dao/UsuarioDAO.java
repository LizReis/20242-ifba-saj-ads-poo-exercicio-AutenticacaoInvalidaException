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
        return buscarTodos().stream().sorted(Comparator.comparing(Usuario::getLogin)).collect(Collectors.toList());
    }

    public String autenticar(String login, String senha) throws ExceptionAutenticacaoInvalida{
        for(Usuario usuario : buscarTodos()){
            if(usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)){
                return "Usuário autenticado";
            }
        }
        throw new ExceptionAutenticacaoInvalida("Usuário inexistente ou senha incorreta!");
    }
}