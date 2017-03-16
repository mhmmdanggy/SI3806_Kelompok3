package com.example.indovent.SI3806_Kelompok3;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Activity {

    Button b1;
    EditText ed1, ed2;
    TextView tx1;
    TextView signup;
    TextView forgotpas;

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

        signup = (TextView) findViewById(R.id.signup);
        forgotpas = (TextView) findViewById(R.id.forgotpass);

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
    }
        public void signup(View view){
        Intent i = new Intent(getApplicationContext(), Register.class);
        startActivity(i);
    }
    public void forgotpas(View view){
        Intent intent = new Intent(getApplicationContext(), forgot_password.class);
        startActivity(intent);
    }
}


