package CRUD.VehicleWorkflow.Repositorio;

import CRUD.VehicleWorkflow.Modelo.Workshop;
import java.util.ArrayList;
import java.util.List;

public class CrudRepositorioImpl implements CrudRepositorio {

    private  List<Workshop> workshopList;
    public CrudRepositorioImpl() { workshopList = new ArrayList<>();}

    @Override
    public Workshop findByPlate(int licensePlate) {
        return workshopList.stream()
                .filter(workflow -> workflow.getLicensePlate() == licensePlate)
                .findFirst()
                .orElse( null);
    }

    @Override
    public  List<Workshop> findAll() {return workshopList;}

    @Override
    public void save (Workshop workshop) {
        workshopList.add(workshop);}

    @Override
    public void update(Workshop workshop) {
        Workshop oldWorkshop = findByPlate(workshop.getLicensePlate());
        if (oldWorkshop != null){
            workshopList.remove(oldWorkshop);
            workshopList.add(workshop);
        }
    }
    @Override
    public void delete(Workshop workshop) { workshopList.remove(workshop); }
}