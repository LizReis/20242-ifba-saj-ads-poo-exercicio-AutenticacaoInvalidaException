package model;

import java.util.UUID;

public class Usuario extends AbstractModel<UUID>{
    private String login, senha;

    public Usuario(String login, String senha){
        this.setLogin(login);
        this.setSenha(senha);
    }

    public String getLogin(){
        return this.login;
    }
    private void setLogin(String login){
        this.login = login;
    }

    public String getSenha(){
        return this.senha;
    }
    private void setSenha(String senha){
        this.senha = senha;
    }

   
}