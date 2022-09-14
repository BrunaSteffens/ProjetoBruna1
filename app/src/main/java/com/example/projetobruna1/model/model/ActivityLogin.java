package com.example.projetobruna1.model.model;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.projetobruna1.R;
import com.example.projetobruna1.databinding.ActivityLoginBinding;

public class ActivityLogin extends AppCompatActivity {
    private final String TAG = "ActivityLogin";
    //private ActivityLoginBinding layout;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ActivityLoginBinding layout = DataBindingUtil.setContentView(this, R.layout.activity_login); //isto é o databinding da linha abaixo
        //setContentView(R.layout.activity_login);
        Button confirmar = (Button) findViewById(R.id.botaoConfirmar);
        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText user = (EditText) findViewById(R.id.editTextUsuario);
                EditText password = (EditText) findViewById(R.id.editTextPassword);
                String login = user.getText().toString();
                String senha = password.getText().toString();

                //User.validarUsuario;

            }
        });




        User user1 = User.getUsers().get(0);
        Log.d(TAG, "onCreate: Buscando o usuário ");
        User user2 = User.getUsers().get(1);

        layout.setUser(user1);

    }
}
