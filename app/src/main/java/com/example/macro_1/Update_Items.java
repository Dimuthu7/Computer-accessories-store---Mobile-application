package com.example.macro_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Update_Items extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update__items);
    }

    public void setUpdate(View view){

        Intent intent1 = new Intent(Update_Items.this,Store.class);
        startActivity(intent1);
    }
}
