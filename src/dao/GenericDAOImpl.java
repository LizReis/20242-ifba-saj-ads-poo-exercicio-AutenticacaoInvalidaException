

public class GenericDAOImpl<T extends AbstractModel<ID>, ID> implements GenericDAO<T, ID>{
    private Map<ID, T> bancoDeUsuarios = new HashMap<>();
    private final Class<ID> tipoIdClass;

    public GenericDAOImpl(Class<ID> tipoIdClass){
        this.tipoIdClass = tipoIdClass;
    }

    public ID salvar(T entidade){

    }

    private ID gerarNovoId(){
        if(tipoIdClass.equals(UUID.class())){
            return tipoIdClass.cast(UUID.randomUUID());
        }
        return null;
    }
}