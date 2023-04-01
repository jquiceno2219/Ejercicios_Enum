package CRUD.Local_Comercial.Repositorio;

import CRUD.Local_Comercial.Modelo.Store;
import java.util.ArrayList;
import java.util.List;

public class CrudRepositoryImpl implements CrudRepositorio{
    private List<Store> store;

    public CrudRepositoryImpl() {
        store = new ArrayList<>();
    }

    @Override
    public Store findById(int id) {
        return store.stream()
                .filter(store -> store.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Store> findAll() {
        return store;
    }

    @Override
    public void save(Store store2) {
        store.add(store2);
    }

    @Override
    public void update(Store store2) {
        Store oldStore = findById(store2.getId());
        if (oldStore != null) {
            store.remove(oldStore);
            store.add(store2);
        }
    }

    @Override
    public void delete(Store store2) {
        store.remove(store2);
    }
}

