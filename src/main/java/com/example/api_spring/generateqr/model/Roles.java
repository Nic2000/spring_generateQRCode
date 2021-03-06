package com.example.api_spring.generateqr.model;

public class Roles {
    private int id;
    private String role_name;
    protected Roles(String role_name) {
        this.role_name = role_name;
    }

    protected Roles() {
    }


    @Override
    public String toString() {
        return "Roles [" + role_name + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
}
