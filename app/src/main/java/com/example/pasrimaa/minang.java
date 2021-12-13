package com.example.pasrimaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class minang extends AppCompatActivity {
    Button btnBackMinang1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minang);
        btnBackMinang1 = (Button) findViewById(R.id.minang1);

        btnBackMinang1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnMinang1 = new Intent(minang.this, MainActivity.class);
                startActivity(pindahBtnMinang1);
            }
        });


    }
}