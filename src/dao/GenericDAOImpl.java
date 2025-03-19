package dao;

import model.AbstractModel;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class GenericDAOImpl<T extends AbstractModel<ID>, ID> implements GenericDAO<T, ID>{
    protected Map<ID, T> bancoDeUsuarios = new HashMap<>();
    private final Class<ID> tipoIdClass;

    public GenericDAOImpl(Class<ID> tipoIdClass){
        this.tipoIdClass = tipoIdClass;
    }

    @Override
    public ID gerarNovoId(){
        if(tipoIdClass.equals(UUID.class)){
            return tipoIdClass.cast(UUID.randomUUID());
        }
        return null;
    }


    @Override
    public ID salvar(T entidade){
        ID novoId = gerarNovoId();

        entidade.setId(novoId);

        bancoDeUsuarios.put(entidade.getId(), entidade);

        return novoId;
    }

    @Override
    public ID atualizar(T entidade) {
        if(bancoDeUsuarios.containsValue(entidade)){
            return this.salvar(entidade);
        }
        return null;
    }

    @Override
    public T buscarPorId(ID id) {
        return bancoDeUsuarios.get(id);
    }

    @Override
    public void deletar(ID id) {
        if(bancoDeUsuarios.containsKey(id)){
            bancoDeUsuarios.remove(id);
        }
    }

    @Override
    public List<T> buscarTodos() {
        return new ArrayList<>(bancoDeUsuarios.values());
    }

}