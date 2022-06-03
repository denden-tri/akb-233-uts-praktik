package com.denztri.utspraktik_if6_10119233_dendentriana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

/**
 *  Tanggal Pengerjaan  : 03-06-2022
 *  NIM                 : 10119233
 *  Nama                : Denden Triana
 *  Kelas               : IF-6
 *
 */

public class CekActivity extends AppCompatActivity {
    MaterialButton ubah;
    TextView nama;
    TextView nik;
    TextView tglLahir;
    TextView tglKonfir;
    TextView hub;
    TextView kelamin;
    TextView test;

    DataViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek);
        nama = findViewById(R.id.cek_nama);
        nik = findViewById(R.id.cek_nik);
        hub = findViewById(R.id.cek_hub);
        tglKonfir = findViewById(R.id.cek_konfirmasi);
        tglLahir = findViewById(R.id.cek_lahir);
        kelamin = findViewById(R.id.cek_kelamin);
        test = findViewById(R.id.cek_tes);

        ubah = findViewById(R.id.cek_ubah);

        ubah.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), MainActivity.class)));

        Intent intent = getIntent();
        nama.setText(intent.getStringExtra("NAMA"));
        nik.setText(intent.getStringExtra("NIK"));
        tglLahir.setText(intent.getStringExtra("lAHIR"));
        tglKonfir.setText(intent.getStringExtra("KONFIR"));
        kelamin.setText(intent.getStringExtra("KELAMIN"));
        test.setText(intent.getStringExtra("TES"));
    }
}