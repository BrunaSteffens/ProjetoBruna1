package com.example.projetobruna1.model.model;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.example.projetobruna1.R;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getIntent().getIntExtra("userId", -1);
        Log.d(TAG, "onCreate: começando a bagaça");
        setContentView(R.layout.activity_main);

        findViewById(R.id.button1).setOnClickListener(
                (view) -> {
                    Log.d(TAG, "onCreate: Chamando a tela de login");
                    Intent intent = new Intent(view.getContext(), ActivityLogin.class);
                    startActivity(intent);
                }
        );
    }
}



