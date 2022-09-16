package com.example.projetobruna1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityLogin extends AppCompatActivity {
    private final String TAG = "ActivityLogin";


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        EditText user = findViewById(R.id.editTextUsuario);
        EditText password = findViewById(R.id.editTextPassword);

        User user3 = new User();
        User.getUsers();

        findViewById(R.id.buttonConfirmar).setOnClickListener(v -> {
            String login = user.getText().toString();
            String senha = password.getText().toString();
            if(user3.autenticar(login, senha)){
                Intent app = new Intent(getApplicationContext(), App.class);
                startActivity(app);
            }
            if(!user3.autenticar(login, senha)){
                Toast.makeText(getApplicationContext(), "Usuário ou senha incorretos", Toast.LENGTH_LONG).show();
            }

        });

    }

}
