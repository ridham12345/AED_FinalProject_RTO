package customerLogin;

//@Entity

//@Entity


//@Entity
//@Table(name = "customer")
public class CustomerModel {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "customer_id")
    int id;
    long mobile;
    String password;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CustomerModel(long mobile, String password) {
        this.mobile = mobile;
        this.password = password;
    }

    public CustomerModel() {
    }

    @Override
    public String toString() {
        return "CustomerModel{" + "id=" + id + ", mobile=" + mobile + ", password=" + password + '}';
    }

    
}