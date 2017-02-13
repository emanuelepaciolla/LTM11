package com.example.emanuelepaciolla.primaapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    Button go;
    Button call;
    Button testo;
    TextView numero;
    TextView indirizzo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        testo=(Button) findViewById(R.id.Email);
        go=(Button) findViewById(R.id.Go);
        call=(Button) findViewById(R.id.Call);
        numero= (TextView) findViewById(R.id.numero);
        indirizzo= (TextView) findViewById(R.id.indirizzo);
        go.setOnClickListener(this);
        call.setOnClickListener(this);
        testo.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        if (v.getId() == R.id.Go){
            intent.setAction(Intent.ACTION_VIEW);
            Uri uri = Uri.parse("geo:0,0?q=" + indirizzo.getText().toString());
            intent.setData(uri);
            startActivity(intent);
        }
        else if (v.getId() == R.id.Call) {
            intent.setAction(Intent.ACTION_VIEW);
            Uri uri = Uri.parse("tel:" + numero.getText().toString());
            intent.setData(uri);
            startActivity(intent);
        }
        else if (v.getId() == R.id.Email){
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.setType("text/plain");
            sendIntent.putExtra(Intent.EXTRA_TEXT, "ciaooooooooo");
            startActivity(sendIntent);
        }
    }
}
