package com.example.pasrimaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Toraja extends AppCompatActivity {
    Button btnBackToraja1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toraja);
        btnBackToraja1=(Button) findViewById(R.id.toraja1);

        btnBackToraja1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnToraja1 = new Intent(Toraja.this, MainActivity.class);
                startActivity(pindahBtnToraja1);

            }
        });

    }
}