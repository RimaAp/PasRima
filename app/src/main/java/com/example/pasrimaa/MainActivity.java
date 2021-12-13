package com.example.pasrimaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    CircleImageView imgBali, imgAceh, imgMinang, imgToraja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBali = (CircleImageView) findViewById(R.id.bali2);
        imgAceh = (CircleImageView) findViewById(R.id.aceh2);
        imgMinang = (CircleImageView) findViewById(R.id.minang2);
        imgToraja = (CircleImageView) findViewById(R.id.toraja2);

        imgBali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBali = new Intent(MainActivity.this, KetBali.class);
                startActivity(pindahBali);
            }
        });

        imgAceh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahAceh = new Intent(MainActivity.this, KetAceh.class);
                startActivity(pindahAceh);
            }
        });

        imgMinang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahMinang = new Intent(MainActivity.this, KetMinang.class);
                startActivity(pindahMinang);
            }
        });

        imgToraja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahToraja = new Intent(MainActivity.this, KetToraja.class);
                startActivity(pindahToraja);
            }
        });

    }
}