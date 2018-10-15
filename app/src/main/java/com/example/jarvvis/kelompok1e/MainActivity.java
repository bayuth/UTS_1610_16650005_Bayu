package com.example.jarvvis.kelompok1e;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText un, pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        un = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String un_key = un.getText().toString();
                String pass_key = pass.getText().toString();

                if(un_key.equals("admin") && pass_key.equals("admin")){
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, tampilan2a.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }else{
                    AlertDialog.Builder dialog= new AlertDialog.Builder(MainActivity.this);
                    dialog.setMessage("User Atau Password Anda Salah !").setNegativeButton("Retry", null).create().show();
                }

            }
        });
    }
}
