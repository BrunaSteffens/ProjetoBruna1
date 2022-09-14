package com.example.projetobruna1.model.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;
    private String name;
    private String userLogin;
    private String password;
    private boolean validacao = false;

    private static List<User> usersList;


    public User(int id, String name, String userLogin, String password) {
        this.id = id;
        this.name = name;
        this.userLogin = userLogin;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static List<User> getUsers() {
        if (usersList == null) {
            usersList = new ArrayList<>();
            usersList.add( new User(1, "Jean", "jp1", "1234"));
            usersList.add( new User(2, "Jean 2", "jp2", "1234"));
            usersList.add( new User(3, "Jean 3", "jp3", "1234"));
            usersList.add( new User(4, "Jean 4", "jp4", "1234"));
            usersList.add( new User(11, "Bruna 11", "bs11", "1234"));
            usersList.add( new User(12, "Bruna 12", "bs12", "1234"));
            usersList.add( new User(13, "Bruna 13", "bs13", "1234"));
            usersList.add( new User(14, "Bruna 14", "bs14", "1234"));
        }
        return usersList;
    }

    public void validarUsuario(){
        for (User user: usersList){
            if((user.getUserLogin()==userLogin)&&(user.getPassword()==password)){
                validacao=true;
            }
        }
    }
}
