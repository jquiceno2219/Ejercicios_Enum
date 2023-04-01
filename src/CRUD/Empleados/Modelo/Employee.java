package CRUD.Empleados.Modelo;

public class Employee {
    public Integer Id;
    private String employeeName;
    private long employeePhone;
    private short employeeAge;
    public String employeePosition;

    public Employee(Integer id, String employeeName, Short employeeAge, long employeePhone, String employeePosition){
        Id = id;
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
        this.employeeAge = employeeAge;
        this.employeePosition = employeePosition;
    }

    public  Integer getId(){
        return Id;
    }
    public void setId(Integer id) {Id = id;}

    public String getEmployeeName() {return employeeName;}
    public void setEmployeeName(String employeeName) {this.employeeName = employeeName;}
    public long getEmployeePhone(){ return employeePhone;}
    public void setEmployeePhone(Integer employeePhone) { this.employeePhone = employeePhone;}
    public long getEmployeeAge(){ return employeeAge;}
    public void setEmployeeAge(byte employeeAge) { this.employeeAge = employeeAge;}

    public String getEmployeePosition() {return employeePosition;}
    public void setEmployeePosition(String employeePosition) {this.employeePosition = employeePosition;}

    @Override
    public String toString() {
        return "Employees ->" +
                "Id= " + Id +
                ", Employee Name= " + employeeName + '\'' +
                ", Employee Phone= " + employeePhone + '\'' +
                ", Employee Age= " + employeeAge + "'\'" +
                ", Employee Position= " + employeePosition ;
    }
}
