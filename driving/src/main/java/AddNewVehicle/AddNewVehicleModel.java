package AddNewVehicle;

//@Entity
//@Table(name = "customer")
public class AddNewVehicleModel {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "customer_id")
    int id;
    String name;
    String anfees;

    public AddNewVehicleModel(int id, String name, String anfees) {
        this.id = id;
        this.name = name;
        this.anfees = anfees;
    }

    public AddNewVehicleModel() {
    }

    AddNewVehicleModel(String name, String fees) {
        this.name = name;
        this.anfees = fees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAnfees() {
        return anfees;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnfees(String anfees) {
        this.anfees = anfees;
    }

    @Override
    public String toString() {
        return "AddNewVehicleModel{" + "id=" + id + ", name=" + name + ", anfees=" + anfees + '}';
    }

}
