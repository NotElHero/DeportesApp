package com.example.deportesapp.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.example.deportesapp.R;

import java.util.ArrayList;

public class RegisterActivity extends Activity implements View.OnClickListener {

    Button crearUsuario;
    EditText newUser, newPass;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_register);

        crearUsuario = findViewById(R.id.botonCrear);
        crearUsuario.setOnClickListener(this);

        newUser = findViewById(R.id.textNewUser);
        newPass = findViewById(R.id.textNewPass);
    }

    @Override
    public void onClick(View v) {
        String nuevoUser = newUser.getText().toString();
        String nuevaContra = newPass.getText().toString();
        Intent newUserCreated = new Intent(this, LoginActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("USER", nuevoUser);
        bundle.putString("PASSWORD", nuevaContra);
        newUserCreated.putExtras(bundle);
        startActivity(newUserCreated);
    }
}
