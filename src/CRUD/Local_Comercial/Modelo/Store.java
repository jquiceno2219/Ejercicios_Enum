package CRUD.Local_Comercial.Modelo;

public class Store {
    private Integer Id;
    private String StoreName;
    private String Owner;
    private String Address;
    private String Phone;
    private String Category;
    private String Description;

    public Store(Integer id, String storeName, String owner, String address, String phone, String category, String description) {
        Id = id;
        this.StoreName = storeName;
        this.Owner = owner;
        this.Address = address;
        this.Phone = phone;
        this.Category = category;
        this.Description = description;
    }


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }
    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }
    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }
    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "Store ->" +
                "Id=" + Id +
                ", Store Name='" + StoreName + '\'' +
                ", Owner='" + Owner + '\'' +
                ", Address=" + Address + '\'' +
                ", Phone Number='" + Phone + '\'' +
                ", Category='" + Category + '\'' +
                ", Store Description='" + Description + '\'' ;
    }
}