package AuthorityLogin;

//@Entity
//@Table(name = "customer")
public class AuthorityModel {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "customer_id")
    int id;
    long mobile;
    String password;

    public AuthorityModel(long mob, String upass) {
        this.mobile = mob;
        this.password = upass;
    }

    public int getId() {
        return id;
    }

    public long getMobile() {
        return mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AuthorityModel() {
    }

    public AuthorityModel(int id, long mobile, String password) {
        this.id = id;
        this.mobile = mobile;
        this.password = password;
    }

    @Override
    public String toString() {
        return "AuthorityModel{" + "id=" + id + ", mobile=" + mobile + ", password=" + password + '}';
    }

}
