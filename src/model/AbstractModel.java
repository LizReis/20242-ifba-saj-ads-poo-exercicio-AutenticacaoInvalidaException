package model;

public abstract class AbstractModel<T>{
    private T id;

    public T getId(){
        return this.id;
    }
    public void setId(T id){
        this.id = id;
    }
    
}