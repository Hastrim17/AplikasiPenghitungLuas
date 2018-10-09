package com.hastrim.hitungluasv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    //todo 1 luas persegi membuat method luasPersegi
    public void luasPersegi(View view){
        //todo 2 luas persegi membuat object menuju halaman punya persegi 
        Intent pindah = new Intent(MenuActivity.this,LuasPersegiActivity.class);
        //todo 3 menjalankan staractivity
        startActivity(pindah);

    }
}
