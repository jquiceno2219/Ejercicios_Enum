package CRUD.VehicleWorkflow.Modelo;

public class Workshop {

    public Integer licensePlate;
    private String ownerName;

    public String entryDate;
    private long ownerPhone;
    public String model;
    public String brand;

    public Workshop(Integer licensePlate, String ownerName, String entryDate, long ownerPhone, String model, String brand){
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.entryDate = entryDate;
        this.ownerPhone = ownerPhone;
        this.model = model;
        this.brand = brand;
    }

    public Integer getLicensePlate() { return licensePlate;}

    public void setLicensePlate(Integer licensePlate) { this.licensePlate = licensePlate;}

    public String getOwnerName() { return ownerName;}

    public void setOwnerName(String ownerName) { this.ownerName = ownerName;}

    public String getEntryDate() { return entryDate;}

    public void setEntryDate(String entryDate) { this.entryDate = entryDate;}

    public long getOwnerPhone() { return ownerPhone;}

    public void setOwnerPhone(long ownerPhone) { this.ownerPhone = ownerPhone;}

    public String getModel() { return model;}

    public void setModel(String model) { this.model = model;}

    public String getBrand() { return brand;}

    public void setBrand(String brand) { this.brand = brand;}

    @Override
    public String toString() {
        return "Workshop ->" +
                "License Plate= " + licensePlate +
                ", Owner Name= " + ownerName + '\'' +
                ", Date= " + entryDate + '\'' +
                ", Owner Phone= "+ ownerPhone + '\'' +
                ", Model= " + model + "'\'" +
                ", Brand= " + brand ;
    }
}