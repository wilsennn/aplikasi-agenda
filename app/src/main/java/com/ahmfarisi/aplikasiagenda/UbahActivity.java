package com.ahmfarisi.aplikasiagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class UbahActivity extends AppCompatActivity {
    private EditText etTanggal, etJam, etKegiatan;
    private Button btnUbah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubah);

        Intent terima = getIntent();
        String yId = terima.getStringExtra("xId");
        String yTanggal = terima.getStringExtra("xTanggal");
        String yJam = terima.getStringExtra("xJam");
        String yKegiatan = terima.getStringExtra("xKegiatan");


        etTanggal = findViewById(R.id.et_tanggal);
        etJam = findViewById(R.id.et_jam);
        etKegiatan = findViewById(R.id.et_kegiatan);
        btnUbah = findViewById(R.id.btn_ubah);
    }
}