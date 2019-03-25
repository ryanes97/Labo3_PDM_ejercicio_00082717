package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.labo3.utilities.AppConstants;

public class MainActivity extends AppCompatActivity {

    private EditText editText_name, editText_pass, editText_email, editText_genero;

    private Button mBtn;

    private String name, pass, email, genero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_name = findViewById(R.id.txt_name);
        editText_pass = findViewById(R.id.txt_password);
        editText_email = findViewById(R.id.txt_email);
        editText_genero = findViewById(R.id.txt_genero);

        mBtn = findViewById(R.id.btn_send);

        mBtn.setOnClickListener(v ->{

            name =  editText_genero.getText().toString();
            pass = editText_pass.getText().toString();
            email = editText_email.getText().toString();
            genero = editText_genero.getText().toString();

            Intent mIntent = new Intent(MainActivity.this , Activity_two.class);
            mIntent.putExtra(AppConstants.TEXT_NAME, name);
            mIntent.putExtra(AppConstants.TEXT_PASS,pass);
            mIntent.putExtra(AppConstants.TEXT_EMAIL, email);
            mIntent.putExtra(AppConstants.TEXT_GENERO,genero);
            startActivity(mIntent);

        });


    }
}
