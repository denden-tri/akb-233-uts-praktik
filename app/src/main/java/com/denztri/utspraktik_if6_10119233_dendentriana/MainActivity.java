package com.denztri.utspraktik_if6_10119233_dendentriana;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *  Tanggal Pengerjaan  : 03-06-2022
 *  NIM                 : 10119233
 *  Nama                : Denden Triana
 *  Kelas               : IF-6
 *
 */

public class MainActivity extends AppCompatActivity {
    final Calendar myCal = Calendar.getInstance();
    final Calendar myCal2 = Calendar.getInstance();
    TextInputEditText date;
    TextInputEditText date2;
    TextInputEditText nama;
    TextInputEditText nik;
    MaterialButton nextBtn;

    RadioGroup radioGroupTes;
    RadioGroup radioGroupHub;
    RadioGroup radioGroupKelamin;

    DataViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nama = findViewById(R.id.main_name_input);
        nik = findViewById(R.id.main_nik_input);
        nextBtn = findViewById(R.id.main_button);
        viewModel = new ViewModelProvider(this).get(DataViewModel.class);
        date = findViewById(R.id.main_tlg_input);

        radioGroupTes = findViewById(R.id.main_radio_group);
        radioGroupHub = findViewById(R.id.main_radio_hub);
        radioGroupKelamin = findViewById(R.id.main_radio_kelamin);

        DatePickerDialog.OnDateSetListener dateSetListener = (datePicker, i, i1, i2) -> {
            myCal.set(Calendar.YEAR, i);
            myCal.set(Calendar.YEAR, i1);
            myCal.set(Calendar.YEAR, i2);
            updateLabel();
        };

        DatePickerDialog.OnDateSetListener dateSetListener2 = (datePicker, i, i1, i2) -> {
            myCal2.set(Calendar.YEAR, i);
            myCal2.set(Calendar.YEAR, i1);
            myCal2.set(Calendar.YEAR, i2);
            updateLabel2();
        };

        date.setOnClickListener(view -> new DatePickerDialog(MainActivity.this,
                dateSetListener,
                myCal.get(Calendar.YEAR),
                myCal.get(Calendar.MONTH),
                myCal.get(Calendar.DAY_OF_MONTH)).show());

        date2 = findViewById(R.id.main_tlg_lahir_input);
        date2.setOnClickListener(view -> new DatePickerDialog(MainActivity.this,
                dateSetListener2,
                myCal2.get(Calendar.YEAR),
                myCal2.get(Calendar.MONTH),
                myCal2.get(Calendar.DAY_OF_MONTH)).show());


        nextBtn.setOnClickListener(view -> nextOnClick());
    }

    private void updateLabel(){
        String dateFormat = "MM/dd/yy";
        SimpleDateFormat dateFormat1 = new SimpleDateFormat(dateFormat, Locale.US);
        date.setText(dateFormat1.format(myCal.getTime()));
    }
    private void updateLabel2(){
        String dateFormat = "MM/dd/yy";
        SimpleDateFormat dateFormat1 = new SimpleDateFormat(dateFormat, Locale.US);
        date2.setText(dateFormat1.format(myCal.getTime()));
    }

    private void nextOnClick(){
        Intent intent = new Intent(this, CekActivity.class);
        intent.putExtra("lAHIR",date2.getText().toString());
        intent.putExtra("KONFIR",date.getText().toString());
        intent.putExtra("NAMA",nama.getText().toString());
        intent.putExtra("NIK",nik.getText().toString());


        if (radioGroupTes.getChildAt(0).isSelected()){
            intent.putExtra("TES", "Rapid Antigen");
        } else {
            intent.putExtra("TES", "PCR");
        }

        if (radioGroupKelamin.getChildAt(0).isSelected()){
            intent.putExtra("KELAMIN", "Laki - laki");
        } else {
            intent.putExtra("KELAMIN", "Perempuan");
        }

        CheckBox isSetuju = findViewById(R.id.main_check_setuju);
        if (isSetuju.isChecked()){
            startActivity(intent);
        }
    }
}