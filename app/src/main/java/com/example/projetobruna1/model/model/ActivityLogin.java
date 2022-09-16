package com.example.projetobruna1.model.model;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;
import androidx.databinding.DataBindingUtil;

import com.example.projetobruna1.App;
import com.example.projetobruna1.R;
import com.example.projetobruna1.databinding.ActivityLoginBinding;

public class ActivityLogin extends AppCompatActivity {
    private final String TAG = "ActivityLogin";


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ActivityLoginBinding layout = DataBindingUtil.setContentView(this, R.layout.activity_login);
        //isto de cima é o databinding da linha abaixo
        //setContentView(R.layout.activity_login);
        EditText user = (EditText) findViewById(R.id.editTextUsuario);
        EditText password = (EditText) findViewById(R.id.editTextPassword);
        User.getUsers();
        Button confirmar = (Button) findViewById(R.id.botaoConfirmar);


        confirmar.setOnClickListener(view -> {
            String login = user.getText().toString();
            String senha = password.getText().toString();
            User user3 = new User();

            if(user3.autenticar(login, senha)){
                Intent app = new Intent(getApplicationContext(), App.class);
                startActivity(app);
            }
            if(!user3.autenticar(login, senha)){
                    Toast.makeText(this, "Login ou senha incorretos", Toast.LENGTH_LONG).show();
            }

        });
    }

}
