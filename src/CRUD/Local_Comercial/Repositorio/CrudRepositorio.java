package CRUD.Local_Comercial.Repositorio;
import CRUD.Local_Comercial.Modelo.Store;
import java.util.List;

public interface CrudRepositorio {
    Store findById(int id);
    List<Store> findAll();
    void save(Store store);
    void update(Store store);
    void delete(Store store);
}