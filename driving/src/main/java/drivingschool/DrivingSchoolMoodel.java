package drivingschool;

//@Entity


//@Entity
//@Table(name = "customer")
public class DrivingSchoolMoodel {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "customer_id")
    int id;
    String drivingSchoolName;
    int yearOfEstablishment;
    String emailId;
    String currentAddress;
    long mobile;
    String password;
    String contactPersonName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDrivingSchoolName() {
        return drivingSchoolName;
    }

    public void setDrivingSchoolName(String drivingSchoolName) {
        this.drivingSchoolName = drivingSchoolName;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public void setYearOfEstablishment(int yearOfEstablishment) {
        this.yearOfEstablishment = yearOfEstablishment;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
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

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public DrivingSchoolMoodel(String drivingSchoolName, int yearOfEstablishment, String emailId, String currentAddress, long mobile, String password, String contactPersonName) {
        this.drivingSchoolName = drivingSchoolName;
        this.yearOfEstablishment = yearOfEstablishment;
        this.emailId = emailId;
        this.currentAddress = currentAddress;
        this.mobile = mobile;
        this.password = password;
        this.contactPersonName = contactPersonName;
    }

    public DrivingSchoolMoodel() {
    }

    @Override
    public String toString() {
        return "DrivingSchoolMoodel{" + "id=" + id + ", drivingSchoolName=" + drivingSchoolName + ", yearOfEstablishment=" + yearOfEstablishment + ", emailId=" + emailId + ", currentAddress=" + currentAddress + ", mobile=" + mobile + ", password=" + password + ", contactPersonName=" + contactPersonName + '}';
    }    
}