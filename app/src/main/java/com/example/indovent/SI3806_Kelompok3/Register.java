package com.example.indovent.SI3806_Kelompok3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button btn_regis = (Button) findViewById(R.id.btn_regis);
        btn_regis.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
            }
        });
    }
    public void regtosignin(View view){
        Intent i = new Intent(getApplicationContext(), Login.class);
        startActivity(i);
    }
}