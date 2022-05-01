/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AuthorityLogin;

/**
 *
 * @author DELL
 */
public class TypeVehicleModel {
    
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "customer_id")
    int id;
    String name;
    String fees;
    private boolean isPatient;
    public boolean isIsPatient() {
        return isPatient;
    }

    public void setIsPatient(boolean isPatient) {
        this.isPatient = isPatient;
    }

    public TypeVehicleModel(int id, String name, String fees) {
        this.id = id;
        this.name = name;
        this.fees = fees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFees() {
        return fees;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public TypeVehicleModel() {
    }

    @Override
    public String toString() {
        return "TypeVehicleModel{" + "id=" + id + ", name=" + name + ", fees=" + fees + '}';
    }

    
}
