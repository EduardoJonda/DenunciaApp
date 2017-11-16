package com.example.alumno.denunciaapp.modelo;

/**
 * Created by Alumno on 15/11/2017.
 */


public class User {
    private String name;
    private String correo;
    private String password;

    public User(String name, String correo, String password) {
        this.name = name;
        this.correo = correo;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", correo='" + correo + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
