
import java.util.UUID;

public class Usuario extends AbstractModel<UUID>{
    private String nome, login, senha;

    public Usuario(String nome, String login, Stirng senha){
        this.setNome(nome);
        this.setLogin(login);
        this.setSenha(senha);
    }

    public String getNome(){
        return this.nome;
    }
    private void setNome(String nome){
        this.nome = nome;
    }

    public String getLogin() {
        return this.login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    
    
    public String getSenha(){
        return this.senha;
    }
    private void setSenha(String senha){
        this.senha = senha;
    }
}