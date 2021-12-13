package com.example.pasrimaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KetAceh extends AppCompatActivity {
    Button btnAceh1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_aceh);
        btnAceh1= (Button) findViewById(R.id.btn_aceh);

        btnAceh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnAceh1= new Intent(KetAceh.this, Aceh.class);
                startActivity(pindahBtnAceh1);
            }
        });
    }
}