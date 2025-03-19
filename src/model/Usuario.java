package model;

import java.util.UUID;

public class Usuario extends AbstractModel<UUID>{
    private String nome;

    public Usuario(String senha, String nome){
        super(senha);
        this.setNome(nome);
    }

    public String getNome(){
        return this.nome;
    }
    private void setNome(String nome){
        this.nome = nome;
    }

   
}