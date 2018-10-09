package com.hastrim.hitungluasv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Todo 1 menginisiasi widget didalam java
        Button btnMasuk = findViewById(R.id.btnMasuk);
        //Todo 2 membuat method onlick
        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo 3 membuat intent pindah halaman dri main ke menu
                Intent pindah = new Intent(MainActivity.this,MenuActivity.class);
                //Todo 4 lalu memamnggil method startActivity untuk berpindah halaman
                startActivity(pindah);
            }
        });
    }
}
