package com.example.pasrimaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KetBali extends AppCompatActivity {
    Button btnBali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_bali);

        btnBali = (Button) findViewById(R.id.btn_bali);

        btnBali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnBali= new Intent(KetBali.this, Bali.class);
                startActivity(pindahBtnBali);
            }
        });
    }
}