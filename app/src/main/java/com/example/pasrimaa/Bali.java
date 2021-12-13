package com.example.pasrimaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bali extends AppCompatActivity {
    Button btnBackBali1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bali);
        btnBackBali1=(Button) findViewById(R.id.bali1);

        btnBackBali1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnBali1 = new Intent(Bali.this, MainActivity.class);
                startActivity(pindahBtnBali1);
            }
        });

    }
}