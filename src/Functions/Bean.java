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
public class Bean {
    private String full_name;
    private String email;
    private String username;
    private String password;

    public Bean(String full_name, String email, String username, String password) {
        this.full_name = full_name;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Bean() {
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
