package com.example.pasrimaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KetMinang extends AppCompatActivity {
    Button btnMinang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_minang);

        btnMinang= (Button) findViewById(R.id.btn_Minang);

        btnMinang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnminang= new Intent(KetMinang.this,minang.class);
                startActivity(pindahBtnminang);
            }
        });
        
    }
}