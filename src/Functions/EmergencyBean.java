/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Functions;

/**
 *
 * @author Covid
 */
public class EmergencyBean {
    private int id;
    private String emergency_type;
    private String description;
    private String location;
    private String time;

    public EmergencyBean(String emergency_type, String description, String location) {
        this.emergency_type = emergency_type;
        this.description = description;
        this.location = location;
    }

    public EmergencyBean(String emergency_type, String description, String location, String time) {
        this.emergency_type = emergency_type;
        this.description = description;
        this.location = location;
        this.time = time;
    }
    

    public EmergencyBean(int id, String emergency_type, String description, String location) {
        this.id = id;
        this.emergency_type = emergency_type;
        this.description = description;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public EmergencyBean() {
    }

    public String getEmergency_type() {
        return emergency_type;
    }

    public void setEmergency_type(String emergency_type) {
        this.emergency_type = emergency_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
}
