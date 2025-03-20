import java.util.UUID;

import dao.UsuarioDAO;
import exception.ExceptionAutenticacaoInvalida;
import model.Usuario;

public class Main{
    public static void main(String[] args) {
        Usuario usuario01 = new Usuario("Liz", "123");
        Usuario usuario02 = new Usuario("Mel", "123h");

        UsuarioDAO userDao = new UsuarioDAO(UUID.class);

        userDao.salvar(usuario01);
        userDao.salvar(usuario02);

        try {
            System.out.println(userDao.autenticar("Mel", "123h"));
        } catch (ExceptionAutenticacaoInvalida e) {
            System.out.println("Erro: " + e);
        }





        
    }
}
