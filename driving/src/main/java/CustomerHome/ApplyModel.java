/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomerHome;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author KOUSALYAA
 */
public class ApplyModel {
    int cid;
    String id;
    String vehilcename;
    int vehicle_id;
    String drivingschoolname;
    int drivingschool_id;
    LocalDate applydate;
    
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

        
    public ApplyModel() {
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public int getDrivingschool_id() {
        return drivingschool_id;
    }

    public void setDrivingschool_id(int drivingschool_id) {
        this.drivingschool_id = drivingschool_id;
    }

    public ApplyModel(int cid, int vehicle_id, int drivingschool_id, LocalDate applydate) {
        this.cid = cid;
        this.vehicle_id = vehicle_id;
        this.drivingschool_id = drivingschool_id;
        this.applydate = applydate;
    }

  

    public ApplyModel(int cid,String vname, String dsname, LocalDate adate) {
        this.cid = cid;
        this.vehilcename = vname;
        this.drivingschoolname = dsname;
        this.applydate = adate;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public String getVehilcename() {
        return vehilcename;
    }

    public void setVehilcename(String vehilcename) {
        this.vehilcename = vehilcename;
    }

    public String getDrivingschoolname() {
        return drivingschoolname;
    }

    public void setDrivingschoolname(String drivingschoolname) {
        this.drivingschoolname = drivingschoolname;
    }

    public LocalDate getApplydate() {
        return applydate;
    }

    public void setApplydate(LocalDate applydate) {
        this.applydate = applydate;
    }

    @Override
    public String toString() {
        return "ApplyModel{" + "id=" + id + ", vehilcename=" + vehilcename + ", vehicle_id=" + vehicle_id + ", drivingschoolname=" + drivingschoolname + ", drivingschool_id=" + drivingschool_id + ", applydate=" + applydate + '}';
    }

    
    

}
