package model;

public abstract class AbstractModel<T>{
    private T id;
    private String senha;

    public AbstractModel(String senha){
        this.setSenha(senha);
    }

    public T getId(){
        return this.id;
    }
    public void setId(T id){
        this.id = id;
    }
    
    
    public String getSenha(){
        return this.senha;
    }
    private void setSenha(String senha){
        this.senha = senha;
    }
}