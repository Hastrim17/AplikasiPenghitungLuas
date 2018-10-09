package com.hastrim.hitungluasv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasPersegiActivity extends AppCompatActivity {
    //todo 1 luas persegi membuat variable global dengan tipe data widget
    EditText edtSisi;
    TextView txtHasil;
    Button btnHitung;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi);
        //todo 2 menginisiaikan object widget
        edtSisi = findViewById(R.id.edtSisi);
        txtHasil = findViewById(R.id.txtHasil);
        btnHitung = findViewById(R.id.btnHitung);

        //todo 3 membuat tombol berfungsi untuk membuat hasil atau mengoutput dari user
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //todo 4 memmasukkan input editText dari user
               Integer sisi = Integer.valueOf(edtSisi.getText().toString());

             //todo 5 memanggil fungtion namanya seperti dibawah ini
             hitungLuasPersegi(sisi);
            }
        });

    }
//todo 5 membuat method hitung luas persegi dengan menggunakan option dan enter
    private void hitungLuasPersegi(Integer sisi) {
        int hasil = sisi * sisi;
        //todo 8 mencetak hasil
        txtHasil.setText(String.valueOf(hasil));
    }



}
