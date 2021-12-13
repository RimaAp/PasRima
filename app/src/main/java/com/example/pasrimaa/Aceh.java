package com.example.pasrimaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aceh extends AppCompatActivity {
    Button BtnBackAceh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aceh);

        Button btnBackAceh = (Button) findViewById(R.id.aceh1);

        btnBackAceh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnAceh= new Intent(Aceh.this, MainActivity.class);
                startActivity(pindahBtnAceh);
            }
        });


    }
}