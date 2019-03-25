package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.labo3.utilities.AppConstants;

public class Activity_two extends AppCompatActivity {

    private TextView txt_name, txt_email, txt_pass, txt_genero;

    private Button mBtn_share;

    private String name, pass, email, genero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        txt_name = findViewById(R.id.txtv_name);
        txt_email = findViewById(R.id.txtv_email);
        txt_pass = findViewById(R.id.txtv_pass);
        txt_genero = findViewById(R.id.txtv_genero);

        mBtn_share = findViewById(R.id.btn_share);

        Intent mIntent = getIntent();

        if (mIntent != null) {
            name = mIntent.getStringExtra(AppConstants.TEXT_NAME);
            pass = mIntent.getStringExtra(AppConstants.TEXT_PASS);
            email = mIntent.getStringExtra(AppConstants.TEXT_EMAIL);
            genero = mIntent.getStringExtra(AppConstants.TEXT_GENERO);

            txt_name.setText(String.valueOf(name));
            txt_email.setText(String.valueOf(email));
            txt_pass.setText(String.valueOf(pass));
            txt_genero.setText(String.valueOf(genero));
        }

        mBtn_share.setOnClickListener(v->{
            Intent mIntentShare = getIntent();
            mIntentShare.setAction(Intent.ACTION_SEND);
            mIntentShare.setType("text/plain");

            mIntentShare.putExtra(Intent.EXTRA_TEXT,"Nombre: " + txt_name.getText().toString() + " " + "Contraseña: " + txt_pass.getText().toString()
                    + " " + "Email: " + txt_email.getText().toString() + " " + "Genero: " + txt_genero.getText().toString());
            startActivity(mIntentShare);
        });
    }
}
