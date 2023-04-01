package CRUD.VehicleWorkflow.Repositorio;

import CRUD.VehicleWorkflow.Modelo.Workshop;
import java.util.List;

public interface CrudRepositorio {
    Workshop findByPlate(int licensePlate);
    List<Workshop> findAll();
    void save(Workshop workshop);
    void update(Workshop workshop);
    void delete(Workshop workshop);
}