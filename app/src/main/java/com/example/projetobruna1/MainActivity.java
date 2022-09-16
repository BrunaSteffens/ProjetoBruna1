package com.example.projetobruna1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getIntent().getIntExtra("userId", -1);
        getSupportActionBar().hide();
        Log.d(TAG, "onCreate: começando a bagaça");
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);

        button1.setOnClickListener(
                (view) -> {
                    Log.d(TAG, "onCreate: Chamando a tela de login");
                    Intent intent = new Intent(view.getContext(), ActivityLogin.class);
                    startActivity(intent);
                }
        );
    }
}



