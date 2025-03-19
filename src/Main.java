import java.util.UUID;

import dao.GenericDAOImpl;
import dao.UsuarioDAO;
import exception.ExceptionAutenticacaoInvalida;
import model.Usuario;

public class Main{
    public static void main(String[] args) {
        Usuario usuario01 = new Usuario("123", "Liz");
        Usuario usuario02 = new Usuario("123h", "Mel");

        GenericDAOImpl gn01 = new GenericDAOImpl<>(UUID.class);
        UsuarioDAO user01 = new UsuarioDAO(UUID.class);

        UUID id01 = (UUID) gn01.salvar(usuario01);
        UUID id02 = (UUID) gn01.salvar(usuario02);

        try {
            System.out.println(user01.autenticar(id01, "123"));
        } catch (ExceptionAutenticacaoInvalida e) {
            System.out.println("Erro: " + e);
        }





        
    }
}
