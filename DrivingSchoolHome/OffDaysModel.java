/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DrivingSchoolHome;

/**
 *
 * @author sundermetpalli
 */
public class OffDaysModel {
    String id;
    String date;

    public OffDaysModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "OffDaysModel{" + "id=" + id + ", date=" + date + '}';
    }

    public OffDaysModel(String id, String date) {
        this.id = id;
        this.date = date;
    }
    
}
