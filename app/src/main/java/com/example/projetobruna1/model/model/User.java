package com.example.projetobruna1.model.model;

import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.example.projetobruna1.App;
import java.util.ArrayList;
import java.util.List;

public class User extends AppCompatActivity {

    private static final String TAG = "UserActivity";
    private int id;
    private String name;
    private String userLogin;
    private String password;
    private boolean validacao = false;

    private static List<User> usersList;

    public User() {
    }

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

    public static void getUsers() {
            usersList.add(new User(1, "Jean", "jp1", "1234"));
            usersList.add(new User(2, "Jean 2", "jp2", "1234"));
            usersList.add(new User(3, "Jean 3", "jp3", "1234"));
            usersList.add(new User(4, "Jean 4", "jp4", "1234"));
            usersList.add(new User(11, "Bruna 11", "bs11", "1234"));
            usersList.add(new User(12, "Bruna 12", "bs12", "1234"));
            usersList.add(new User(13, "Bruna 13", "bs13", "1234"));
            usersList.add(new User(14, "Bruna 14", "bs14", "1234"));
        }

    public void validarUsuario(String userLogin, String password) {
        for (User user : usersList) {
            if ((user.getUserLogin() == userLogin) && (user.getPassword() == password)) {
                Log.d(TAG, "onCreate: Login validado");
                Intent intent = new Intent(getApplicationContext(), App.class);
                startActivity(intent);
            }
            else{
                Toast.makeText(this, "Usuário ou senha incorretos", Toast.LENGTH_LONG).show();
            }
        }

    };
}



