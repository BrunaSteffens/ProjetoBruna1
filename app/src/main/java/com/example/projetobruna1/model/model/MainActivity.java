package com.example.projetobruna1.model.model;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.projetobruna1.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getIntent().getIntExtra("userId",-1);
        Log.d(TAG, "onCreate: começando a bagaça");
        setContentView(R.layout.activity_main);

        /*
        Button acesso = (Button) findViewById(R.id.button1);
        acesso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Chamando a tela de login");
                Intent intent = new Intent(view.getContext(), ActivityLogin.class );
                startActivity(intent);
            }
        }); */

        findViewById(R.id.button1).setOnClickListener(
                (view) -> {
                    Log.d(TAG, "onCreate: Chamando a tela de login");
                    Intent intent = new Intent(view.getContext(), ActivityLogin.class );
                    startActivity(intent);
                }
        );

        /*Log.d(TAG, "Iniciando tela de login");

        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Alguém clicou");
                Intent intent = new Intent(view.getContext(), User.class);

                startActivity(intent);
            }
        }; */
    }


    @Override
    public void onClick(View view) {

    }
}