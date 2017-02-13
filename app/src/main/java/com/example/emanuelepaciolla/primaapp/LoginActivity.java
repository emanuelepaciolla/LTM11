package com.example.emanuelepaciolla.primaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class LoginActivity extends Activity implements View.OnClickListener {
    EditText nome;
    EditText pass;
    TextView login;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login=(TextView) findViewById(R.id.Login);
        login.setOnClickListener(this);
        nome = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
    }

    @Override
    public void onClick(View v) {
            if (!(nome.getText().toString().equals(""))){
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
    }}
}
