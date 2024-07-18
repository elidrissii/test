package com.javaCDG.CDGp.dtos;

import java.io.Serializable;

public class UserDto implements Serializable {
    private String id;
    private String email;
    private String mdp;

    //getters & setters

    public String getId() { return id; }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.mdp = password;
    }

}
