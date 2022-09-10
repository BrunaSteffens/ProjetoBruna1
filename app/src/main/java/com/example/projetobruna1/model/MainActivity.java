package com.example.projetobruna1.model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.projetobruna1.R;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getIntent().getIntExtra("userId",-1);
        Log.d(TAG, "onCreate: começando a bagaça");
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Iniciando onCreate");

        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Alguém clicou");
                Intent intent = new Intent(view.getContext(), User.class);

                startActivity(intent);
            }
        };
    }
}