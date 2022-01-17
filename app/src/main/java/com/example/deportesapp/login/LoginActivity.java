package com.example.deportesapp.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.deportesapp.MainActivity;
import com.example.deportesapp.R;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button login, register;
    ArrayList<String> listaUsers = new ArrayList<String>();
    ArrayList<String> listaPass = new ArrayList<String>();

    String nuevoUsuario = getIntent().getStringExtra("USER");
    String nuevaContra = getIntent().getStringExtra("PASSWORD");

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.botonLogin);
        login.setOnClickListener(this);
        register = findViewById(R.id.botonRegister);
        register.setOnClickListener(this);

        if (!nuevoUsuario.equals(null) || !nuevaContra.equals(null)){
            String error = "Error";
            System.out.println(error);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.botonLogin:
                Intent login = new Intent(this, MainActivity.class);
                startActivity(login);
                break;
            case R.id.botonRegister:
                Intent register = new Intent(this, RegisterActivity.class);
                startActivity(register);
                break;
        }
    }
}