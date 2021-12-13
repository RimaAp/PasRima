package com.example.pasrimaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KetToraja extends AppCompatActivity {
    Button btnBackToraja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_toraja);
        btnBackToraja = (Button) findViewById(R.id.btn_toraja);

        btnBackToraja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnToraja = new Intent(KetToraja.this, Toraja.class);
                startActivity(pindahBtnToraja);
            }
        });
    }
}