package com.example.indovent.indovent2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button b1;
    EditText ed1, ed2;
    TextView tx1;
    TextView signup;

    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        b1 = (Button) findViewById(R.id.button);
        ed1 = (EditText) findViewById(R.id.Username);
        ed2 = (EditText) findViewById(R.id.Password);

        tx1 = (TextView) findViewById(R.id.textView34);
        tx1.setVisibility(View.GONE);

        signup = (TextView)findViewById(R.id.signup);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                //set username dan password dengan "admin"
                if (ed1.getText().toString().equals("admin") &&
                        ed2.getText().toString().equals("admin"))
                    //kondisi jika login benar
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();
                else {
                    //jika login gagal
                    Toast.makeText(getApplicationContext(), "Username atau Password Anda Salah",
                            Toast.LENGTH_SHORT).show();
                    tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    counter--;
                    tx1.setText(Integer.toString(counter));
                    if (counter == 0) {
                        b1.setEnabled(false);
                    }
                }
            }
        });


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(getApplicationContext(),Register.class);
                //startActivity(i);
            }
        });
        signup.setAutoLinkMask(Linkify.ALL);


    }
}


