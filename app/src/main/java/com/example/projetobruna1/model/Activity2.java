package com.example.projetobruna1.model;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.projetobruna1.R;

public class Activity2 extends AppCompatActivity {
    private final String TAG = "Activity2";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Activity2Binding layout = DataBindingUtil.setContentView(this, R.layout.activity_login); //isto é o databinding da linha abaixo
        //setContentView(R.layout.activity_login);
        User user1 = User.getUsers().get(0);
        Log.d(TAG, "onCreate: ");
        layout.setUser(user1);

    }
}
